package assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class question3 {
public static void main(String[] args){
	List<String> Cities = new ArrayList<String>();
	Cities.add("Tokyo");
	Cities.add("Belfast");
	Cities.add("Gibraltar");
	Cities.add("Sacremento");
	Cities.add("Annaheim");
	Cities.add("Kathmandu");
	Cities.add("St Petersburg");
	Cities.add("Istanbul");
	
	Collections.sort(Cities);
	
	System.out.println(Cities);
}
}
