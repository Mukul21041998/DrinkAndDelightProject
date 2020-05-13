package com.cg.displaydistributordetails.service;

import java.util.List;

import com.cg.displaydistributordetails.model.DisplayDistributorDetails;

public interface DisplayDistributorDetailsService {

	List<DisplayDistributorDetails> getDistributorDetails( int supplier );

}
