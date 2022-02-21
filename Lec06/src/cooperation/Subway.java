package cooperation;

public class Subway {
	int lineNumber;
	int passengerCount;
	int money;
	
	//지하철 호선 넘버를 먼저 받고 나머지를 받는다.
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
//	public Subway(int lineNum) {
//		lineNumber = lineNum;
//	}
	
	//take의 역할은 승객수가 증가할 때, 돈이 증가
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("지하철 " + lineNumber + " 호선의 승객은 " +passengerCount
				+ "명이고, 수입은 " + money + "입니다.");
	}

}
