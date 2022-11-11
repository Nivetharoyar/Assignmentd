package week1.day2;

public class AmstrongNumber {

	public static void main(String[] args) {
		int a,b,c=156, d=0;
		  a=c;
		  
		  System.out.println(a);
		while(c>0) {
		 b=c%10;
		 d=(d)+(b*b*b);
		c=c/10; 


		}
		if(a==d) {
		 System.out.println("Given number is a Amstrong Number");
		}
		else {
		 System.out.println("Given number is Not an Amstrong Number");
		}
		 }

	}


