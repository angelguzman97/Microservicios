package com.mx.MSOrquestador.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.MSOrquestador.dao.OrquestadorDao;
import com.mx.MSOrquestador.entity.Orquestador;

import io.micrometer.core.instrument.config.validate.Validated;
import io.micrometer.core.instrument.config.validate.ValidationException;

@Service
public class OrquestadorServImp implements OrquestadorServ{
	@Autowired
	OrquestadorDao orquestadorDao;

	@Transactional
	@Override
	public Orquestador guardar(Orquestador orquestador) throws ValidationException {
		// TODO Auto-generated method stub
		 if (orquestador.getInformacion() == null || orquestador.getInformacion().isEmpty()) {
		       throw new ValidationException((Validated<?>) orquestador);
		    }
		 return orquestadorDao.save(orquestador);
	}

	
	
	
}
