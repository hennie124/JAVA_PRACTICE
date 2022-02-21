package Arr01;

public class ArrayTest03 {

	public static void main(String[] args) {
		char [] alphabets = new char[26];
		char ch = 'A';
		
		for(int i = 0; i<alphabets.length; i++,ch++){
		alphabets[i] = ch;
		System.out.println(alphabets[i]);
		}
		
		for(int i = 0; i<alphabets.length; i++,ch++){
//			alphabets[i] = ch;
		System.out.println(alphabets[i]);
		//System.out.println(alphabets[i] + "," + (int)alphabets[i]);
		}


	}

}
