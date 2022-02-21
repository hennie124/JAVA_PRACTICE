package LoopExample;

public class ForEx02 {

	public static void main(String[] args) {
		int dan;
		int times;
		
		//for 문 중첩문 사용하기
		
		
		for(dan = 2; dan <= 9; dan++) {
			
			for(times = 1; times <= 9; times++) {
				System.out.println(dan + " X "+ times + " = " + dan * times);
			}
			System.out.println("\n");
		}
		
		//while 문 중첩문
		
//		int dan = 2;
//		int times = 1;
//		
//  while(dan <= 9) {
//			times = 1;
//			while(times <= 9) {
//				System.out.println(dan + " X "+ times + " = " + dan * times);
//				times++;
//			}
// 				dan++;
//			System.out.println("\n");
//		}
//
//	}
	
// continue 문 사용하기 
//	int dan = 2;
//	int times = 1;
//	
//while(dan <= 9) {
//  	if((dan % 2)!= 0) {
//  		dan++;
//  		continue;
//  	}
//		times = 1;
//		while(times <= 9) {
//			System.out.println(dan + " X "+ times + " = " + dan * times);
//			times++;
//		}
//				dan++;
//		System.out.println("\n");
//	}
//
//}
		
// n단은 n단까지 곱한 것 보여주기
	
//	int dan = 2;
//	int times = 1;
//	
//while(dan <= 9) {
//		times = 1;
//		while(times <= 9) {
//			if(times > dan) break;
//			System.out.println(dan + " X "+ times + " = " + dan * times);
//			times++;
//		}
//				dan++;
//		System.out.println("\n");
//	}
//
	}

}
