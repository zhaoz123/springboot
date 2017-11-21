package com.wiwj.testSpringBoot.controller;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wiwj.testSpringBoot.bean.City;
import com.wiwj.testSpringBoot.service.CityService;

@RestController
public class CityController {

	@Autowired
	private CityService cityService;

	@RequestMapping("/findCityId/{id}")
	public City findCityId(@PathVariable(value = "id") int id, Model model) {
		City city = cityService.findCityById(id);
		return city;
	}

	@RequestMapping("/findCityName")
	public List<City> findCityName(@RequestParam(value = "cityName") String cityName, Model model) {
		List<City> citys = cityService.findCityByName(cityName);
		return citys;
	}
}
