package assignment4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class question2 {
	
	public static void bubblesort(){
	ArrayList<Integer> sortarray = new ArrayList<Integer>();
	
	for(int i = 0; i < 10; i++){
		sortarray.add(genRandom());
		}//end for
	
	System.out.println("arraylist contains: " + sortarray);
			
	//put sort algorithm code here
	
	int[] swaptemp;
	swaptemp = new int[2];
	int q = swaptemp[0];
	int w = swaptemp[1];
	
	//this is bubble sort
	for(int j = 0; j < Math.pow(sortarray.size(), 1); j++){
		
		for(int i = 0; i < ( sortarray.size()-1 ); i++){ 
			q = sortarray.get(i);
			w = sortarray.get(i+1);
			swaptemp[0] = q;
			swaptemp[1] = w;
			if(swaptemp[0]<swaptemp[1]){
				sortarray.set(i, q);
				sortarray.set(i+1, w);
			}else if(swaptemp[0]>swaptemp[1]){
				sortarray.set(i, w);
				sortarray.set(i+1, q);
			}//end else if
		}//end for within for
	}//end for
	
	
	List<String> newList = new ArrayList<String>(sortarray.size());
	for (Integer myInt : sortarray) { 
	  newList.add(String.valueOf(myInt)); 
	}
	System.out.println("integer arraylist sorted & converted to string. it contains: " + newList);
	
	for(int i = 0; i < 10; i++){
		
		newList.set(i, newList.get(i));
	}//end for
	System.out.println("string list now contains: " + newList);
	
	
	
	}
	
	public static int genRandom(){
		  return new Random().nextInt(50);
		}//end genRandom()
	
	
	public static void main(String[] args){
		bubblesort();
	}
}

