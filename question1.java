package assignment3;
import java.util.*;
public class question1 {
		
public static void rangeBetweenZeroes(){
	ArrayList<Integer> num = new ArrayList<Integer>();
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter numbers to add them into the arraylist. type a non-numerical character to stop adding stuff.");
	
	while(sc.hasNextInt() == true ){
		
		num.add(sc.nextInt());
		System.out.println("your arraylist contains: " + num + " right now.");
	}//end while
	if(sc.hasNextInt() == false){
		System.out.println("arraylist entry stopped. you entered a non-numerical character!");
	}
	
	System.out.println("arraylist complete! here it is: ");
	System.out.println(num);
	int indexnumbertotal;
	
		if(num.contains(0)){		//checks if the arraylist contains any zero at all
			
			ArrayList<Integer> indexnum = new ArrayList<Integer>();
			
			for(int i = 0; i < num.size(); i++){		//goes through the arraylist
				if(num.get(i).equals(0)){		//if the array has a zero, then.... 
					
					indexnum.add(i);			//...the code stores the index number into the second arraylist
					System.out.println("the arraylist containing the index number(s) is/are: " + indexnum);		//here it prints the second arraylist
								
				}//end if
			}//end for
			indexnumbertotal = (indexnum.get(indexnum.size()-1) - indexnum.get(0));		
			
			System.out.println("the distance between the first and last zero in the first array is: " + (indexnumbertotal + 1));
			
			/*here it calculates the distance 
			by subtracting the last element of the second arraylist with the first.
			the -1 and +1 within the loop and outside respectively serve to compensate for the boundaries of the arralist
			to correctly calculate things according to the assignment's wishes.
			*/
			
		}else{System.out.println("arraylist contains no zeroes...");}
}//end rangebetweenzeroes

	public static void main(String[] args){
		rangeBetweenZeroes();
	}//end main

}//end class