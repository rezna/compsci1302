package assignment3;
import java.util.*;


public class question2 {
	
	
	public static void removeinRange(){
		
	ArrayList<String> st = new ArrayList<String>();
	
		System.out.println("enter the starting string");
			
			Scanner StringStart = new Scanner(System.in);
			String Start1 = StringStart.next();
			System.out.println(Start1 + " is the starting string");
			
			System.out.println("enter the ending string");
			Scanner StringEnd = new Scanner(System.in);
			
			String End1 = StringEnd.next();
			System.out.println(End1 + " is the ending string");
		
		String qw = " ";
	System.out.println("enter the arraylist items. type 'stop' to end the entry query");

	while(!qw.equals("stop")){
		Scanner sc = new Scanner(System.in);
		qw = sc.nextLine();
		st.add(qw);
		st.remove("stop");
			
	}//end while
	
	for(int i = 0; i < st.size(); i++){
		if(st.get(i).compareTo(Start1)>0 && st.get(i).compareTo(End1)<0){
			st.set(i,"removed");
			i = 0;
		}//end if inside for
		
	}//end for
				
	Arrays.toString(st.toArray());
	System.out.println("the arraylist contains: " + st);
		
}//end removeinrange
	public static void main(String[] args){
		removeinRange();
	}//end main
}//end class
	
	
	
	
	

