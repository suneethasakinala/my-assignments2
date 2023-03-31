package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		int input= 13;
		boolean isitPrime= true;{
		
		for(int i=2; i<=input/2;i++)
		{
			if(input%i==0) {
				isitPrime= true;
				break;
			}
		}
	}
		if(isitPrime) {
			System.out.println("The given number"+input+"is Prime");
		}
		else {
			System.out.println("The given number"+input+"is not a prime");
		}
	}
}

