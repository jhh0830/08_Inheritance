package com.kh.chap01_beforeVSafter.after.model.vo;

//           �ڽ� Ŭ����        �θ�Ŭ����
//           �ļ� Ķ����        ����Ŭ����
//           ���� Ķ����        ����Ŭ����
//           ���� Ķ����        ����Ŭ����
public class Desktop extends Product{
	// > ��ӹ޴� ���� �ʵ� 4��, �޼ҵ� 9�� ����ó�� �� �� �ִ�.
	
	// �ʵ��
	private boolean allInOne; //��ü ����
	
	// �����ں�
	
	public Desktop() {}
	
	public Desktop(String brand,
			  String pCode,
			  String pName,
			  int price,
			  boolean allInOne) {
		
		// brand, pCode, pName, price,
		// allInOne
		// �ʵ忡 �Ű����� ���� ���� ���� �ʱ�ȭ
		
		// this. : �ڱ� �ڽ��� �ּҰ��� ��� �ִ�.
		// super. : �ش� �θ�ü�� �ּҰ��� ����ִ�.
		// > �ڽİ�ü�� super.���� �θ�Ϳ� ���� �����ϴ�.
		// > ��, �����ϰ��� �ϴ°� private �ϰ���
		// ���� ������ �Ұ��ϴ�!!
		
		
		
		/*
		super.brand = brand;
		super.pCode = pCode;
		super.pName = pName;
		super.price = price;
		*/
		
		
		// > �θ�Ŭ������ Product �� �ִ� �ʵ���
		// �ذ��� 1.
		// �θ�Ŭ������ �ʵ带 �ڽı����� ���� �����ϰԲ�
		// ���� ������ ��¦�� Ǯ������ ���
		// �θ� �ʵ��� ���������ڸ� private --> protected�� ����
		/*
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		*/
		
		// �ذ��� 2. 
		// �θ�Ŭ������ �ִ� public ������������
		// setter �޼ҵ�� Ȱ���ϱ�
		/*
		this.setBrand(brand);
		this.setpCode(pCode);
		this.setpName(pName);
		this.setPrice(price);
		*/
		
		// �ذ���3.
		// �θ� Ŭ������ �����ڸ� ȣ���ϱ�
		// this(brand, pCode, pName,price);
		// > �θ�Ŭ������ �����ڴ� super(); �� ȣ���Ѵ�.
		// (this �� ȣ�� �Ұ�)
		super(brand, pCode, pName,price);
		
		this.allInOne = allInOne;
		// super(brand, pCode, pName,price);
		// > �ݵ�� ù�ٿ� ����ؾ� ��!!
		
		
		
		
	}
	//�޼ҵ��
	//setter �޼ҵ�
	
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	//getter �޼ҵ�
	public boolean isAllInOne() {
		return allInOne;
		
	}
	// information �޼ҵ�
	// > �θ�Ŭ������ �̹� �������� ���¿���
	//   �ڽ�Ŭ�������� ������ ���·� �ٽ� ������ ��Ȳ
	//  �ڵ� ���빰�� ���ƾ��� ��Ȳ == "�������̵�"
	
	public String information() {
		/*
		return super.getBrand()+ ", " +getpCode()+ ", " +getpName()+ ", " +
	getPrice()+ ", " +allInOne;
	*/
		return super.information()+ "," +allInOne;
	}
	
}
