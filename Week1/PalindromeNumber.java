package Week1;

public final class PalindromeNumber {

	public static void main(String[] args) {
		int num=121;
		int firstNumber=num/100;
		int middleNumber=(num/10)%10;
		int lastNumber=num%10;
		if(firstNumber==lastNumber) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}
}
