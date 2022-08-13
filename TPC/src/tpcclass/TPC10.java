package tpcclass;

import kr.tpc.BookDTO;

public class TPC10 {

	public static void main(String[] args) {
		// PDT VS UDDT
		//PDT - 기본자료형, 컴파일러에서 기본적으로 제공해주는 자료형
		//UDDT - 사용자정의자료형, 사용자가 직접 만들어서 사용하는 자료형
		
		//int,float,char,boolean -> PDT
		int a = 10;
		
		//책이라는 자료형을 만들자 -->class
		BookDTO b=new BookDTO();
		b.title="자바"; //.은 접근,참조연산자
		b.price=17000;
		b.company="영진";
		b.page=300;
		
		System.out.print(b.title+"\t");
		System.out.print(b.price+"\t");
		System.out.print(b.company+"\t");
		System.out.print(b.page+"\t");
	}

}
