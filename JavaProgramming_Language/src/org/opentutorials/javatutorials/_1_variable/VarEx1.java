package org.opentutorials.javatutorials._1_variable;

public class VarEx1 {

	public static void main(String[] args) {
		
		int year = 0;
		int age = 14;
		
		System.out.println(year); // ���� year�� ���� ȭ�鿡 ���
		System.out.println(age);  // ���� age�� ���� ȭ�鿡 ���
		
		year = age + 2000; // ���� age�� ���� 2000�� ���ؼ� ���� year�� ����
						   // ����Ǵ� ���� : year = age + 2000; -> year = 14 + 2000;(year�� ����� 14�� �ҷ��ͼ� ����Ѵ�.) -> year = 2014; ������ ����ȴ�.
		age = age + 1;	   // ���� age�� ����� ���� 1������Ų��.
						   // ������ ���� �о�� 1�� ���� ���� �ٽ� ���� age�� �����϶�� ���̴�.
						   // age = age + 1; -> age = 14 + 1;(age�� ����� ���� �ҷ��´�) -> age = 15;(age�� 15�� �����Ѵ�)
		System.out.println(year); 
		System.out.println(age);

	}

}
