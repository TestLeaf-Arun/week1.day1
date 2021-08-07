package week1.day1;
public class LearnDataTypesAndVariables {
	public static void main(String[] args) {
		
	//dataType variableName = value		
		String brandName = "Samsung";
		String model = "J7 Prime";
		char color = 'G';
		int price = 16000;
		byte memory = 32;
		float screenSize = 15.5f;
		boolean touchScreen = true;
		double imeiNumber = 23456789.123456789;
		long phoneNumber = 123456789L;
			System.out.println("Brand Name of my Mobile is " + brandName);
			System.out.println("Model is " + brandName + " " + model);
			System.out.println("Color of the Mobile is " + color);
			System.out.println("G means Gold");
			System.out.println("I bought the " + brandName + " " + model + " " + "for " + "Rs." + price);
			System.out.println("It has a Memory of " + memory + "MB");
			System.out.println("Its Screensize is " + screenSize + "inches");
			System.out.println("Has a Touchscreen feature " + touchScreen);
			System.out.println("IMEI number is " + imeiNumber);
			System.out.println("You can Contact me @ " + phoneNumber);
	}
}
