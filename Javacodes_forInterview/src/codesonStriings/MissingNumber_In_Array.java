package codesonStriings;

public class MissingNumber_In_Array {

	public static void main(String[] args) {
	
		int[] a= {1,2,3,4,6,7,8,9,10};
		
		int sum=0;
		
		int len = a.length;

		for (int i=0;i<len;i++) {
			
			sum=sum+a[i];	
		}
		System.out.println(sum);  // here it returns the addition of all values inside of an array
		
		int sum1 =0;
		for(int i=1;i<=10;i++) {    // just loop from first index number of array to last index number
			
			sum1=sum1+i;
			
		}
        System.out.println(sum1);
        System.out.println("Missing number in array is::"+(sum1-sum));
}
}