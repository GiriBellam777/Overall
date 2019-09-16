package com.cg.trading.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.trading.entity.Stock;
import com.cg.trading.exception.StockException;
import com.cg.trading.repository.StockRepo;

@Service
public class StockServiceImpl implements StockService {
	
	@Autowired
	StockRepo stockRepo;

	@Override
	public List<Stock> create(Stock stock) throws StockException {
		try {
			stock.setAmount(stock.getPrice() * stock.getQuantity());
			if (stock.getQuantity() > 100) {
				stock.setBrokerage(stock.getAmount() * 0.3 * 0.01);
			} else {
				stock.setBrokerage(stock.getAmount() * 0.5 * 0.01);
			}
			stockRepo.save(stock);
			stockRepo.flush();
			return stockRepo.findAll();
		} catch (Exception e) {
			throw new StockException(e.getMessage());
		}
	}

	@Override
	public List<Stock> update(int id, Stock stock) throws StockException {
		try {
			Optional<Stock> optional = stockRepo.findById(id);
			if (optional.isPresent()) {
				Stock stock1 = optional.get();
				stock1.setName(stock.getName());
				stock1.setPrice(stock.getPrice());
				stock1.setQuantity(stock.getQuantity());
				stock1.setAmount(stock1.getPrice() * stock1.getQuantity());
				stockRepo.save(stock1);
				return stockRepo.findAll();
			} else {
				throw new StockException();
			} 
		} catch (Exception e) {
			throw new StockException(e.getMessage());
		}
	}

	@Override
	public void delete(int id) throws StockException {
		try {
			stockRepo.deleteById(id);
		} catch (Exception e) {
			throw new StockException(e.getMessage());
		}
	}

	@Override
	public List<Stock> viewAll() throws StockException {
		try {
			return stockRepo.findAll();
		} catch (Exception e) {
			throw new StockException(e.getMessage());
		}
	}

	@Override
	public Stock find(int id) throws StockException {
		Stock stock;
		try {
			stock = stockRepo.findById(id).get();
			return stock;
		} catch (Exception e) {
			throw new StockException(e.getMessage());
		}
	}
	
}
