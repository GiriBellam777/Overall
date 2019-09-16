package com.cg.trading.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.trading.entity.Stock;
import com.cg.trading.exception.StockException;
import com.cg.trading.service.StockService;

@RestController
public class StockController {

	@Autowired
	StockService stockService;
	
	@RequestMapping("/create")
	public List<Stock> create(@RequestBody Stock stock) throws StockException{
		return stockService.create(stock);
	}
	
	@PutMapping("/update/{id}")
	public List<Stock> update(@PathVariable int id, @RequestBody Stock stock) throws StockException{
		return stockService.update(id, stock);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) throws StockException{
		stockService.delete(id);
	}
	
	@RequestMapping("/viewAll")
	public List<Stock> viewAll() throws StockException{
		return stockService.viewAll();
	}
	
	@GetMapping("/find/{id}")
	public Stock find(@PathVariable int id) throws StockException{
		return stockService.find(id);
	}
}
