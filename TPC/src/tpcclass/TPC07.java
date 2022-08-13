package tpcclass;

public class TPC07 {

	public static void main(String[] args) {
		// 메서드의 매개변수 전달기법
		//Call by value (값 전달 기법)
		//기억공간이 개별적으로 생성됨
		// 호출조건 
		//1) 보내는 쪽 인수(실인수)와 받는 쪽 인수(가인수)의 갯수가 같아야 함
		//2) 실인수와 가인수의 데이터타입이 같아야한다.
		
		//Call by reference (번지전달 기법)
		// 배열생성 + 초기화(중괄호 열고 닫는 것의 안에 있는 부분이 초기화 리스트라고 한다.)
		// 배열에는 번지라는 것이 저장되어 있다.
		// 번지를 method에 전달하는 것
		// 기억공간의 이름은 다르나 정보가 같음 (공유한다.)
		
		//Call by value
		int a = 20;
		float b =56.7f;
		
		// a+b =?
		float c= sum(a,b); //call by value
		System.out.println(c);
		
		//Call by reference
		int[] arr = {1,2,3,4,5};
		int vv=arrSum(arr); //call by reference
		System.out.println(vv);
	
	}
	public static float sum(int a, float b) {
		float c = a+b;
		return c;
	}
	
	public static int arrSum(int[] x) {
		int hap = 0;
		for(int i = 0; i<x.length; i++) {
			hap += x[i];
		}
		return hap;
		
	}

}
