package ClassEx;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class String {

	public static void main(java.lang.String[] args) throws ClassNotFoundException {
		
		Class strClass = Class.forName("java.lang.String");
		
		Constructor[] cons = strClass.getConstructors();
		
		for(Constructor c : cons) {
			System.out.println(c);
		}
		
		Field[] fields = strClass.getFields();
		
		for(Field f : fields) {
			System.out.println(f);
		}
		
		Method[] method = strClass.getMethods();
		
		for(Method m : method) {
			System.out.println(m);
		}
	}

}
