package assignment3;
import java.util.*;

public class question3 {
	public static void Stutter(){
		
		List<List> ab = new ArrayList<List>();
		ArrayList<String> stringlist = new ArrayList<String>();
		ArrayList<Integer> intlist = new ArrayList<Integer>();
		
		System.out.println("enter a number");
		
			Scanner scint = new Scanner(System.in);
			Integer scint2 = scint.nextInt();
			intlist.add(scint2);
			System.out.println("the number entered in the list is: " + intlist);
		
		System.out.println("enter strings. type 'stop' to end the input query.");
		String qw = " ";
		
		while(!qw.equals("stop")){
			Scanner scstr = new Scanner(System.in);	
			qw = scstr.nextLine();
			for(int i = 0; i < intlist.get(0); i++){ //adds the input into the arraylist by however many times the number inside the integer arraylist is
			stringlist.add(qw);
			stringlist.remove("stop"); //prevents the arraylist from having the limit input inserted into it
			}
		
			
		}//end while
		stringlist.remove("stop");  
		
		System.out.println("the string array contains: " + stringlist);
		System.out.println("size of the final array is: " + stringlist.size());
		
		ab.add(intlist);
		ab.add(stringlist);
		//the above just combines the int and string arraylists into a list
		
		System.out.println("the final arraylist containing everything inputted is: " + ab);
	}//end Stutter

	public static void main(String[] args){
		Stutter();
		
	}//end main(string[] args)
}//end class
