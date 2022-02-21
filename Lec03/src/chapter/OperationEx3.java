package chapter;

public class OperationEx3 {

	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10 ) || ((i = i + 2) > 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i); // 앞의 것이 false 이기 때문에 연산이 안됨
		
	}

}
