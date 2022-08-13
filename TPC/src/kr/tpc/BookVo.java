package kr.tpc;
//책(object) -> 제목,가격,출판사,페이지수...
public class BookVo {
	public String title;
	public int price;
	public String company;
	public int page;
	//디폴트메세지생성자(생략)
	
	public BookVo() {
		//초기화
		//this.은 본인 자신을 지칭하기 위해 사용됨
		this.title="자바";
		this.price=10000;
		this.company="Lg";
		this.page=500;
	}
	//생성자 메서드의 중복정의(overloading)
	public BookVo(String title,int price,String company,int page) {
		this.title=title;
		this.price=price;
		this.company=company;
		this.page = page;
	}
	
}
