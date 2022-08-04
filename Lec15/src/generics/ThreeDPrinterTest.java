package generics;

import java.util.ArrayList;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		
		ThreeDPrinter<Powder> printer = new ThreeDPrinter<Powder>();
		
		printer.setMaterial(new Powder());
		
		//printer.getMaterial() 가 빨간 줄이 생기는 이유는 object로 받으라고 작성을 했기 때문이다.
		//Powder powder = (Powder)printer.getMaterial();
		Powder powder = printer.getMaterial();
		
		System.out.println(printer);
		
	ThreeDPrinter<Plastic> printerPlastic = new ThreeDPrinter<Plastic>();
		
		printerPlastic.setMaterial(new Plastic());
		Plastic powderPlastic = printerPlastic.getMaterial();
		
		System.out.println(powderPlastic);
		
//ThreeDPrinter<Water> printerWater = new ThreeDPrinter<Water>();
//		printerWater.setMaterial(new Water());
//		Water water = printerWater.getMaterial();
//		
//		System.out.println(water);
		
		printerPlastic.printing();
		
		//안쓰는 것은 Object로 간주되어 형변환을 해야 한다.
		ArrayList list = new ArrayList();
		
		
	}
}
