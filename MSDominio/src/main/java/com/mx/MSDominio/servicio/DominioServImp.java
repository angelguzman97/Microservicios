package com.mx.MSDominio.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.mx.MSDominio.dao.DominioDao;
import com.mx.MSDominio.entity.Dominio;
import com.mx.MSDominio.feignClients.IOrquestadorFeignClient;

@Service
public class DominioServImp implements DominioServ{

	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	IOrquestadorFeignClient iOrquestadorFeignClient;
	
	@Autowired
	DominioDao dominioDao;
	
	
	@Transactional
	@Override
	public Dominio guardar(Dominio dominio) {
		// TODO Auto-generated method stub
		return dominioDao.save(dominio);
	}
	
	

}
