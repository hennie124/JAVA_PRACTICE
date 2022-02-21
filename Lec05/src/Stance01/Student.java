package Stance01;

public class Student {

	int studentID;
	String studentName;
	int grade;
	String address;
	
	//default 생성자 이름과 아이디를 받고싶다. 
	//다른 생성자가 없어야한다. --> 안그러면 default 생성자가 제 역할을 못한다. 
//	public Student(int id, String name) {
//		studentID = id;
//		studentName = name;
//	}
	
	public void showStudentInfor(){
		System.out.println(studentName + "\n" + address);
		}
	
//	public static void main(String[] args) {
//		Student studentLim = new Student();
//		studentLim.studentName = "임창균";
//		studentLim.address = "서울시 서초구 반포4동";
//		studentLim.showStudentInfor();
//
//	}
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String name) {
		studentName = name;
	}
	//객체의 필수요소는 아님 다른 클래스에서 사용하는 게...
	public static void main(String[] args) {
		
		// int i = 10;
		
		Student studentLim = new Student();
		studentLim.studentName = "임창균"; //참조변수
		studentLim.studentID = 126;
		studentLim.address = "서울시 서초구 반포4동";
		
		Student studentLee = new Student();
		studentLee.studentName = "이주헌"; //참조변수
		studentLee.studentID = 106;
		studentLee.address = "서울시 서초구";
		
		studentLim.showStudentInfor();
		studentLee.showStudentInfor();
		
	}
}
