package assignment3;
import java.util.*;
public class question6 {
	public static void reverse3(){
		
		ArrayList<Integer> ab = new ArrayList<Integer>();
		ArrayList<Integer> finalarray = new ArrayList<Integer>();
		
		System.out.println("enter stuff into the arraylist. type anything that isn't a number to stop");
		Scanner sc = new Scanner(System.in);
		int qw;
		while(sc.hasNextInt()){
			 qw = sc.nextInt();
			ab.add(qw);	
		}//end while
		System.out.println("the array contains: ");
		System.out.println(ab);
		
		for(int i = 0; i < ab.size()+1; i++){
			if(i+3 < ab.size()){	
				finalarray.add(ab.get(i+2));
				finalarray.add(ab.get(i+1));
				finalarray.add(ab.get(i));
				i+=2;
			}//end if
			else{
				break;
			}//end else	
		}//end for
		if( ab.size() % 3 == 0 ){ //checks if the arraylist is a multiple of three.
			System.out.println("arraylist is a multiple of three");						
			finalarray.add(ab.get(ab.size()-2));
			finalarray.add(ab.get(ab.size()-1));
			finalarray.add(ab.get(ab.size()-3)); //if it is, then it switches the last few 3 numbers into the new arraylist
		}else if ( ab.size() % 3 != 0){ 
			System.out.println("arraylist is not a multiple of three");
			if( ab.size() % 2 == 0 ){  //if the arraylist isn't a multiple of three....
				finalarray.add(ab.get(ab.size()-1)); //if it has two more than a multiple of three, then it adds in the last two numbers of the original arraylist
			}else if ( ab.size() % 2 == 1 ){
				finalarray.add(ab.get(ab.size()-2)); //if it has one more than a multiple of three, then it adds in the last number of the original arraylist
				finalarray.add(ab.get(ab.size()-1));
			}
		}
		System.out.println("final array contains: ");
		System.out.println(finalarray);
	}//end reverse3
	
	public static void main(String[] args){
		reverse3();
	}//end main
}//end class
