package assignment3;
import java.util.*;

public class question4 {

	public static void removeshorterstrings(){
		
		ArrayList<String> ab = new ArrayList<String>();
		
		System.out.println("enter strings. type 'stop' to halt input entry");
		Scanner sc = new Scanner(System.in);
		String qw = " ";
		
		while(!qw.equals("stop")){
			qw = sc.nextLine();
			ab.add(qw);	
		}//end while
		
		ab.remove("stop");
		System.out.println("the arraylist contains: " + ab);
		
			for(int i = 0; i < ab.size(); i++){
				String q = ab.get(i);
				String w = ab.get(i+1);
				
				
					if(q.length() < w.length()){
						ab.remove(i);  //if the length of the first item compared is shorter than the second, it is removed.
					}else if(q.length() < w.length()){
						ab.remove(i+1); //if the length of the second item compared to the first, it is removed
					}else if(q.length() == w.length()){
						ab.remove(i); //if the length of the two items are the same, the first one is removed
					}else if(i+1 > ab.size()){
						ab.remove(i); //if the index is out of bounds, the first item looked at will be removed, creating space...i think?
					}//end of the if, else if, else if, else if 
				
				
			}//end for
		
		System.out.println("the final result of the trimmed arraylist is: ");
		System.out.println(ab);
		
	}//end removeshorterstrings
	
	
	public static void main(String[] args){
		removeshorterstrings();
	}//end main
}//end question4
