package com.servidor.aldazabal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	@ResponseBody
	public ResponseEntity<Cliente> registrar( @RequestBody Cliente cliente ) {
		return ResponseEntity.ok( service.registrarActualizar( cliente ));
	}
	
	@PutMapping("/actualizar")
	@ResponseBody
	public ResponseEntity<Cliente> actualizar( @RequestBody Cliente cliente ) {
		return ResponseEntity.ok( service.registrarActualizar( cliente ));
	}
	
	@DeleteMapping("/eliminar/{codigo}")
	@ResponseBody
	public ResponseEntity<Cliente> eliminar( @PathVariable("codigo") int codCliente ) {
		Cliente cliente = service.findById( codCliente );
		if ( cliente != null ) {
			service.eliminar( codCliente );
			return ResponseEntity.ok( cliente );
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("/listar")
	@ResponseBody
	public ResponseEntity<List<Cliente>> listar() {
		List<Cliente> lista = service.listar(); 
		return ResponseEntity.ok( lista );
	}
	
	@GetMapping("/listar/{codigo}")
	@ResponseBody
	public ResponseEntity<Cliente> buscarPorID( @PathVariable("codigo") int codCliente ) {
		Cliente cliente = service.findById( codCliente );
		if ( cliente != null ) {
			return ResponseEntity.ok( cliente );
		} else {
			return ResponseEntity.notFound().build();
		}
	}

}
