package aaa;

public class FunctionTest {
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		// 선언하고 더한 것을 sum 값으로 지정한다.
		int sum = addNum(num1,num2);
		System.out.println(sum);
		
	}
	
	//함수 선언 및 더하기
	public static int addNum(int n1,int n2) {
		int result = n1+n2;
		return result;
		
	}
	

}
