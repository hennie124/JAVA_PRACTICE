package LoopExample;

public class WhileEx1 {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		//누적 될 sum 값은 초기화 해주어야 함
		
		while(num <= 10) {
			sum += num;
			// num += 1;
			 num++;
		}
		
		// 무한루프를 이룰려고 한다면 true를 넣는다.
//		while(true) {
//			sum += num;
//			// num += 1;
//			 num++;
//		}
		do {
			sum += num;
			 num++;
		}while(num <= 10) ;
		
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");

	}

}
