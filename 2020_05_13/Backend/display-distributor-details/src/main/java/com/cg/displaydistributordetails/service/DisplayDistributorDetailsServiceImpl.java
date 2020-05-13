package com.cg.displaydistributordetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.displaydistributordetails.model.DisplayDistributorDetails;
import com.cg.displaydistributordetails.repository.DisplayDistributorDetailsRepository;

@Service
public class DisplayDistributorDetailsServiceImpl implements DisplayDistributorDetailsService {

	@Autowired
	private DisplayDistributorDetailsRepository repository;

//	Getting the specific data from the database by using the supplier id 

	@Override
	public List<DisplayDistributorDetails> getDistributorDetails(int supplierId) {
		if (!repository.existsById(supplierId)) {
			return null;
		}
		
		else {
			return repository.getDistributorDetails(supplierId);
		}
		
	}

}
