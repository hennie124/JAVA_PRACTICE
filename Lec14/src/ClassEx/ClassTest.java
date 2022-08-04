package ClassEx;

public class ClassTest {

	public static void main(java.lang.String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Person person = new Person();
		
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("ClassEx.Person");
		System.out.println(pClass3.getName());
		
		Class pClass4 = Class.forName("java.lang.String");
		System.out.println(pClass4.getName());
		
		Person p = new Person();
		
		Class pClass = Class.forName("ClassEx.Person");
		
		Person p2 = (Person) pClass.newInstance();
		
		System.out.println(p);
		System.out.println(p2);


	}

}
