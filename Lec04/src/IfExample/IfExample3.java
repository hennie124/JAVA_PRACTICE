package IfExample;

public class IfExample3 {

	public static void main(String[] args) {
		int age = 9 ;
		int charge = 0;
		
		//if문은 들어가서 안되면 출력이 안되고 밑의 if문으로 들어가서 비교함 여러번 비교를 하기 때문에 중첩될 수 있음
		if (age < 8) {
			charge = 1000;
			System.out.println("미취학 아동입니다.");
		}
		if (age < 14){
			charge = 2000;
			System.out.println("초등학생 입니다.");
		}
		if (age < 20){
			charge = 2500;
			System.out.println("청소년 입니다.");
		}
		if(age >= 20){
			charge = 3000;
			System.out.println("성인 입니다.");
		}
		
		System.out.println("입장료는 "+ charge +" 원 입니다.");

	}

}