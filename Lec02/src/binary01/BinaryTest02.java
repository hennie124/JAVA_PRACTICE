package binary01;

public class BinaryTest02 {
	public static void main(String[] args) {
		int num1 = 0B00000000000000000000000000101; //5의 32비트
		int num2 = -0B00000000000000000000000000101; //-5의 32비트
		
		int sum = num1 + num2;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(sum);
	}

}
