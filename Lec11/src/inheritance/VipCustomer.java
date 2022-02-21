package inheritance;

public class VipCustomer extends Customer {
	
	private double saleRatio;
	private int agentID;
	
	public VipCustomer(int customerID, String customerName) {
		super(customerID,customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
		System.out.println("VipCustomer(int,String)호출");
	}
	
	public int getAgentID() {
		return agentID;
	}
	
}