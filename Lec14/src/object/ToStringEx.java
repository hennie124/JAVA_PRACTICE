package object;

class Book{
	String title;
	String author;
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}

	//재정의가 안된 상태에서 title과 author를 출력하고 싶을 때는 Override로 재정의 한다.
	
	@Override
	public String toString() {
		return title + "," + author;
	}
	
}

public class ToStringEx {

	public static void main(String[] args) {
		//to String()이 재정의가 안됨
		Book book = new Book("모자","김광남");
		System.out.println(book);
		
		//String 안에 to String()이 재정의가 되어있어서 출력물이 "test"가 나
		String str = new String("test");
		System.out.println(str);

	}

}
