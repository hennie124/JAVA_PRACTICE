package LottoS;

public class LottoPro {
	
	private boolean duplicate = false;
	private boolean can_bonus;
	private int [] numbers;
	
	public LottoPro() {
		// LottoPro의 생성자 부분 중 하나는 아무런 인자도 받지않은 default 형 생성자이며 
		//다른 하나는 boolean 값을 인자로 받는 생성자입니다.
		
		System.out.println("(System) 보너스 추첨은 불가합니다.");
		can_bonus = false;
	}

	public LottoPro(boolean can_bonus) {
		System.out.println("(System) 보너스 추첨은 가능합니다.");
		this.can_bonus = can_bonus;
	}

	public void printNumber() {
		if(numbers==null||numbers[0]==0) {
			System.out.println("(System)Empty Value");
			return;
		}
		for(int i = 0; i <numbers.length;i++) {
			if(i==6) {
				System.out.println("(Bonus)>>>"+numbers[i]);
			}else {
				System.out.println(">>>"+numbers[i]);
			}
		}
	}
	
	public int[] start_recommandation() {
		if(can_bonus) {
			numbers = new int[7];
		}else {
			numbers = new int[6];
		}
		int [] imsi =getNormalNumber(); // 로또번호 6개 생
			for (int i = 0; i < numbers.length;i++) {
				if(i==6) {
					numbers[i] =getBonusNumber(numbers); 
					// 만약 보너스번호가 있다면 보너스번호 생
				}else {
					numbers[i] = imsi[i];
				}
			}
			return numbers;
		}
	
	
	public int getBonusNumber(int[] normal_number) {
		int bonus = 0;
		int imsi = 0;
		
		while(true) {
			//random 함수는 0.0 ~ 0.999.. 까지 랜덤으로 난수를 생성하는 함수입니다.
			imsi = (int) (Math.random() * 45 + 1);
			for(int j = 0; j<normal_number.length;j++) {
				if(normal_number[j] == imsi) {
					duplicate = true;
				}
			}
			if (duplicate) {
				duplicate = true;
				continue;
			}else {
				break;
			}
			
		}
		bonus = imsi;
		System.out.println("(System) Success Create Bonus Number");
		return bonus;
		
	}
	
	public int[] getNormalNumber() {
		int[] normal_number = new int[6];
		int imsi = 0;
		
	
			
			for(int i = 0; i<normal_number.length;i++) {
				//random 함수는 0.0 ~ 0.999.. 까지 랜덤으로 난수를 생성하는 함수입니다.
				imsi = (int) (Math.random() * 45 + 1); 
				
				for(int j = 0; j < i; j++) {
					if(normal_number[j] == imsi) {
						duplicate = true;
					}
				}
				if (!duplicate) {
					normal_number[i] = imsi;
				}else {
					duplicate = true;
					i--;
				}
			}
			System.out.println("(System) Success Create Bonus Number");
			return normal_number;
	
		
	}
	
	

}
