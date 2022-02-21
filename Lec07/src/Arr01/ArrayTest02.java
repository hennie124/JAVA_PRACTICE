package Arr01;

public class ArrayTest02 {

	public static void main(String[] args) {
		double [] num = new double[5];
		int size = 0;
		num[0] = 10.0; size++;
		num[1] = 20.0; size++;
		num[2] = 30.0; size++;
		
		double total = 1;

//		for(int i = 0; i < num.length; i++){
//			System.out.println(num[i]);
//		total += num[i];
//		//total *= num[i] 총 곱한 수는 0.0이 되어버림
//		}
		
		for(int i = 0; i < size ; i++){
			System.out.println(num[i]);
		total *= num[i];
		//total *= num[i] 총 곱한 수는 0.0이 되어버림
		}
		
		System.out.println("total = " + total);

	}

}
