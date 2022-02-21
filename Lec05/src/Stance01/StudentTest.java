package Stance01;

public class StudentTest {

	public static void main(String[] args) {
//		Student studentLim = new Student();
//		//클래스 생성 및 연결
//		studentLim.studentName = "임창균";
//		studentLim.address = "서울시 서초구 반포4동";
//		
//		studentLim.showStudentInfor();
			
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
			
			//studentLim = 참조변수 /Stance01.Student@156643d4 = 참조 값 
			
			System.out.println(studentLim);
			System.out.println(studentLee);
			

	}

}
