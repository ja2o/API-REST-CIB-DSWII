package com.servidor.aldazabal.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servidor.aldazabal.entity.Cliente;
import com.servidor.aldazabal.repository.IClienteRepository;

@Service
public class IClienteServiceImpl implements IClienteService {
	
	@Autowired
	private IClienteRepository repo;

	@Override
	public Cliente registrarActualizar(Cliente cliente) {
		return repo.save( cliente );		
	}

	@Override
	public void eliminar(int codCliente) {
		repo.deleteById( codCliente );
	}

	@Override
	public List<Cliente> listar() {
		return repo.findAll();
	}

	@Override
	public Cliente findById(int codCli) {
		Cliente cli = null;
		Optional<Cliente> optCliente = repo.findById( codCli );
		cli = optCliente.isPresent() ? optCliente.get() : null;
		return cli;
	}

}
