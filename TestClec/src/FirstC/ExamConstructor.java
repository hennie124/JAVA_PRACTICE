package FirstC;

public class ExamConstructor {
	
	//전역변수
	private int x,y;
	
	//public void setXY(int x, int y) { --> 이건 지역변수
	
	public void setXY(int x, int y) {
		// 객체는 물리적으로 존재하거나 추상적으로 생각할 수 있는 것 중에서
		// 자신의 속성을 가지고 있고 다른 것과 식별 가능한 것을 말한다.
		
		//this는 자기자신의 객체를 가리키는 역할을 한다.
		// this = 지역변수와 전역변수를 잇는 역할? 
		//예시로는 "내 친구 X인데 니가 아는 대구에서 온 정이 얘가 내 친구 X라고 하더라~" 요런 느낌?
		this.x = x;
		this.y = y;
	}
	
	public void printXY() {
		System.out.println("X 좌표 : " + x + "\n Y좌표 : "+ y);
	}

	public static void main(String[] args) {
		// Constructor는 어떤 프로그램의 기초를 건설하고 다지는 역할을 한다.
		
		ExamConstructor constructor = new ExamConstructor();
		
		//전역변수에 지정한 값이 없으니 x,y 값 둘 다 0
		constructor.printXY();
		
		//setXY()함수 안에 각각 10,20을 넣으니 x,y 값은 각각 10,20이 됨.
		constructor.setXY(10, 20);
		
		constructor.printXY();

	}

}
