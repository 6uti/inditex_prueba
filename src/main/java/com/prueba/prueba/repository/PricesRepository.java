package com.prueba.prueba.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.prueba.prueba.model.Prices;
import com.prueba.prueba.model.Request;

public interface PricesRepository extends JpaRepository<Prices, String> {

}
