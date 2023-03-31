package week1.day1;

public class FibonacciSeries {

	
	public static void main(String[] args) {
	
		int n= 8;int firstNum = 0;int secondNum = 1;
		{
		for (int i = 0; i <n; i++) {
				
        System.out.print(firstNum+" ");
        
        int nextNum= firstNum+ secondNum;
        firstNum= secondNum;
        secondNum= nextNum;
			}
		}
	}
	
}
