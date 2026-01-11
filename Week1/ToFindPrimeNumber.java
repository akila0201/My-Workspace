package Week1;

public class ToFindPrimeNumber {

	public static void main(String[] args) {
			for(int n=2;n<=10;n++) {
				int i;
			for(i=2;i<=n-1;i++) {
				if(n%i==0) {
					System.out.println(n+ "is not a prime number");
					break;
				}
			}
			if(i==n) {
				System.out.println(n + "is a prime number");
			}
		}

	}

}
