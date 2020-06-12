package com.library.books.model;

public class Address {
	
	private Integer addressId;
	private Integer plotNumber;
	private String area;
	private String city;
	private Integer pinCode;
	
	
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public Integer getPlotNumber() {
		return plotNumber;
	}
	public void setPlotNumber(Integer plotNumber) {
		this.plotNumber = plotNumber;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getPinCode() {
		return pinCode;
	}
	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}
	
}
