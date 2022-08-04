package innerclass;

class OutClass{
	
	private int num = 10;
	private static int sNum = 20;
	InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass{
		int inNum = 200;
		//static int sInNum = 100; --> 인스턴스 내부에서는 static으로 지정할 수 없다.
		 
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
		}
		
	}
	
	public void usingInTest() {
		inClass.inTest();
	}
	
	static class InStaticClass{
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			//num += 10; --> 외부 클래스의 변수이기 때문에 못 쓰임
			//정적 내부 클래스이기 때문에 num이 아닌 sNum이 안에서 쓰인다.
			sNum += 10;
			System.out.println(sNum);
			System.out.println(iNum);
			System.out.println(sInNum);
		}
		
		static void sTest() {
			//num += 10; --> 외부 클래스의 변수이기 때문에 못 쓰임
			//정적 내부 클래스이기 때문에 num이 아닌 sNum이 안에서 쓰인다.
			sNum += 10;
			System.out.println(sNum);
			// System.out.println(iNum); --> 외부 클래스의 변수
			System.out.println(sInNum);
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {
		
		OutClass outClass = new OutClass();
		outClass.usingInTest();
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
//		outClass.inClass.inTest();
//		
//		OutClass.InClass inClass = outClass.new InClass();
//		inClass.inTest();
		
		OutClass.InStaticClass.sTest();
	}

}
