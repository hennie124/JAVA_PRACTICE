package FirstC;

public class K5 {
	int CarNumber = 12345;
	String getTire() {
		return "k5_tire";
	}
	
	String getBody() {
		return "K5_body";
	}
	//String createCar() {
	//	
	//	String car = getTire()+getBody();
	//}
	
	String createCar() {
		
		return getBody()+getTire();
	}
	
	//Main method가 없어서 오류가 났었다. Main 구분 잘 하고 정확히 코드 작성하
	public static void main(String [] ar) {
			K5 car = new K5();
			
			System.out.println(car.getTire());
			System.out.println(car.getBody());
			System.out.println();
			System.out.println(car.createCar()+"\nNumber: "+car.CarNumber);
	}

}
