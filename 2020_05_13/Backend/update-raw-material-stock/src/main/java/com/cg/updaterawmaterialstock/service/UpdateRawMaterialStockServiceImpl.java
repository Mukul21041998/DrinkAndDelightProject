package com.cg.updaterawmaterialstock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.updaterawmaterialstock.model.UpdateRawMaterialStock;
import com.cg.updaterawmaterialstock.repository.UpdateRawMaterialStockRepository;

@Service
public class UpdateRawMaterialStockServiceImpl implements UpdateRawMaterialStockService {

	@Autowired
	private UpdateRawMaterialStockRepository repo;

// Updating data to the database
	@Override
	@Transactional
	public String updateRawMaterialStockDetails(UpdateRawMaterialStock updateRawMaterialStock, int orderId) {
		if(!repo.existsById(orderId)) {
			return "invalid";
		}
		else {
			int totalPrice = updateRawMaterialStock.getPricePerUnit() * updateRawMaterialStock.getQuantityUnit();
			updateRawMaterialStock.setPrice(totalPrice);
			repo.save(updateRawMaterialStock);
			return "Data updated successfully";
		}
		
	}

}
