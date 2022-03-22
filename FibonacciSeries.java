package week2.day2;



public class FibonacciSeries {

	public static void main(String[] args) {
		
		int firstNum=0,secNum=1,sum,range=8;  
		
		 System.out.println(firstNum);
		 System.out.println(secNum);
		 
		  
		 for(int i=1;i<range;i++)
		 {  
		  sum=firstNum+secNum;  
		  firstNum=secNum;  
		  secNum=sum;  
		  System.out.println(sum);  
		 }  

		
		
		}		
	}
	

