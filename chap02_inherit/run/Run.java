package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;

public class Run {

	public static void main(String[] args) {
		
		// �����, �ڵ���, ���� ������ ��ü�� ��Ÿ������
		Airplane a = new Airplane("����747",0.02,"������", 8 ,5);
		Car c = new Car("����",12.5, "SUV",4);
		Ship s = new Ship("���ù�",3,"�",1);
		
		System.out.println(a.information());
		System.out.println(c.information());
		System.out.println(s.information());
		a.howToMove();
		c.howToMove();
		s.howToMove();
	}
	
}
