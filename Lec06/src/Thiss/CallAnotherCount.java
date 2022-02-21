package Thiss;

class Person{
	String name;
	int age;
	
	public Person() {
//		name = "이름없음";
//		age = 10;
		this("이름없음", 1);
		
	}

	public Person(String name,int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public Person returnSelf() {
		return this;
	}
	
}

public class CallAnotherCount {

	public static void main(String[] args) {

		Person p1 = new Person();
		System.out.println(p1.name);
		System.out.println(p1.returnSelf());
		
	}

}
