package com.mx.MSDominio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.MSDominio.entity.Dominio;
import com.mx.MSDominio.servicio.DominioServImp;

@RestController
@RequestMapping(path = "DominioWs")
public class DominioWs {

	@Autowired
	DominioServImp dominioServImp;
	
	// http://localhost:8030/DominioWs/
	@PostMapping
	public ResponseEntity<Dominio> guardar(@RequestBody Dominio dominio){
		return new ResponseEntity<>(dominioServImp.guardar(dominio), HttpStatus.CREATED);
	}
}
