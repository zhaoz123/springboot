package com.wiwj.testSpringBoot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wiwj.testSpringBoot.bean.City;

public interface CityMapper {

	public City findCityById(int id);

	public List<City> findCityByName(@Param("cityName") String cityName);
}
