package com.capgemini.main;

import java.util.Objects;

public class CellPhone implements Comparable<CellPhone> {
	private String company;
	private String model;
	private String description;
	private String os;
	private long price;
	public CellPhone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CellPhone(String company, String model,String description, String os,long price) {
		super();
		this.company = company;
		this.model = model;
		this.os = os;
	}
	@Override
	public int hashCode() {
		
		return Objects.hash(os,model);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (obj instanceof CellPhone)
		{
			return false;
		}
		CellPhone cellPhone = (CellPhone) obj;
		if(this.os==cellPhone.os && this.model==cellPhone.model)
		{
			return true;
		}
		return false;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	@Override
	public int compareTo(CellPhone o) {
		
		return this.company.compareTo(o.company);
	}
	
	
}
