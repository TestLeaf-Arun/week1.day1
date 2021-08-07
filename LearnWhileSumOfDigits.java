package week1.day1;
public class LearnWhileSumOfDigits {
	public static void main(String[] args) {
		int number = 12345;
		int sum=0;
		int quotient=1;
		int remainder=2;
		// while (quotient==0) stop executing
		// while (quotient!=0) perform the execution
		while (quotient!=0) {
			quotient = number/10;
			remainder = number%10;
			System.out.println("Quotient is " + quotient);
			System.out.println("Remainder is " + remainder);	
			sum = sum + remainder;
			number = quotient;
		}
			System.out.println("Final Sum is " + sum);
	}
}
