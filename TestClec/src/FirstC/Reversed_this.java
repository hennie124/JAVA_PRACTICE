package FirstC;

public class Reversed_this {

	String name = "Hyeonjin's JAVA";
	String address = "Seoul";
	Reversed_this(String name){
		System.out.println(name);
		System.out.println(address);
		System.out.println(this.name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Reversed_this("Hyeonjin");
	}

}
