package com.perfulandia.authgestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.perfulandia.authgestion.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
