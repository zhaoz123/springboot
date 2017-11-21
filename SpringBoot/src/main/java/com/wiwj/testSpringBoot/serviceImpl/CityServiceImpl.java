package com.wiwj.testSpringBoot.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiwj.testSpringBoot.bean.City;
import com.wiwj.testSpringBoot.mapper.CityMapper;
import com.wiwj.testSpringBoot.service.CityService;

@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private CityMapper cityMapper;
	
	public City findCityById(int id) {
		
		return cityMapper.findCityById(id);
	}

	public List<City> findCityByName(String cityName) {
		List<City> citys = cityMapper.findCityByName(cityName);
		return citys;
	}

}
