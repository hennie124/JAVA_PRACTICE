package tpcclass;

import kr.tpc.BookVo;

public class TPC12 {

	public static void main(String[] args) {
				//생성자 메서드 --> 생성 + 초기화 -> 중복정의
				//1. 객체를 생성할 때 사용되는 메서드
				//2. 객체 생성 후 객체의 초기화하는 역할을 수행함
				//특징
				//1)클래스 이름과 동일한 메서드
				//2)메서드의 return type이 없음(void가 아님)
				//3)public 접근 권한을 가진다. (private 생성자도 있음)
				//4) 생성자가 없을 때는 기본생성자가 만들어진다.
				//중복정의(overloading) : 생성자 메서드를 활용하여 객체를 적절하게 초기화하라
				
		BookVo b1 = new BookVo();
		System.out.print(b1.title+"\t");
		System.out.print(b1.price+"\t");
		System.out.print(b1.company+"\t");
		System.out.println(b1.page);
		
		BookVo b2 = new BookVo("python",19000,"kt",500);
		System.out.print(b2.title+"\t");
		System.out.print(b2.price+"\t");
		System.out.print(b2.company+"\t");
		System.out.println(b2.page);
	}

}
