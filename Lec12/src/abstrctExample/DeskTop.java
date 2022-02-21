package abstrctExample;

public class DeskTop extends Computer {

	@Override
	public void display() {
		System.out.println("DeskTop display()");		
	}

	@Override
	public void typing() {
		System.out.println("DeskTop typing()");		
		
	}
	
//	public void turnOn() {
//		System.out.println("DeskTop turnon()");
//	}
//	
//	public void turnOff() {
//		System.out.println("DeskTop turnoff()");
//	}

}
