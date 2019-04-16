package com.usi.predict.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usi.predict.model.SNAPYearly;
import com.usi.predict.service.YearlyService;

@RestController
public class YearlyController {

	@Autowired
	private YearlyService yService;

	@RequestMapping(value = "/year/{id}")
	public SNAPYearly searchByMonth(@PathVariable("id") String year) {

		return yService.findByYear(year);
	}

}
