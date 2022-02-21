package chapter;

public class OperationEx5 {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;
		
		int result = num1 & num2; // 두 비트가 모두 1인 경우만 1 아니면 0
		int result2 = num1 | num2; // 두 비트가 모두 0인 경우만 0 아니면 1

		
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(num1 << 1); // 1로 왼쪽 밀기
		System.out.println(num1 << 2); // 2로 왼쪽 밀기 5에 4를 곱함
		
		System.out.println(num1 >> 1); // 1로 오른쪽 밀기(나누기 2)
		System.out.println(num1 >> 2); // 2로 오른쪽 밀기 (나누기 4)
		
		System.out.println(num1 >>> 1); // 1로 오른쪽 밀기
		
		


	}

}
