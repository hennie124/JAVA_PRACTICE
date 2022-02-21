package FirstC;

public class ReversedWord_this {
	
	String name;
	String address;
	int age;

	public static void main(String[] args) {
		new ReversedWord_this();
		System.out.println("-------------fin--------------");

	}
	
	ReversedWord_this(){
		this("hyeonjin");
		System.out.println(
				"name : " +this.name + "\n"+
				"address : " +this.address + "\n" +
				"age : " +this.age + "\n"		
				);
		System.out.println("---------------1----------------");
	}

	ReversedWord_this(String address) {
		//this(address,"Seoul");
		this.address = address;
		System.out.println(
				"name : " +this.name + "\n"+
				"address : " +this.address + "\n" +
				"age : " +this.age + "\n"		
				);
		System.out.println("---------------2----------------");

			}
	
}
