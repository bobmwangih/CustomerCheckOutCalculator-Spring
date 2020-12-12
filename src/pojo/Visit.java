package pojo;

public class Visit {

	private Customer customer;
	private double serviceExpense;
	private double productExpense;
	private double totalExpense = 0;
	private double totalServiceExpense = 0;
	private double totalProductExpense =0;
	
	public Visit(Customer c) {
		this.customer = c;
	}
	
	public double getServiceExpense() {
		return serviceExpense;
	}

	public void setServiceExpense(double serviceExpress) {
		this.serviceExpense = serviceExpress;
	}

	public double getProductExpense() {
		return productExpense;
	}

	public void setProductExpense(double productExpress) {
		this.productExpense = productExpress;
	}



	public double getTotalExpense() {
		if(customer.isMember()) {
			System.out.println("Service Discount: "+DiscountRate.getServiceDiscountRate(customer.getMemberType()));
			System.out.println("-----------");
			System.out.println("Product Discount: "+DiscountRate.getProductDiscountRate(customer.getMemberType()));
			totalServiceExpense = serviceExpense -(serviceExpense * DiscountRate.getServiceDiscountRate(customer.getMemberType()));
			System.out.println("-----------");
			System.out.println("The service Expense after discount: "+totalServiceExpense);
			System.out.println("-----------");
			totalProductExpense = productExpense - (productExpense * DiscountRate.getProductDiscountRate(customer.getMemberType()));
			System.out.println("The product expense after discount: "+totalProductExpense);
			System.out.println("-----------");
			totalExpense = totalServiceExpense + totalProductExpense;
			return totalExpense;
		}
		else {
			System.out.println("Sorry you are not a member,No discount!");
			System.out.println("-----------");
			totalExpense = serviceExpense + productExpense;
			return totalExpense;
		}
	}
	

	public void cashOut() {
		System.out.println("-----------");
		System.out.println("Service expense before discount: "+serviceExpense);
		System.out.println("-----------");
		System.out.println("Product expense before discount: "+productExpense);
		System.out.println("-----------");
		System.out.println("Name: "+customer.getName());
		System.out.println("-----------");
		System.out.println("Member type: "+customer.getMemberType());
		System.out.println("-----------");
		System.out.println("Total to pay: " + getTotalExpense());
	}
}
