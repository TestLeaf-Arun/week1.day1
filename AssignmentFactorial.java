package week1.day1;
public class AssignmentFactorial {
	public static void main(String[] args) {		
		int factor=1;
			for (int i = 5; i > 0; i--) {
				factor = factor * i;
			}
		System.out.println("Factorial of the given number is " + factor);
	}
}