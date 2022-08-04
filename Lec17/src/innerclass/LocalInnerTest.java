package innerclass;

class Outer{
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable runnable = new Runnable() {

		@Override
		public void run() {
			System.out.println("runnable");
		}
		
	};
	
	public Runnable getRunnable(int i){
		
		//final 값은 변화시킬 수 없음
		
		int localNum = 100;

			return new Runnable() {
				@Override
				public void run() {
					// getRunnable의 parameter안에 넣어 놓으면 유효하나 위에 있는 것은 X
					//localNum += 100;
					//i += 200;
					outNum += 100;
					
					System.out.println(outNum);
					System.out.println(sNum);
					System.out.println(localNum);
				}
				
			};
	}
}
public class LocalInnerTest {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		Runnable runnable = outer.getRunnable(20);
		
		runnable.run();
		//outer.getRunnable().run();
		
		//outer에 있는 runnable을 run 시키라는 의미
		outer.runnable.run();
		
	}

}
