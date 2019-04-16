package com.usi.predict.service;

import java.util.List;

import com.usi.predict.model.SNAPYearly;

public interface YearlyService {

	List<SNAPYearly> getAllSNAPYearly();
	SNAPYearly findByYear(String year);
	
}
