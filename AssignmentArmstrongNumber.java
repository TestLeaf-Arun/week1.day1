package week1.day1;
public class AssignmentArmstrongNumber {
	public static void main(String[] args) {
		int input=153;
		int original=input;
		int calculated=0;
		int quotient=1;
		int remainder=2;
		// while (quotient==0) stop executing
		// while (quotient!=0) perform the execution
		while (quotient>0) {
			quotient = input/10;
			remainder = input%10;
			input = quotient;
			calculated = calculated + (remainder * remainder * remainder);
		}
			System.out.println("Input is " + original);
			System.out.println("Result is " + calculated);
		if (calculated == original)
			System.out.println("Input is an Armstrong number");	
		else 
			System.out.println("Input is not an Armstrong number");
	}	
}