package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data= {4,8,6,9};
		Arrays.sort(data);
		System.out.println(data[data.length-2]);

	}

}
