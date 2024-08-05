package com.kh.chap02_inherit.model.vo;

public class Airplane extends Vehicle{
	private int tire;
	private int wing;
	
	public Airplane() {}
	
	public Airplane(String name,double mileage,String kind,int tire,int wing) {
		super(name,mileage,kind);
		this.tire = tire; // 바퀴 갯수
		this.wing = wing; // 날개 갯수
	}
	
	public void setTire(int tire) {
		this.tire = tire;
	}
	public void setWing(int wing) {
		this.wing = wing;
	}
	
	public int getTire() {
		return tire;
	}
	public int getWing() {
		return wing;
	}
	public String information() {
		return super.information()+", "+tire+", "+wing;
	}
	public void howToMove() {
		System.out.println("바퀴를 굴려 움직이다가 날개를펼치며 날아간다.");
	}
	
}
