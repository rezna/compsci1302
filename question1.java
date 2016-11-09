package assignment4;

public class question1 {
	
	
	   public static void main(String[] args)
	   {  
	      int[] a = ArrayUtil.randomIntArray(10000, 10000);
	      MergeSorter.resetCounter();
	      MergeSorter.sort(a);
	      System.out.println("Array size: 10000; comparisons: " + MergeSorter.getCounter());
	   }

}
