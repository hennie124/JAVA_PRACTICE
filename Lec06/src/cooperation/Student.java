package cooperation;

public class Student {
	
	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
//	
//	//버스를 탔을 때 받을 생성된 인스턴스를 매개변수 bus라고 지정한다. Bus는 객체
//	public void takeBus(Bus bus) {
//		//객체의 협업, Student에서 bus를 호출해서 정보를 가져온다. 
//		//-> Bus에서의 승객수와 비용은 증가하고 
//		//Student에서의 돈은 감소한다.
//		//(왜? Student가 Passenger가 되므로 비용을 지불해야 되니까)
//		bus.take(1000);
//		money -= 1000;
//		
//	}
//	
//	public void takeSubway(Subway subway) {
//		subway.take(1500);
//		money -= 1500;
//		
//	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + " 입니다.");
	}
	
	public void takeTrans(Bus bus100) {
		bus100.take(1000);
		money -= 1000;
	}
	
	public void takeTrans2(Subway subwayGreen) {
		subwayGreen.take(1500);
		money -= 1500;
	}

}
