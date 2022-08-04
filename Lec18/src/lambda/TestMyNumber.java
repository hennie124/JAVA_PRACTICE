package lambda;

public class TestMyNumber {

	public static void main(String[] args) {
		
		//삼항연산자로 인터페이스 넘버를 넘겨서 구현
		MyNumber maxNum = (x,y) -> (x >= y) ? x:y;
		
		int max = maxNum.getMaxNumber(10, 20);
		System.out.println(max);
		
		int i = 100;
		
		MyNumber aaa = new MyNumber() {
			public int getMaxNumber(int num1, int num2) {
				//위의 i 보다 안의 i의 라이프 사이클이 더 크다.
				System.out.println(i);
				return 0;
				
			}
		};
	}

}
