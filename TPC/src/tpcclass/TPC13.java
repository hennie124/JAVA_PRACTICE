package tpcclass;

import kr.tpc.Inflearn;

public class TPC13 {

	public static void main(String[] args) {
		// private 생성자 매서드(constructor)
		//-> 객체생성에 관여하는 생성자 메서드가 private 접근제어를 가지면 객체를 생성할 수 없다는 뜻
		//-> 그러므로 객체를 생성하지 않고도 사용 가능해야 된다.(모든 클래스의 멤버가 static 멤버가 되어야 한다)
		
		//non-static 멤버인 경우(인스턴스 메서드)
		//->객체생성 후 접근가능
		
		//static 멤버인 경우(클래스 메서드)
		//->객체생성 없이 접근가능(클래스 이름으로 접근)
		
		Inflearn inf = new Inflearn();
		inf.tpc();
		Inflearn.java();
		
		//JAVA API 생성자 private
		//System sys = new System();
		System.out.println("출력");
		//Math m = new Math();
		int v = Math.max(10,20);
		System.out.println(v);
	}

}
