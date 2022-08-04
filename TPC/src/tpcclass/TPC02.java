package tpcclass;


public class TPC02 {

	public static void main(String[] args) {
		//프로그래밍의 3대 요소 : 변수, 자료형(Data Type), 할당(equal)
		//예시) 1+1 = 2라고 하는 프로그램을 만들어야 한다.
		//1. 메모리에서 계산(숫자를 저장할 수 있는 기억공간)
		//2. 기억공간 이름을 만든다. = 변수 (variable) 
		// 기억공간 고려사항 1) 크기 2) 어떤 종류의 데이터를 저장할 것인가
		// 변수 종류와 크기를 결정하는 것 = 자료형(Data Type)
		//자료형 종류 int = 정수 float = 실수 char = 문자 boolean = 참/거짓
		// 기억공간에 자료형을 넣고 싶다면 (자료형)(변수) 순서로 선언한다.
		//기억공간 안에 있는 메모리는 저장되어 다른 파일에서도 사용가능하다.
		//기억공간 안에 있는 메모리는 저장 = 할당(assign)
		
		
		int a,b,c;
		a = 1; 
		b = 1;
		c = a+b;
		
		System.out.println(c);
		
		float f; //float,double
		f = 34.5f; // 변수형 f float f는 달라!!!
		System.out.println(f);
		
		char d;
		d = 'A'; //char은 ''로만 저장해야 char로 저장됨 ""은 string으로 저장됨
		System.out.println(d);
		
		boolean g;
		g = true; // false , true
		System.out.println(g);
		
		//책의 변수를 bk로 잡아보자 
		// Book을 class 로 설계해보자 --> 책: 제목,저자,출판사,가격....
		//사용자정의형 자료형
		//Book bk;
		
	}

}
