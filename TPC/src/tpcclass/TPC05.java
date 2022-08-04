package tpcclass;

public class TPC05 {

	public static void main(String[] args) {
		//1차원 배열, 2차원 배열
		//1차원 배열이 여러개로 연결되어 있는 것이 2차원 배열
		//int [] [] a;
		// a = new int [3][4];
		//int[] a = new int [3][4];
		
		//가변길이 배열
		//int[]a = new int[3][];
		//a[0] = new int[3]; a[1] new int[4]; a[2]= new int[5];
		
		int[]a= new int[3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		
		int sum = 0;
		
		for(int i = 0; i<a.length; i++) {
			sum += a[i];
		}
		System.out.println(sum);
		
		//9개의 정수형 변수를 만들어라 -> 2차원 구조
		int[][] b=new int[3][3];
		b[0][0]=1;
		b[0][1]=2;
		b[0][2]=3;
//		b[0][3]=4;
		
		b[1][0]=1;
		b[1][1]=2;
		b[1][2]=3;
//		b[1][3]=4;
		
		b[2][0]=1;
		b[2][1]=2;
		b[2][2]=3;
//		b[2][3]=4;
		
		for(int i = 0;i<b.length; i++) {
			for(int j = 0;j<b[i].length; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		//예제
		
		int[][] arr = new int[2][3];

		 

		int k = 10;

		for (int i = 0; i < arr.length; i++) {

		    for (int j = 0; j < arr[i].length; j++) {

		        arr[i][j] = k; // 인덱스를 이용한 초기화

		        k += 10;

		    }

		}

		 

		for (int i = 0; i < arr.length; i++) {

		    for (int j = 0; j < arr[i].length; j++) {

		        System.out.print(arr[i][j] + " ");

		    }

		    System.out.println();

		}
		//가변길이 배열
		int[][] star = new int[5][];
		star[0]=new int[1];
		star[1]=new int[2];
		star[2]=new int[3];
		star[3]=new int[4];
		star[4]=new int[5];
		
//		for (int i = 0; i < star.length; i++) {
//
//		    for (int j = 0; j < star[i].length; j++) {
//		    	star[i][j]='*';
//		        System.out.print((char)star[i][j]);
//
//		    }
//
//		    System.out.println();
//
//		}
	
	 for(int i = 0; i < star.length; i++) {
		 for(int j = 0; j<star[i].length;j++) {
			 star[i][j]='*';
			 System.out.print((char)star[i][j]);
		 }
		 
		 System.out.println();
		 
	 }
	}

}
