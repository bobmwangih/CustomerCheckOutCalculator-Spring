package pojo;

public class DiscountRate {

	public static double serviceDiscountPremium = 0.2;
	public static double serviceDiscountGold = 0.15;
	public static double serviceDiscountSilver = 0.1;
	public static double productDiscountPremium =0.1;
	public static double productDiscountGold = 0.1;
	public static double productDiscountSilver = 0.1;
	public static double hakunaServiceDiscount =0;
	public static double hakunaProductDiscount =0;
	
	public static double getServiceDiscountRate(String type) {
		if (type.equals("premium")) {
			return serviceDiscountPremium;
		}
		else if(type.equals("gold")) {return serviceDiscountGold;}
		else if(type.equals("silver")) {return serviceDiscountSilver;}
		else {
			return hakunaServiceDiscount;
		}
		
	}
	
	public static double getProductDiscountRate(String type) {
		if (type.equals("premium")) {return productDiscountPremium;}
		else if(type.equals("gold")) {return productDiscountGold;}
		else if(type.equals("silver")) {return productDiscountSilver;}
		else {
			return hakunaProductDiscount;
		}
		
	}
	
	
}