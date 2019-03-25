package com.capgemini.main;

import java.util.Objects;

public class School {
	private String name;
	private String city;
	private String district;
	private int rank;
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	public School(String name, String city, String district, int rank) {
		super();
		this.name = name;
		this.city = city;
		this.district = district;
		this.rank = rank;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	@Override
	public int hashCode() {
		
		return Objects.hash(name,city,district);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if(obj instanceof School) {
			return false;
		}
		School sc = (School) obj;
		if(this.name==sc.name && this.city==sc.city && this.city==sc.district) {
			return true;
		}
		
		return false;
	}
	

}
