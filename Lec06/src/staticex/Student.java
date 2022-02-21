package staticex;

public class Student {
	
	private static int serialNum = 10000;
	int studentID;
	String studentName;
	
	// constructor 호출
	public Student() {
		serialNum++;
		studentID = serialNum;
	}

	//serialNum 값을 가져간다. 
	
	public static int getSerialNum() {
		
		int i = 10; //지역변수
		
		i++;
		System.out.println(i);
		
		//StudentName은 전역변수이므로 지역에 사용X--> StudentName = "홍길동";
		
		//serialNum =  Static변수
		
		return serialNum;
	}

//	public static void setSerialNum(int serialNum) {
//		Student.serialNum = serialNum;
//	}
	
	
}
