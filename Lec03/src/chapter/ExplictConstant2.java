package chapter;

public class ExplictConstant2 {

	public static void main(String[] args) {
		int iNum = 1000; 
		byte bNum = (byte) iNum; 
		
		System.out.println(iNum);
		System.out.println(bNum); 
		//4byte 중에 하나를 잘라서 표현했기 때문에 데이터가 유실될 수 있다.
		
		double dNum = 3.14;
		iNum = (int)dNum;

		float fNum = 0.9F;
		
		System.out.println(iNum);
		//소숫점 이하로 변환한 것이다. 명시적 형 변환
		System.out.println(dNum); 
		
		int num1 = (int)dNum + (int)fNum; 
		int num2 = (int) (dNum + fNum);
		
		
		System.out.println(num1);
		System.out.println(num2);
		//형변환이 되면서 각각 답이 달라진다.
	}

}
