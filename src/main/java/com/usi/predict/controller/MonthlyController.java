package com.usi.predict.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usi.predict.model.SNAPMonthly;
import com.usi.predict.service.MonthlyService;

@RestController
public class MonthlyController {

	@Autowired
	private MonthlyService mService;

	@RequestMapping(value = "/month/{id}")
	public SNAPMonthly searchByMonthSNAP(@PathVariable("id") String month) {

		return mService.findByMonth(month);
	}

}
