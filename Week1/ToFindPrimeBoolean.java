package Week1;

public class ToFindPrimeBoolean {
	public static void main(String[] args) {
		int n=8;
		Boolean isPrime=true;
		for(int i=2;i<=n-1;i++) {
			if(n%2==0) {
				isPrime=false;
				break;
			}
		}
			if(isPrime) {
				System.out.println(n + "is a prime number");
			}
			else {
				System.out.println(n+ "is not a prime number");
			}
		}}

