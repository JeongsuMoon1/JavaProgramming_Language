package org.opentutorials.javatutorials._1_variable;

public class VarEx1 {

	public static void main(String[] args) {
		
		int year = 0;
		int age = 14;
		
		System.out.println(year); // 변수 year의 값을 화면에 출력
		System.out.println(age);  // 변수 age의 값을 화면에 출력
		
		year = age + 2000; // 변수 age의 값에 2000을 더해서 변수 year에 저장
						   // 저장되는 순서 : year = age + 2000; -> year = 14 + 2000;(year에 저장된 14를 불러와서 계산한다.) -> year = 2014; 순서로 진행된다.
		age = age + 1;	   // 변수 age에 저장된 값을 1증가시킨다.
						   // 변수의 갑을 읽어다 1을 더한 다음 다시 변수 age에 저장하라는 뜻이다.
						   // age = age + 1; -> age = 14 + 1;(age에 저장된 값을 불러온다) -> age = 15;(age에 15를 저장한다)
		System.out.println(year); 
		System.out.println(age);

	}

}
