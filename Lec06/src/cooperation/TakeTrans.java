package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		
		//인스턴스 2
		Student james = new Student("JAMES", 7000);
		Student denial = new Student("Danial", 12000);
		
		//bus100의 정보와 제임스가 지불해야 하는 돈을 가지고 와서 계산 후 출력
		Bus bus100 = new Bus(100);
		james.takeTrans(bus100);
		//제임스가 무슨 버스를 탔고 승객수, 수입, 남은 돈을 보여주는 정보를 출력
		james.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway(2);
		denial.takeTrans2(subwayGreen);
		denial.showInfo();
		subwayGreen.showInfo();
		

	}

}
