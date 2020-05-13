package com.cg.displaydistributordetails.repository;

import org.springframework.stereotype.Repository;

import com.cg.displaydistributordetails.model.DisplayDistributorDetails;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface DisplayDistributorDetailsRepository extends JpaRepository<DisplayDistributorDetails,Integer> {
	
//	Using query to select the data from the database for the specific user
	
	@Query(value = "select * from distributors_tbl where supplier_id = ?1", nativeQuery = true)
	List<DisplayDistributorDetails> getDistributorDetails(int supplierId);

}
