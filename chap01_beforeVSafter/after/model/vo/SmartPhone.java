package com.kh.chap01_beforeVSafter.after.model.vo;
//                   -------->
// > Ŭ���� ���̾�׷������� �ڽ�Ŭ������ �θ�Ŭ������ ��� �������� ȭ��ǥ�� ǥ����
public class SmartPhone extends Product{
	
	// �ʵ��
	private String mobileAgency;
	
	// �����ں�
	public SmartPhone() {}
	public SmartPhone(String brand,
					  String pCode,
					  String pName,
					  int price,
					  String mobileAgency) {
		super(brand,pCode,pName,price);
		this.mobileAgency = mobileAgency;
	}
	
	//�޼ҵ��
	// setter / getter
	
	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	
	public String getMobileAgency() {
		return mobileAgency;
	}
	
	public String information() {
		return super.information() + ", " + mobileAgency;
	}
}
