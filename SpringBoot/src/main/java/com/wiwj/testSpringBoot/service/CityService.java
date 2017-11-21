package com.wiwj.testSpringBoot.service;

import java.util.List;

import com.wiwj.testSpringBoot.bean.City;

public interface CityService {

	public City findCityById(int id);
	
	public List<City> findCityByName(String cityName);
}
