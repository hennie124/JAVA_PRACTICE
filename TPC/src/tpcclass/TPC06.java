package tpcclass;

public class TPC06 {

	public static void main(String[] args) {
		// 변수: 데이터를 1개만(1개의 형태) 저장 가능함
		//메서드: 동작을 한 후에 데이터를 1개만 만들어낸다 -> 동작 후 저장
		//메서드 이름이 변수 역할을 한다
		//접근제어자 리턴타입 메서드이름(매개변수 리스트){
		// 처리부분 
		// 리턴여부 -> return
		//}
		
		//method 선언 = 정의부(접근제어 및 메서드 이름 정의)+구현부(처리와 리턴)
		
		//메서드 -> 동작(method),기능(function)
		int a = 67;
		int b = 98;
		
		int result=sum(a,b);
		
	System.out.println(result);
	
	
	int [] x = makeArr();// 10,20,30의 형태가 넘어감
	int hap=0;
	for(int i=0;i<x.length;i++) {
		hap+=x[i];
	}
	System.out.println(hap);
	}
	//정수 2개를 매개변수로 받아서 총합을 구하여 리턴하는 메서드를 정의하시오
	private static int sum(int a, int b) {
		int v = a+b;
		return v;
	}
	
	// 10,20,30
	public static int[] makeArr() {
		int [] x = new int [3];
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		
		return x;
	}

}
