package ArrayList;

public class Array01 {

	public static void main(String[] args) {
		
		// for문
		String[] members = {"A","B","C"};
		for(int i = 0; i < members.length; i++) {
			String member = members[i];
			System.out.println(member + "이 상담을 받았습니다");
		}

		//for - each 문
//		String[] members = {"A","B","C"};
		for(String e : members) {
			System.out.println( e + "이 상담을 받았습니다");
		}
		
	}
}
