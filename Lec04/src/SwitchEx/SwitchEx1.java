package SwitchEx;

public class SwitchEx1 {

	public static void main(String[] args) {
		int rank = 1;
		
		char medalColor;
		
		switch(rank) {
			case 1: medalColor = 'G';
			break; 
			//break를 걸지 않으면 case 1이 true이기 때문에 case 2가 같이 수행이 됨
			//break를 걸지 않으면 case 1이 false이기 때문에 case 1이 수행 안 됨
			//case 문에서 문자열 사용도 가능하다.
			
			case 2: medalColor = 'S';
			break;
			
			case 3: medalColor = 'B';
			break;
			
			default: medalColor = 'A';
		}
		
		System.out.println(rank + " 등의 메달 색깔은 "+medalColor+" 입니다. ");

	}

}
