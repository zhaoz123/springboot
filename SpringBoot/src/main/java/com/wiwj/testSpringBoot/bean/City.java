package com.wiwj.testSpringBoot.bean;

import java.io.Serializable;

public class City implements Serializable {

	private int id;
	private int provinceId;
	private String cityName;
	private String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", provinceId=" + provinceId + ", cityName=" + cityName + ", description="
				+ description + "]";
	}

}
