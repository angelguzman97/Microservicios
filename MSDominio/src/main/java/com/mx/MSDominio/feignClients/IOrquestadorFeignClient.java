package com.mx.MSDominio.feignClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.mx.MSDominio.model.Orquestador;

import io.micrometer.core.instrument.config.validate.ValidationException;

@FeignClient(name = "MS-ORQUESTADOR", url = "http://localhost:8031", path = "/OrquestadorWs")
public interface IOrquestadorFeignClient {
	@PostMapping
	public Orquestador guardar(@RequestBody Orquestador orquestador) throws ValidationException;
}
