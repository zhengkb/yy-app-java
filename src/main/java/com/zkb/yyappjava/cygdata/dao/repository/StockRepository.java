package com.zkb.yyappjava.cygdata.dao.repository;

import com.zkb.yyappjava.cygdata.dao.enitity.StockEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StockRepository extends JpaRepository<StockEntity, String> {

}
