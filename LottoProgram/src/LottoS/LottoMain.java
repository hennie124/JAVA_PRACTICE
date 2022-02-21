package LottoS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1. 1~45의 숫자 중 랜덤으로 6개 생성되어야 한다.
// 2. 중복되는 수는 없어야 한다
// 3. 보너스숫자도 추첨되게 해야한다.

public class LottoMain {
	
	private int command = 0 ;
	
	private BufferedReader in;
	private LottoPro program = null;
	
	public final int RECOMMANDATION_NUMBER = 1;
	public final int PRINT_NUMBER = 2;
	public final int EXIT = 3;
	
	//main 함수에서 LottoMain의 인스턴스를 호출하였으므로 제일 먼저 생성자인 이곳에 실행되게 한다.
	public LottoMain() {
		
		//생성자에게 필요한 변수를 초기화 한다.
		in = new BufferedReader(new InputStreamReader(System.in));
		
		//주석 순서대로 풀면서 확인하
		program = new LottoPro(true);
		//program = new LottoPro(false);
		//program = new LottoPro();
		
		start();
		//메인함수 내에서 실행되는 것이 아니라 메인함수가 생성한 자신의 인스턴스에 의해 실행되므로
		//static 메서드가 아닌 start를 실행 할 수 있습니다.
		
	}


	private void start() {
		// 이렇게 프로그램을 동작시킬 메서드를 하나 만들어서 관리하는 것이 편합니다.
		System.out.println("로또 프로그램이 시작됩니다.");
		
		for(int i = 1; i < 11; i++) {
			System.out.println(i * 10 + "%");
			if(i == 10) 
				System.out.println("환영합니다.");
		}
		System.out.println();
		do {
			System.out.println("--------MENU---------");
			System.out.println("1. 추첨 2. 보기 3. 끝내기 ");
			System.out.println(">>");
			try {
				this.command = Integer.parseInt(in.readLine());
			}catch(IOException e){
				System.out.println("(System)IOException !! try again..");
				continue;
			}
			switch(this.command) {
			case RECOMMANDATION_NUMBER:
				program.start_recommandation();
				break;
				
			case PRINT_NUMBER:
				program.printNumber();
				break;
				
			case EXIT:
				System.out.println("(System) bye!");
				return;
			}
		}while(true);
		
	}
	
	public static void main(String[] arc) {
		new LottoMain();
	}

}
