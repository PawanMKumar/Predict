package com.usi.predict.service;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usi.predict.model.SNAPYearly;
import com.usi.predict.repository.SNAPYearlyRepository;
@Service
public class YearlyServiceImpl implements YearlyService{
	
	@Autowired
	SNAPYearlyRepository repository;

	@Override
	public List<SNAPYearly> getAllSNAPYearly() {
		return (List<SNAPYearly>) repository.findAll();
	}
	
	public SNAPYearly findByYear(String year){
		return repository.findByYear(year);
	}

}
