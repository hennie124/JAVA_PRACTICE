package inheritance;

public class CustomerTest {

	public static void main(String[] args) {

//		Customer customerLee = new Customer();
//		customerLee.setCustomerID(10100);
//		customerLee.setCustomerName("Lee Min Hyuk");
		
		Customer customerLim = new VipCustomer(10000,"Lim Yoona");
//		customerLim.setCustomerID(10000);
//		customerLim.setCustomerName("Lim Yoona");
		customerLim.bonusPoint = 1000;
		
		//customerLee.showCustomerInfo();
		customerLim.showCustomerInfo();
		
		//System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerLim.showCustomerInfo());
	}

}
