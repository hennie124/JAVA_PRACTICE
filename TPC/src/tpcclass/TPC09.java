package tpcclass;

public class TPC09 {

	public static void main(String[] args) {
		int a = 56;
		int b = 40;
		
		TPC09 tpc = new TPC09(); //heap Area
		int v = tpc.sum(a, b);
		System.out.println(v);
	}
	
	//static이 없을 때는?
	public int sum(int a, int b) {
		int v=a+b;
		return v;
	}

}
