package com.usi.predict.service;

import java.util.List;

import com.usi.predict.model.SNAPMonthly;

public interface MonthlyService {

	List<SNAPMonthly> getAllSNAPMonthly();

	SNAPMonthly findByMonth(String month);
}
