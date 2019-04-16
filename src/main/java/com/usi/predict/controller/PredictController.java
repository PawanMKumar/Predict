package com.usi.predict.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usi.predict.service.DailyService;
import com.usi.predict.service.MonthlyService;
import com.usi.predict.service.YearlyService;

@RestController
public class PredictController{

	@Autowired
	private DailyService dService;
	@Autowired
	private MonthlyService mService;
	@Autowired
	private YearlyService yService;

	@RequestMapping(value = "/{id}")
	public List home(@PathVariable("id") String name) {

		if ("Day".equalsIgnoreCase(name))
			return dService.getAllSNAPDaily();
		if ("Month".equalsIgnoreCase(name))
			return mService.getAllSNAPMonthly();
		if ("Year".equalsIgnoreCase(name))
			return yService.getAllSNAPYearly();
		return dService.getAllSNAPDaily();
	}
}
