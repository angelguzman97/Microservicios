package com.mx.MSOrquestador.servicio;

import com.mx.MSOrquestador.entity.Orquestador;

import io.micrometer.core.instrument.config.validate.ValidationException;

public interface OrquestadorServ {
	
	public Orquestador guardar(Orquestador orquestador) throws ValidationException;
	
	
}
