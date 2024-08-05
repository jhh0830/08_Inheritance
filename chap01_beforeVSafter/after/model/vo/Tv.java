package com.kh.chap01_beforeVSafter.after.model.vo;


//              Ȯ���ϰڴ�.
// > �θ�Ŭ������ �ڵ带 ������� + �� �ڵ带 �߰� �ؼ�
public class Tv extends Product{
	
	// �ʵ��
	
	private int inch; // ��ġ
	
	
	// �����ں�
	public Tv() {}
	public Tv(String brand,
			String pCode,
			String pName,
			int price,
			int inch) {
		// super(); // �θ�Ŭ������ "�⺻������"�� ȣ��
		super(brand, pCode, pName,price);
		this.inch = inch;
	}
	
	//�޼ҵ��
	//setter /getter
	
	public void setInch(int inch) {
		this.inch = inch;
		
	}
	public int getInch() {
		return inch;
	}
	
	
	// information �޼ҵ� �������̵�
	public String information() {
		return super.information() + " , "+inch;
	}
}
