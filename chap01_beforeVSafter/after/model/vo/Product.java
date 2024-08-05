package com.kh.chap01_beforeVSafter.after.model.vo;

// 세 클래스 모두 공통적으로 기술했었던 요소들만 추출해서
// 단 한번 정의해둔 클래스 == 부모클래스
public class Product /*extends Object*/{
	
	
	// 필드부
	/*
	protected String brand;
	protected String pCode;
	protected String pName;
	protected int price;
	*/
	
	
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	
	// 생성자부
	
	public Product() {}
	public Product(String brand, String pCode, String pName,int price) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}
	// 메소드부
	// setter 메소드들
	public void setBrand(String brand) {
		this.brand = brand;
		
	}
	
	public void setpCode(String pCode) {
		this.pCode = pCode;
		
	}
	
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	public void setPrice(int price) {
		this.price =price;
	}
	// getter 메소드들
	public String getBrand() {
		return brand;
	}
	public String getpCode() {
		return pCode;
	}
	public String getpName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	// infomation 메소드
	public String information() {
		return brand+ " , "+pCode+" , "+pName+", "+price;
	}
}
