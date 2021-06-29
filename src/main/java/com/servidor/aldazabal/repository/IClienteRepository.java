package com.servidor.aldazabal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servidor.aldazabal.entity.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Integer>{

}
