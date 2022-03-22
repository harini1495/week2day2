package week2.day2;

public class LearnLoop {
	 int num = 15;
public static void main(String[] args) {
	//ONLY CONDITION NO ELSE
	LearnLoop obj=new LearnLoop();
	
	if (obj.num % 3==0) {
		System.out.println("TAN");
		System.out.println("--------------");
	}
	
	//ONLY IF AND ELSE THIS OR THAT WE CHECKING
     int num1 = 20;
	
	if (num1 / 5==4) {
		System.out.println("PAN");
		
	}
	else {
		System.out.println("TAN");
		
	}
	System.out.println("--------------");
	
	//ELSEIF WE USE MORE CONNDITION EXAMPLE
	 int num2=15;
	 
	if (num2%3==0 && num2%5==0 ) {
		System.out.println("TANPAN");
	}
	 else if(num2%3==0) {
		 System.out.println("TAN");
	 }
	 else if(num2%3==0) {
		 System.out.println("PAN");
	 }
	 else {
		 System.out.println("BOTH NOT DIVISIBLE BY TANPAN"); 
	 }
	System.out.println("--------------");
	//NESTED CONDITION EXAMPLE - MORE THAN ONE IF CONDITION
		 int num3=13;
		 
		if (num3%3==0 && num3%5==0 ) {
			System.out.println("TANPAN");
		}
		 if(num3%3==0) {
			 System.out.println("TAN");
		 }
		 else if(num3%3==0) {
			 System.out.println("PAN");
		 }
		 else {
			 System.out.println("BOTH NOT DIVISIBLE BY TANPAN"); 
		 }
}
}
