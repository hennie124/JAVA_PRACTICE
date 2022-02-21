package LoopExample;

public class BreakEx01 {

	public static void main(String[] args) {
		int sum = 0;
		int num = 1;
	
//		while(sum < 100) {
//			sum += num;
//			num++;
//		}
//		
//		System.out.println(sum);
//		//sum이 100을 넘는 순간의 숫자는 num+1이다.
//		System.out.println(num);
//		
		while(true) {
			sum += num;
			if(sum > 100) 
					break;
				num++;
			
		}
		
		System.out.println(sum);
		//sum이 100을 넘는 순간의 숫자 num이다.
		System.out.println(num);
	}

}
