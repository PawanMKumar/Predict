package com.usi.predict.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usi.predict.model.SNAPDaily;
import com.usi.predict.repository.SNAPDailyRepository;
@Service
public class DailyServiceImpl implements DailyService{
	
	@Autowired
	SNAPDailyRepository repository;

	@Override
	public List<SNAPDaily> getAllSNAPDaily() {
		return (List<SNAPDaily>) repository.findAll();
	}

}
