package com.kh.chap02_inherit.model.vo;

public class Ship extends Vehicle{
	private int  properller;

	public Ship() {}
	public Ship(String name,double mileage,String kind,int properller) {
		super(name,mileage,kind);
		this.properller = properller;
	}
	public void setProperller(int properller) {
		this.properller = properller;
	}
	public int getProperller() {
		return properller;
	}
	public String information() {
		return super.information()+", "+properller;
	}
	public void howToMove() {
		System.out.println("프로펠러를 돌려가며 앞으로 나아간다.");
	}
}
