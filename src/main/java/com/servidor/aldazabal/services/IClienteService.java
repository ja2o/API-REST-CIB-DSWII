package com.servidor.aldazabal.services;

import java.util.List;

import com.servidor.aldazabal.entity.Cliente;

public interface IClienteService {
	
	public Cliente registrarActualizar( Cliente cliente);
	public void eliminar( int codCliente);
	
	public List<Cliente> listar();	
	public Cliente findById( int codCli );

}
