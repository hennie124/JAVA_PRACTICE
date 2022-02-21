package ArrayList;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLim = new Student(1001,"Lim");
		studentLim.addSubject("국어",100);
		studentLim.addSubject("수학",98);
		studentLim.showStudentInfo();
		System.out.println("===============");
		Student studentLee = new Student(1001,"Lee");
		studentLee.addSubject("국어",70);
		studentLim.addSubject("수학",81);
		studentLee.showStudentInfo();

	}

}
