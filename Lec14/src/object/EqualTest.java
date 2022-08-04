package object;

class Student{
	int studentID;
	String studentName;
	
	Student(int studentID,String studentName){
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(studentID == std.studentID)
				return true;
			else 
				return false;
		}
		return false;
	}

	//equals에서 재정의한 부분에서의 같은 부분인 studentID를 이용해서 return을 잡아라.
	
	@Override
	public int hashCode() {
		return studentID;
	}
	
	
	
	
}

public class EqualTest {

	public static void main(String[] args) {
		String str1 = new String("test");
		String str2 = new String("test");
		
		// '==' 부호가 다르다. heap memory가 다르기 때문
		System.out.println(str1 == str2);
		
		//두 가지의 인스턴스가 동일한 지 보는 것 (문자열이 같냐 --> 논리적인 판별)
		System.out.println(str1.equals(str2));
		
		//hashCode의 값이 왜 똑같은가? 재정의 되어있기 때문
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		//원래의 값을 보고 싶다면?
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		Student std1 = new Student(10001,"Tyler");
		Student std2 = new Student(10001,"Tyler");
		
		// == 과 equals가 같은 영향을 미침 --> override
		System.out.println(std1 == std2);
		System.out.println(std1.equals(std2));
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());

	}

}
