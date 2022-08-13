package tpcclass;

public class TPC08 {

	public static void main(String[] args) {
		// method area/ stack area / heap area / literal area
		//1.해당클래스를 현재 디렉토리에서 찾는다
		//2.찾으면 클래스 내부에 있는 static 키워드가 있는 메서드를 메모리로 로딩함
		// - method area의 static zone에 로딩한다. main(),add() method
		//3.static zone에서 main() 메소드를 실행한다.(호출,시작)
		//-main() method가 호출되면 main method의 호출정보가 Stack area에 들어간다.(push)
		//-프로그램이 시작되는 부분이다.(pc의 위치가 현재 동작되고 있는 메서드다.)
		//4.stack area가 비어 있으면 프로그램이 종료된 것이다.
		
		//method area는 static zone과 non-static zone으로 나뉨
		//static zone은 static안의 main(), add() 메모리가 올라온다.
		//static zone에서 main() method를 호출하고 그 다음 add()을 호출한다.
		
		//stack area에서의 메서드는 실행되는 것이 아니다.
		//메서드가 호출되면 메서드의 호출정보가 저장되는 영역(call stack frame area)
		//메서드를 호출시켜서 생기는 영역은 지역변수라고 한다.
		//main()안에서 add()를 호출하여 적용시킨다.
		
		//heap area는 TPC08의 add()의 객체가 생성되는 영역이다.
		//객체가 생성되는 영역(new 연산자)
		//번지를 프린트하고 있는 부분
		//tpc가 만들어지는 부분이며, 자신이 만든 객체를 포인터로 연결되어 가리키고 있는 부분이다.
		
		//literal area는 문자열(객체) 상수가 저장되는 영역
		
		int a = 30;
		int b = 50;
		int v =add(a,b); //static method를 호출
		System.out.println(v);
		
	}
	//static 은 자동으로 메모리를 로딩하기 위해 만들어진 영역
	public static int add(int a,int b) {
		int sum=a+b;
		return sum;
	}

}
