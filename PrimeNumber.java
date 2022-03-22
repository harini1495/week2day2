package week2.day2;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int  prime = 13;
		boolean flag = false;
		
		for(int i =2;i<=prime/2;i++) {
			
			if(prime%2==0) {
				
				flag=true;				
				break;
				
			}
			
		}
		if(!flag) {
			
			System.out.println(prime + " is a prime number");
				
		}
		else
			System.out.println(prime+" is not a prime number");
	}
}

