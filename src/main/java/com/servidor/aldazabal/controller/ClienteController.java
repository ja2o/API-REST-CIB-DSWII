package com.servidor.aldazabal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.servidor.aldazabal.entity.Cliente;
import com.servidor.aldazabal.services.IClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private IClienteService service;
	
	@PostMapping("/registrar")
	public void registrar( @RequestBody Cliente cliente ) {
		service.registrar( cliente );
	}
	
	@DeleteMapping("/eliminar/{codigo}")
	public void eliminar( @PathVariable("codigo") int codCliente  ) {
		service.eliminar( codCliente );
	}
	
	@GetMapping("/listar")
	@ResponseBody
	public List<Cliente> listar() {
		return service.listar();
	}
	
	@GetMapping("/listar/{codigo}")
	@ResponseBody
	public Cliente buscarPorId( int codCliente ) {
		return service.findById( codCliente );
	}

}
