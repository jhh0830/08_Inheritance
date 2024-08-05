package com.kh.chap01_beforeVSafter.after.model.vo;

//           자식 클래스        부모클래스
//           후손 캘래스        조상클래스
//           하위 캘래스        상위클래스
//           서브 캘래스        슈퍼클래스
public class Desktop extends Product{
	// > 상속받는 순간 필드 4개, 메소드 9개 내꺼처럼 쓸 수 있다.
	
	// 필드부
	private boolean allInOne; //일체 여부
	
	// 생성자부
	
	public Desktop() {}
	
	public Desktop(String brand,
			  String pCode,
			  String pName,
			  int price,
			  boolean allInOne) {
		
		// brand, pCode, pName, price,
		// allInOne
		// 필드에 매개변수 인자 값을 각각 초기화
		
		// this. : 자기 자신의 주소값을 담고 있다.
		// super. : 해당 부모객체의 주소값을 담고있다.
		// > 자식객체는 super.으로 부모것에 접근 가능하다.
		// > 단, 접근하고자 하는게 private 일경우는
		// 직접 접근이 불가하다!!
		
		
		
		/*
		super.brand = brand;
		super.pCode = pCode;
		super.pName = pName;
		super.price = price;
		*/
		
		
		// > 부모클래스인 Product 에 있는 필드임
		// 해결방법 1.
		// 부모클래스의 필드를 자식까지는 접근 가능하게끔
		// 접근 제한을 살짝만 풀어조는 방법
		// 부모 필드의 접근제한자를 private --> protected로 변경
		/*
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		*/
		
		// 해결방법 2. 
		// 부모클래스에 있는 public 접근제한자인
		// setter 메소드들 활용하기
		/*
		this.setBrand(brand);
		this.setpCode(pCode);
		this.setpName(pName);
		this.setPrice(price);
		*/
		
		// 해결방법3.
		// 부모 클래스의 생성자를 호출하기
		// this(brand, pCode, pName,price);
		// > 부모클래스의 생성자는 super(); 로 호출한다.
		// (this 로 호출 불가)
		super(brand, pCode, pName,price);
		
		this.allInOne = allInOne;
		// super(brand, pCode, pName,price);
		// > 반드시 첫줄에 기술해야 함!!
		
		
		
		
	}
	//메소드부
	//setter 메소드
	
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	//getter 메소드
	public boolean isAllInOne() {
		return allInOne;
		
	}
	// information 메소드
	// > 부모클래스로 이미 물려받은 상태에서
	//   자식클래스에서 동일한 형태로 다시 정의한 상황
	//  코드 내용물만 갈아엎은 상황 == "오버라이딩"
	
	public String information() {
		/*
		return super.getBrand()+ ", " +getpCode()+ ", " +getpName()+ ", " +
	getPrice()+ ", " +allInOne;
	*/
		return super.information()+ "," +allInOne;
	}
	
}
