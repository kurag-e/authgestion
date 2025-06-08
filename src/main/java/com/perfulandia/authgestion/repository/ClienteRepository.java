package com.perfulandia.authgestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.perfulandia.authgestion.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
