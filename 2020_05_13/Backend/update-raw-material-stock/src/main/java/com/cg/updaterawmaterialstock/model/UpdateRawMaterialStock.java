package com.cg.updaterawmaterialstock.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rawmaterials_stock_tbl")
public class UpdateRawMaterialStock {
	private int orderId;
	private int pricePerUnit;
	private int quantityUnit;
	private int price;
	private String qualityCheck;

	public UpdateRawMaterialStock() {

	}

	public UpdateRawMaterialStock(int orderId, int pricePerUnit, int quantityUnit, int price, String qualityCheck) {
		super();
		this.orderId = orderId;
		this.pricePerUnit = pricePerUnit;
		this.quantityUnit = quantityUnit;
		this.price = price;
		this.qualityCheck = qualityCheck;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	@Column(name = "price_per_unit", nullable = false)
	public int getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(int pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	@Column(name = "quantity_unit", nullable = false)
	public int getQuantityUnit() {
		return quantityUnit;
	}

	public void setQuantityUnit(int quantityUnit) {
		this.quantityUnit = quantityUnit;
	}

	@Column(name = "price", nullable = false)
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Column(name = "quality_check" , length = 20, nullable = false)
	public String getQualityCheck() {
		return qualityCheck;
	}

	public void setQualityCheck(String qualityCheck) {
		this.qualityCheck = qualityCheck;
	}

	@Override
	public String toString() {
		return "UpdataRawMaterialStock [orderId=" + orderId + ", pricePerUnit=" + pricePerUnit + ", quantityUnit="
				+ quantityUnit + ", price=" + price + ", qualityCheck=" + qualityCheck + "]";
	}

}
