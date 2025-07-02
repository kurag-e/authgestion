package com.perfulandia.authgestion.controller;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.CollectionModel;

import com.perfulandia.authgestion.dto.CrearUsuarioRequest;
import com.perfulandia.authgestion.dto.UsuarioDTO;
import com.perfulandia.authgestion.model.Usuario;
import com.perfulandia.authgestion.service.UsuarioService;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;


import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService service;

    @GetMapping
    public ResponseEntity<CollectionModel<EntityModel<UsuarioDTO>>> getAll() {
        List<UsuarioDTO> usuarios = service.listarUsuarios();

        List<EntityModel<UsuarioDTO>> modelos = usuarios.stream()
            .map(usuario -> EntityModel.of(usuario,
                linkTo(methodOn(UsuarioController.class).getById(usuario.getId())).withSelfRel(),
                linkTo(methodOn(UsuarioController.class).eliminar(usuario.getId())).withRel("eliminar")
            ))
            .collect(Collectors.toList());

        return ResponseEntity.ok(
            CollectionModel.of(modelos,
                linkTo(methodOn(UsuarioController.class).getAll()).withSelfRel())
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Integer id) {
        try {
            UsuarioDTO usuario = service.buscarUsuarioPorId(id);

            EntityModel<UsuarioDTO> modelo = EntityModel.of(usuario,
                linkTo(methodOn(UsuarioController.class).getById(id)).withSelfRel(),
                linkTo(methodOn(UsuarioController.class).getAll()).withRel("usuarios"),
                linkTo(methodOn(UsuarioController.class).eliminar(id)).withRel("eliminar")
            );

            return ResponseEntity.ok(modelo);
        } catch (RuntimeException ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                                 .body(Map.of("mensaje", ex.getMessage()));
        }
    }

    @PostMapping
    public ResponseEntity<Usuario> crear(@RequestBody CrearUsuarioRequest request) {
        Usuario creado = service.crearUsuario(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UsuarioDTO> editarUsuario(@PathVariable Integer id, @RequestBody UsuarioDTO usuarioDTO) {
        UsuarioDTO actualizado = service.actualizarUsuario(id, usuarioDTO);
        return ResponseEntity.ok(actualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        service.eliminarUsuario(id);
        return ResponseEntity.noContent().build();
    }
}
