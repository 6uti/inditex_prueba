package com.prueba.prueba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.prueba.model.Prices;
import com.prueba.prueba.model.Request;
import com.prueba.prueba.model.Response;
import com.prueba.prueba.repository.PricesRepository;
import com.prueba.prueba.service.PricesService;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/api")
public class PruebaController {
	
	@Autowired
	PricesService pricesService;
	
	@GetMapping("/consulta")
	public ResponseEntity<Response> getConsulta(@RequestBody Request request) {
		try {
			Response response = new Response();
			for (Prices rv : pricesService.obtieneTodos()){
				boolean dato = DentroDelRango(request.getApply_date(), rv.getStart_date(),rv.getEnd_date());
				if(dato) {
					response.setIdProduct(rv.getIdProduct());
					response.setIdBrand(rv.getIdBrand());
					response.setPrice_list(rv.getPrice_list());
					response.setStart_date(rv.getStart_date());
					response.setEnd_date(rv.getEnd_date());
					response.setPrice(rv.getPrice());
				}
			}
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public boolean DentroDelRango(String Fecha, String FechaRango1, String FechaRango2) throws ParseException{
	    DateFormat formatoEntrada = new SimpleDateFormat("yyyy-MM-dd-HH.mm.ss");
	    DateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    // Parseamos las fechas
	    Date MiFecha = formatoEntrada.parse(Fecha);
	    Date RangoIni = formato.parse(FechaRango1);
	    Date RangoFin = formato.parse(FechaRango2);

	    return MiFecha.compareTo(RangoIni) >= 0 &&
	           MiFecha.compareTo(RangoFin) <= 0;
	}
}
