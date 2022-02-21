package Demention;

public class TwoDimensionArray {

	public static void main(String[] args) {
		//int[][] arr = new int [2][3];
		int[][] arr = {{1,2,3},{4,5,6}};
		//행의 길이  = arr.length
		System.out.println(arr.length);
		//열의 길이 = arr[0].length
		System.out.println(arr[0].length);
		
		for(int i = 0; i < arr.length;i++){
		for(int j = 0; j <arr[i].length;j++){
		System.out.println(arr[i][j]); //0,0 ~ 0,2
			}
		}
		

		
//		for(int i = 0; i < arr.length;i++){
//			for(int j = 0; j <arr.length;j++){
//			System.out.println(arr[i][j]); //0,0 ~ 0,2
//			}
//			char [] [] alphabets = new char [13][2];
//			}
		
//		char[][] alphabets = new char[13][2];	//13행 2열의 이차원배열 선언
//		  char ch = 'A';	//알파벳을 아스키코드로 증가시키기 위한 변수 선언
//		  
//		  for (int i=0; i<13; i++){		//바깥 for문 >> 개행
//		      for (int j=0; j<alphabets[i].length; j++, ch++) {	//내부 for문 >> 열
//		          alphabets[i][j] = ch;	//아스키값으로 각 요소에 저장 
//		          System.out.print(alphabets[i][j]); //열 출력 (i행의 j열)
//		      }
//		      System.out.println();
//		  }
		
		char [][] alphabets = new char[13][2];
		char ch = 'A';
		
		for(int i=0; i <alphabets.length; i++) {
			for(int j=0; j <alphabets[i].length; j++, ch++) {
				alphabets[i][j] = ch;
				System.out.println(alphabets[i][j]);	
			}
			System.out.println();
		}
	}
	
	
	

}
