package com.kh.chap01_beforeVSafter.after.model.vo;

// �� Ŭ���� ��� ���������� ����߾��� ��ҵ鸸 �����ؼ�
// �� �ѹ� �����ص� Ŭ���� == �θ�Ŭ����
public class Product /*extends Object*/{
	
	
	// �ʵ��
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
	
	// �����ں�
	
	public Product() {}
	public Product(String brand, String pCode, String pName,int price) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}
	// �޼ҵ��
	// setter �޼ҵ��
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
	// getter �޼ҵ��
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
	// infomation �޼ҵ�
	public String information() {
		return brand+ " , "+pCode+" , "+pName+", "+price;
	}
}
