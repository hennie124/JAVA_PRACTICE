package tpcclass;

//Book을 메인에 사용한다.
import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {

	public static void main(String[] args) {
		// 관계를 이해하기 PDT vs UDDT
		// 정수 1개를 저장하기 위한 변수를 선언하시오
		
		int a;
		a = 10;
		
		// 책 1권을 저장하기 위한 변수를 선언하시오(여기는 main 폴더)
		// b는 책 안의 변수가 아니라 b 안에 Book의 번지를 넣어주는 것이다.
		//Book은 사용자 정의 자료형이다.
		//사용자 정의 자료형 : 객체 자료형/ 필요에 의해 새로 만들어서 사용하는 것
		//만드는 도구,설계하는 도구로 만들어서 사용 : class (modeling tools)
		
		//b는 book의 객체 변수!! --> 데이터를 1개만 저장
		//VO,DTO 데이터를 감싸고 있는 덩어리
		
		Book b;
		//번지가 저장 --> 실체(instance)를 가리키는 객체 변수,인스턴트 변수
		b=new Book(); 
		b.title = "자바";
		b.price = 15000;
		b.company = "한빛미디어";
		b.page = 700;
		
		System.out.println(b.title + "\t");
		System.out.println(b.price + "\t");
		System.out.println(b.company+ "\t");
		System.out.print(b.page+"\n");
		
		PersonVO p;
		p = new PersonVO();
		p.name = "박성한";
		p.age = 25;
		p.weight =  75.2f;
		p.height = 180.4f;
		
		System.out.print(p.name +"\t");
		System.out.print(p.age +"\t");
		System.out.print(p.weight +"\t");
		System.out.print(p.height +"\t");

		
	}

}
