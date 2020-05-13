package com.cg.updaterawmaterialstock.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.updaterawmaterialstock.model.UpdateRawMaterialStock;
import com.cg.updaterawmaterialstock.service.UpdateRawMaterialStockService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class UpdateRawMaterialStockController {

	@Autowired
	private UpdateRawMaterialStockService service;

	Logger logger = LoggerFactory.getLogger(UpdateRawMaterialStockService.class);

	@PutMapping("/update/{orderId}")
	public String updateRawMaterialStock(@RequestBody UpdateRawMaterialStock updateRawMaterialStock,
			@PathVariable int orderId) {
		logger.info("Updating stock");
		return service.updateRawMaterialStockDetails(updateRawMaterialStock, orderId);
	}

}
