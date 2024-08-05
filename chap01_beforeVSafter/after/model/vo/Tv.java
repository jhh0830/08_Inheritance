package com.kh.chap01_beforeVSafter.after.model.vo;


//              확장하겠다.
// > 부모클래스의 코드를 갖고오고 + 내 코드를 추가 해서
public class Tv extends Product{
	
	// 필드부
	
	private int inch; // 인치
	
	
	// 생성자부
	public Tv() {}
	public Tv(String brand,
			String pCode,
			String pName,
			int price,
			int inch) {
		// super(); // 부모클래스의 "기본생성자"를 호출
		super(brand, pCode, pName,price);
		this.inch = inch;
	}
	
	//메소드부
	//setter /getter
	
	public void setInch(int inch) {
		this.inch = inch;
		
	}
	public int getInch() {
		return inch;
	}
	
	
	// information 메소드 오버라이딩
	public String information() {
		return super.information() + " , "+inch;
	}
}
