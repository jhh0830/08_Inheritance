package com.kh.chap03_override.run;

import com.kh.chap03_override.model.vo.Book;

public class OverrideRun {

	public static void main(String[] args) {
		// 모든 클래스는 Object 클래스의 후손이다.
		// 즉, 최상위 클래스는 항상 Object
		// > Object 클래스에 정의된 메소드들은 다 가져다 쓸 수 있음!!
		// > Object 클래스에 정의된 메소드가 맘에 안든다면
		//   오버라이딩을 통해 재정의 (재작성) 가능
		
		
		// Book 객체 생성
		Book bk = new Book("두잇바자 프로그래밍", "박은종", 25000);
		
		
		// 출력
		System.out.println(bk/*.toString*/); //주소값
		System.out.println(bk.toString()); // 주소값
		// > bk를 그냥출력했을때랑 bk.toString() 으로 출력했을때
		// 출력 결과가 완전히 동일하게 나오는 상황
		
		// * 출력문 안에 참조자료형 변수명을 제시해서 출력하고자 할 때
		//   해당 참조자료형타입의 풀클래스명 + "@" + 16진수형태의 주소값
		//   형식이 항상 출력되었었음!!
		// > 내부적으로 JVM 이 자동으로 .toString() 메소드를 호출해줬기 때문이다.
		
		// Object 클래스에 정의된 toString 메소드
		// > 해당타입의 풀클래스명 + "@" + 16진수형태 주소값
		//   하나의 문자열로 내보내주는 메소드
		
		
		// - 자식클래스인 Book 클래스에서 toString 메소드를 재정의
		//   (오버라이딩)
		//   해당 객체의 모든 필드값들을 하나의 문자열로 합쳐서 돌려주는 식으로
		
		// bk를 출력했을때
		// toString 오버라이딩 전 : 주소값
		// 			오버라이딩 후 : 필드값
	}

}
