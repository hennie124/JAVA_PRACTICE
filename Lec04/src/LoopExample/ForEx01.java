package LoopExample;

public class ForEx01 {

	public static void main(String[] args) {
		//int num;
		int sum = 0;
		
		for(int num = 1;num <= 10 ; num++) {
			sum += num;
		}
		
//		for(int num = 1;num <= 10 ; ) {
//			sum += num;
//			num++;
//		}
		
//		for(num = 1,sum = 0;num <= 10 ; num++) {
//			sum += num;
//		}
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
	}

}
