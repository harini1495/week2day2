package week2.day2;

public class LearnJumpingStatement  {
	//JUMPING STATEMENT - BREAK,CONTINUE AND RETURN EXAMPLE BELOW 
	
	//1.RETURN EXAMPLE
	
	public int addTwoNumber()
	{
		int a= 100,b=45;
		int sum=a+b; 		
		
	return sum;
	
	}
	//or
	public int addTwoNumbers(int a,int b)
	{		
		int sum=a+b; 			
	return sum;
	
	}
	
public static void main(String[] args) {
	//2.BREAK EXAMPLE
		for(int i= 0;i<10;i++) 
		{
			if(i==3) 
				break; 
			System.out.println(i);
			}
		System.out.println("----------------");
		//3.CONTINUE EXAMPLE
		for(int i= 0;i<10;i++) 
		{
			if(i==3) 
				continue; 
			System.out.println(i);
			}
		System.out.println("----------------");
		
		LearnJumpingStatement obj = new LearnJumpingStatement();
		int result = obj.addTwoNumber();
		int result1 = obj.addTwoNumbers(4,5);
		int result2 = obj.addTwoNumbers(5,9);
		System.out.println(result+"\n"+result1+"\n"+result2); 	
		
	}
}
