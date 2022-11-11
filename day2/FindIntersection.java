package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1= {3,2,11,4,6,7};
		int[] b1= {1,2,8,4,9,7} ;
		int m1= a1.length;
		int n1=b1.length;
		for (int i=0;i<m1;i++) {
		for (int j=0;j<n1;j++) {
			if(a1[i]==b1[j]) {
				System.out.println(a1[i]);
			}
		}	
		}

	}

}
