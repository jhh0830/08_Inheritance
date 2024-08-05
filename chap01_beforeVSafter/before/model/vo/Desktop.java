package com.kh.chap01_beforeVSafter.before.model.vo;

public class Desktop {

	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private boolean allinOne;
	
	public Desktop() {}
	
	public Desktop(String brand, String pCode,String pName,int price,boolean allinOne) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.allinOne = allinOne;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setpCdoe(String pCode) {
		this.pCode =pCode;
	}
	public void setpName(String pName) {
		this.pName =pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setAlllnOne(boolean allinOne) {
		this.allinOne = allinOne;
	}
	
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
	// boolean 타입의 필드에 대한 getter 메소드명은
	// getxxx이 아닌 isxxx로 짓는다.
	public boolean ilallinOne() {
		return allinOne;
	}
	// ininformaition메소드
	public String informaition() {
		return brand+pCode+pName+price+allinOne;
	}
}
