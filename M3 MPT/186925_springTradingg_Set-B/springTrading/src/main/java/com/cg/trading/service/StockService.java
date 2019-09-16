package com.cg.trading.service;

import java.util.List;

import com.cg.trading.entity.Stock;
import com.cg.trading.exception.StockException;

public interface StockService {

	public List<Stock> create(Stock stock) throws StockException;
	public List<Stock> update(int id, Stock stock) throws StockException;
	public void delete(int id) throws StockException;
	public List<Stock> viewAll() throws StockException;
	public Stock find(int id) throws StockException;
//	public int calculateOrder(Stock bean);
	
}
