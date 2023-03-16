package com.prueba.prueba.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.prueba.prueba.model.Prices;

import com.prueba.prueba.repository.PricesRepository;

@Service
public class PricesService {
	
	
	private EntityManager em=null;
	
	@PersistenceContext
	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	@Autowired
	private PricesRepository pricesRepository;
	
	public List<Prices>obtieneTodos(){
		List<Prices> listado = pricesRepository.findAll();
		return listado;
	}

}
