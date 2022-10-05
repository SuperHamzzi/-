package customerRunners;

public class CustomerRunner {
	public static void main(String[] args) {
		Address homeAddress = new Address("집", "서울","50005");
		Customer customer = new Customer("김재혁",homeAddress);
		
		Address workAddress = new Address("line 1 for work", "회사","50005");
		customer.setWorkAddress(workAddress);
	
		System.out.println(customer);
		
	}
	
	
}
