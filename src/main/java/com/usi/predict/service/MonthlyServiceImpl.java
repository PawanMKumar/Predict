package com.usi.predict.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usi.predict.model.SNAPMonthly;
import com.usi.predict.repository.SNAPMonthlyRepository;
@Service
public class MonthlyServiceImpl implements MonthlyService{
	
	@Autowired
	SNAPMonthlyRepository repository;

	@Override
	public List<SNAPMonthly> getAllSNAPMonthly() {
		return (List<SNAPMonthly>) repository.findAll();
	}

	@Override
	public SNAPMonthly findByMonth(String month) {
		return repository.findByMonth(month);
	}

}
