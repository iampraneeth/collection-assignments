package com.capgemini.main;
import java.util.Objects;
public class Television implements Comparable<Television> {
	private String company;
	private String type;
	private long price;
	private boolean _3dType;

	public Television() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Television(String company, String type, long price,boolean _3dType) {
		super();
		this.company = company;
		this.type = type;
		this.price = price;
		this._3dType=_3dType;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if(obj instanceof Television) {
			return false;
		}
		
		Television other = (Television) obj;
		if (this.price==other.price && this.type==other.type) {
			return true;
		}
		
		return false;
	}
	@Override
	public int hashCode() {
		
		return Objects.hash(price,type);
	}
	@Override
	public int compareTo(Television o) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
