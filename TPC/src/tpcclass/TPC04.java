package tpcclass;

public class TPC04 {

	public static void main(String[] args) {
		// 변수와 배열 
		// 변수를 개별적으로 만드는 방법의 단점
		// 1) 데이터 처리가 복잡함
		// 2) 데이터 이동이 어려움
		// 3) 데이터를 한 개만 저장가능함
		// 조작 -> 이동 -> method
		
		
		//배열 : 동일한 타입의 데이터를 여러개 저장하기 위한 연속적인 메모리 구조
		//배열의 특징
		// 1) 많은 수의 변수를 만들기가 용이함
		// 2) 기억공간의 접근이 쉬움 (반복문 사용 )
		// 3) 데이터의 이동이 쉬움(데이터를 하나의 형태로 담아서 이동 가능)
		// 단점: 서로 다른 데이터 타입을 저장할 수 없음
		
		//변수 예시
		int a,b,c;
		a=10;
		b=20;
		c=30;
		//a+b+c=? 매서드 처리 -> hap()
		hap(a,b,c);
		
		int[] arr = new int[3];
		arr[0]= a;
		arr[1]= b;
		arr[2]= c;
		
		hap1(arr);
	}
	
	public static void hap(int x, int y, int z) {
		int sum = x+y+z;
		System.out.print(sum+"\n");
	}

	public static void hap1(int[] x) {
		//반복문 활용 - for,while문
		//int sum = x[0]+x[1]+x[2];
		int sum = 0;
		for(int i = 0; i<x.length; i++) {
			sum+=x[i];
		}
		System.out.println(sum);
		
	}
	
	
}
