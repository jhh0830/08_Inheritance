package com.kh.chap01_beforeVSafter.before.run;

import com.kh.chap01_beforeVSafter.before.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.before.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.before.model.vo.Tv;

public class BeforeRun {

	public static void main(String[] args) {

		
		
		// Desktop ��ü
		
		Desktop d = new Desktop("�Ｚ", "d-01", "���ֵ̹���ũž", 2300000, true);
		
		// Tv��ü
		Tv t = new Tv("����", "t-01", "����޺�����Ƽ��", 3500000, 100);
		
		//SmartPhone ��ü
		SmartPhone s = new SmartPhone("����", "s-01", "������", 1230000, "SKT");
		
		System.out.println(d);
		System.out.println(t);
		System.out.println(s);
		// > �ּҰ� �״�� ���
		System.out.println(d.informaition());
		System.out.println(t.informaition());
		System.out.println(s.informaition());
		
		/*
		 * * �� Ŭ�������� �ߺ��� �ڵ���� ������ ����صΰ� �Ǹ�
		 * �ڵ带 �ۼ��ϴ� �������� �Ǽ��� ���ɼ��� ���� �Ӹ� �ƴ϶�
		 * ������ ���� �������� �� �Ź� �ش� �ڵ带 ������ ã�Ƽ�
		 * ���� �� �����ؾ��ϴ� ���ŷο��� ����!!
		 * 
		 * 
		 * * "���" �̶�� ������ ������Ѽ�
		 * �� Ŭ���� ���� �ߺ��� �ʵ�, �޼ҵ����
		 * �� �ѹ��� �� �ϳ��� Ŭ������ �����ص� ��
		 * �ش� Ŭ������ �ڵ带 ������ ���� �������� ����
		 */
	}

}
