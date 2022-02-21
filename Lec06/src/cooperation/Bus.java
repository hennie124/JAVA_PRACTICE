package cooperation;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	//버스 넘버를 먼저 받고 나머지를 받는다.
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	//take의 역할은 승객수가 증가할 때, 돈이 증가
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("버스 " + busNumber + " 번의 승객은 " +passengerCount
				+ "명이고, 수입은 " + money + "입니다.");
	}
}
