package com.kh.chap03_override.model.vo;

public class Book /*extends Object*/{
	
	//필드부
	
	private String title; // 제목
	private String author; // 저자명
	private int price; // 가격
	
	//생성자부
	public Book() {}

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	/*public String information() {
		return title + ", " + author + ", "+ price;
	}
	*/
	// > 앞으로는 information메소드를 만들 필요없이
	// toString 메소드를 오버라이딩 해서 쓰자!!
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	/*
	 * * 오버라이딩
	 * - 상속 받고 있는 부모클래스의 메소드를 자식클래스에서
	 *   코드를 내 입맛대로 재정의 (재작성) 하는 것
	 * - 부모가 제공하고 있는 메소드를 자식이 일부 고쳐서 사용하겠다 라는 의미
	 * - 호출 시 재정의된 자식메소드가 우선권을 가짐 (동적 바인딩)
	 * * 오버라이딩 성립 조건
	 * 1. 부모메소드의 메소드명과 동일
	 * 2. 매개변수의 자료형, 갯수, 순서가 모두 동일
	 * 3. 반환형 동일
	 * 4. 매개변수명과는 무관
	 * 5. 부모메소드의 접근제한자보다 같거나 공유 범위가 더 커야 함
	 * > 즉, 메소드 정의부 (껍데기) 는 그대로 쓰고,
	 *   중괄호 영역 안쪽의 코드만 재정의 한다고 생각해도 됨!!
	 * > 규약의 개념이 들어가있음
	 * 	 재정의 하려면 적어도 이정도의 규칙은 지켜야 한다.
	 * * 오버로딩 vs 오버라이딩
	 * - 오버로딩 : 상속이랑 전혀 관련 없는 개념
	 * 			같은 클래스 내 동일한 이름으로 여러개의 
	 * 			메소드를 만들 수있는 규칙
	 * 
	 * - 오버라이딩 : 상속이랑 관련 있는 개념 
	 * 상속 구조의 클래스간에 메소드를 재정의 할 수 있는 규칙
	 * 
	 * * @Override 어노테이션 (Annotation)
	 * - 생략 가능 (써도 그만 안써도 그만임)
	 * - 이 메소드가 오버라이딩된 메소드임을 알려주는 일종의 "주석" 같은놈
	 * - 어노테이션을 쓰면 좋은 이유?
	 *   오버라이딩 할 메소드를 잘못 정의했을 경우 (실수할 경우)
	 *   오류로써 (빨간 밑줄로) 알려주기 때문에
	 *   코드를 다시 한번 검토할 수 있게 유도해준다.
	 * 
	 * * VO 코드 작성 팁
	 * 1. 필드는 무조건 private 으로 우선 작성
	 * 2. 기본생성자
	 * 3. 모든필드에대한 매개변수생성자 > Source - Generate Constructor using Field..
	 * 4. setter / getter 메소드 작성 > Source - Generate Getters and Setters
	 * 5. information 굳이 안만들어도 toString 메소드 "오버라이딩"하면된다. > Source - Generate toString
	 * > 작업시작
	 */
	
	
}
