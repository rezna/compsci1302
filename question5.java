package assignment3;
import java.util.*;

public class question5 {

	public static void marklength4(){
		
		ArrayList<String> ab = new ArrayList<String>();
		
		System.out.println("enter stuff into the arraylist. type 'stop' to stop");
		
		Scanner sc = new Scanner(System.in);
		String qw = " ";
		
		while(!qw.equals("stop")){
			qw = sc.nextLine();
			ab.add(qw);	
		}//end while
		
		ab.remove("stop");
		
		ArrayList<String> finalarray = new ArrayList<String>();
		
		for(int i = 0; i < ab.size(); i++){
			
			finalarray.add(ab.get(i)); //copies the string from the ab arraylist into the finalarray arraylist
			
			if(ab.get(i).length() == 4){  //checks the length of the string. if it's 4, then it adds the four asteriks after it added the string to the finalarray
				finalarray.add("****");
			}
			
			
		}//end for
		
		ab.remove("stop");
		System.out.println("arraylist contains: ");
		System.out.println(finalarray);
		
	}//end marklength4
	
	public static void main(String[] args){
		marklength4();
	}//end main
}
