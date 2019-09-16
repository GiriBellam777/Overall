package com.cg.trading.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.trading.entity.Stock;

@Repository
public interface StockRepo extends JpaRepository<Stock, Integer>{

}