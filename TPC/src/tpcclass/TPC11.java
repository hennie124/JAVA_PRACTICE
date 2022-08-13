package tpcclass;

import kr.tpc.BookVo;

public class TPC11 {

	public static void main(String[] args) {
		// 책 1권을 저장하기 위한 객체 생성하기
		BookVo b = new BookVo();
		b.title="python";
		b.price=16000;
		b.company="ssg";
		b.page=300;
		
		System.out.print(b.title+"\t");
		System.out.print(b.price+"\t");
		System.out.print(b.company+"\t");
		System.out.println(b.page);
		
		BookVo b1 = new BookVo();
		b1.title="flutter";
		b1.price=20000;
		b1.company="kiwoom";
		b1.page=400;
		
		System.out.print(b1.title+"\t");
		System.out.print(b1.price+"\t");
		System.out.print(b1.company+"\t");
		System.out.println(b1.page);
		
		
	}

}
