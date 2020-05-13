package com.cg.updaterawmaterialstock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.updaterawmaterialstock.model.UpdateRawMaterialStock;

@Repository
public interface UpdateRawMaterialStockRepository extends JpaRepository<UpdateRawMaterialStock, Integer> {

}
