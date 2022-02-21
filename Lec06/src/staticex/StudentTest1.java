package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		//studentJ는 참조변수인데 그렇게 쓰지말고 class이름으로 참조변수를 사용하자..!
		Student studentJ = new Student();
		//studentJ.serialNum++;
		System.out.println(studentJ.studentID);
		
		Student studentD = new Student();
		System.out.println(studentD.studentID);
		
		//두 인스턴스가 공유하고 있다는 것을 보여줌!
		
		//class이름으로 참조변수를 사용하자..!
		System.out.println(Student.getSerialNum());
		System.out.println(Student.getSerialNum());

	}

}
