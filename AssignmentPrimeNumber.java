package week1.day1;
public class AssignmentPrimeNumber {
	public static void main(String[] args) {
		int input = 13;
		boolean flag = false;
		for (int i = 2; i < input/2; i++) {
			int remainder = input%i;
			if (remainder == 0)
			flag = true;
		}
		if (flag == false)
			System.out.println(input+ " is a Prime number");
		else
			System.out.println(input+ " is not a Prime number");
	}
}