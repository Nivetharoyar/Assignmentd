package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {

      int a=8,firstnum=0,secnum=1,sum;
      for(int i=1;i<=a;i++) {
    
    	  sum=firstnum+secnum;
    	  firstnum=secnum;
    	  secnum=sum;
    	  System.out.println(sum);
      }
	}

}
