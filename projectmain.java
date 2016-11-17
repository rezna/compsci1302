package GroupProject2;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

import javax.swing.*;
//----------------------------------------------------------------------------------------------------------------	

//----------------------------------------------------------------------------------------------------------------	
public class projectmain {

//off-method strings so entire methods aren't re-run constantly
	private static String NameFromUserInput = greet();
	private static String filedirectory = directoryselect().toString(); //WAS IT REALLY SO SIMPLE TO CONVERT RETURN FILE TO STRING THIS WHOLE TIME WHAT THE FUCK
	
	//	private static int FileLineNumber = countcount();



//----------------------------------------------------------------------------------------------------------------		
//greet
	public static String greet(){
		String yourname = JOptionPane.showInputDialog("Enter your name.");
		//JOptionPane.showMessageDialog(null, "Hello, " + yourname + "!");
		//maybe use later
		System.out.println("string yourname = " + yourname);
		return yourname;
	}
	
	
//----------------------------------------------------------------------------------------------------------------	
	public static File directoryselect(){
				
		/*JFrame parentFrame = new JFrame();
		 
		final JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("hello, " + nameee + "! choose where to save");   
		 
		int userSelection = fileChooser.showSaveDialog(parentFrame);
		
		if (userSelection == JFileChooser.APPROVE_OPTION) {
		    File fileToSave = fileChooser.getSelectedFile();
		    System.out.println("Save as file: " + fileToSave.getAbsolutePath());
		    
		}
		 
		 
		 Integer.toString(userSelection);
		 
		 String u = fileChooser.getCurrentDirectory() + "\\" + ????????????; // HOW THE FUCK DO I GET THE USER INPUT DIRECTORY LOCATION IN HERE FUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUCK
		 System.out.println(u);
		 return u;
		*/
		
		JFileChooser CHOOSING_FILE = new JFileChooser();
		CHOOSING_FILE.setDialogTitle("Hello, " + NameFromUserInput + ", choose a save location and type in a title for your file!");
        CHOOSING_FILE.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); 
        CHOOSING_FILE.showSaveDialog(null);

        /*if (CHOOSING_FILE.showOpenDialog(CHOOSING_FILE) == JFileChooser.APPROVE_OPTION) { 
		      System.out.println("getCurrentDirectory(): " +  CHOOSING_FILE.getCurrentDirectory());
		      System.out.println("getSelectedFile() : " +  CHOOSING_FILE.getSelectedFile());
		      
		      }else if((CHOOSING_FILE.showOpenDialog(CHOOSING_FILE) == JFileChooser.CANCEL_OPTION)){
		      System.out.println("No Selection ");
		      }else if ((CHOOSING_FILE.showOpenDialog(CHOOSING_FILE) == JFileChooser.ERROR_OPTION)){
		      System.out.println("error!");	  //THIS DOESN'T FUCKING WORK BECAUSE IT REPEATS THE CHOOSE DIALOG 3 TIMES. 3 TIMES!!!!!!!
		      }
        */

        
        
		return CHOOSING_FILE.getSelectedFile();
		
		
	}//end directory select
	
//----------------------------------------------------------------------------------------------------------------
//open selected file creation location
	public static JFileChooser fileget(){
	String choosertitle = null;
	JFileChooser chooser = new JFileChooser(); 
    chooser.setCurrentDirectory(new java.io.File("."));
    chooser.setDialogTitle(choosertitle);
    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    //
    // disable the "All files" option.
    //
    chooser.setAcceptAllFileFilterUsed(false);
    //    
    if (chooser.showOpenDialog(chooser) == JFileChooser.APPROVE_OPTION) { 
      System.out.println("getCurrentDirectory(): " 
         +  chooser.getCurrentDirectory());
      System.out.println("getSelectedFile() : " 
         +  chooser.getSelectedFile());
      }
    else {
      System.out.println("No Selection ");
      
      }
    return chooser;
     }

//----------------------------------------------------------------------------------------------------------------	
//create the file and put numbers in it
	public static File projectfile() throws IOException{
		File w = new File(filedirectory + ".txt");
		w.createNewFile();
		System.out.println("file created, " + NameFromUserInput + "!");
		
		final JFrame frame = new JFrame();
		JOptionPane.showMessageDialog(frame, "file created!" + " It is located in: " + filedirectory);
		
		return w;
	}//end projectfile

//create numbers into file
	public static void projectnumbers() throws IOException{
		Writer wr = new FileWriter(projectfile());
		String separation = System.getProperty("line.separator");
		
		for(int i = 0; i < 1000; i++){
			System.out.println(genRandom());
			wr.write(genRandom() + separation);
			
		}//end for
		wr.close(); 
			//wr.close(); has to be inserted to ensure that the items are placed in the file! 
			//it has the effect of flushing the print stream to ensure everything is written to the file.
	}//end projectnumbers
	
	public static String genRandom(){
		  int numbers = new Random().nextInt(1000);
		  String numberstring = String.valueOf(numbers);
		  return numberstring;
		}//end genRandom()
//----------------------------------------------------------------------------------------------------------------	
//popupwindow to choose from sorting methods
	//use for later
	
	public static int countlines() throws IOException {
	  
		ArrayList<String> tylerarraylist = new ArrayList<String>();
		
	
		 Scanner s = new Scanner(new File(filedirectory + ".txt"));
         while (s.hasNextLine()) {
             tylerarraylist.add((s.nextLine()));
         }
		int y = tylerarraylist.size();
		System.out.println(y + " lines counted");
		s.close();
        return y; 
	}//end countLines
	
	
	public static void projectsort() throws IOException, FileNotFoundException{
		
		countlines();
		
		ArrayList<Integer> list = new ArrayList<Integer>(); //arraylist name is 'list'
		
		//put contents of file to arraylist
		Scanner s = new Scanner(new File(filedirectory + ".txt"));
		
		while (s.hasNext()){
		    list.add(s.nextInt());
		}
		s.close();
		//sort the arraylist
		//overwrite the file with sorted arraylist
		
		
		 String[] choices = { "bubble sort", "insertion sort", "selection sort"};
		    String input = (String) JOptionPane.showInputDialog(null, "Choose now...",
		        "Choose which sorting method you want to use.", JOptionPane.QUESTION_MESSAGE, null,
	        choices, // Array of choices
	        choices[0]); // Initial choice
		    
		  //create empty clone fil
		        
			    if(input == "bubble sort"){	//bubble
			    	
			    	//bubble sorting(1) algorithm 
			    	int[] swaptemp;
					swaptemp = new int[2];
					int q = swaptemp[0];
					int w = swaptemp[1];
					
					long startTime = System.nanoTime();  //nanoseconds timer
					
					for(int j = 0; j < list.size(); j++){
						
						for(int i = 0; i < list.size()-1; i++){ 
							q = list.get(i);
							w = list.get(i+1);
							
							
							swaptemp[0] = q;
							swaptemp[1] = w;
							if(swaptemp[0]<swaptemp[1]){
								//this section swaps
								list.set(i, q);
								list.set(i+1, w);
							}else if(swaptemp[0]>swaptemp[1]){
								//this section swaps
								list.set(i, w);
								list.set(i+1, q);
							}//end else if
						}//end for within for
					}//end for
					
					long estimatedTime = System.nanoTime() - startTime; //nanoseconds timer end
				    double ToMilliseconds = (double) (estimatedTime * Math.pow(10, -6)); //converts nanoseconds to milliseconds
				    System.out.println(ToMilliseconds + " milliseconds to complete bubble sort.");
				    
					//FileWriter writer = new FileWriter("C:\\Users\\kay-p\\Desktop\\sortedfile.txt"); 
					//for(Integer str: list) {
					//  writer.write(str);
					//}
					//writer.close();
					
					 BufferedWriter writer = new BufferedWriter(new FileWriter(filedirectory + "sortedfile.txt"));
			          for (int k = 0; k < list.size(); k++) {
			        	       	 
			        	  writer.write(list.get(k).toString());
			        	  writer.write(System.getProperty("line.separator"));
			        	  
			          }
			          
			          writer.close();
			          System.out.println(input + " sort complete");
			    }else if(input == "insertion sort"){
			    	
			    	long startTime = System.nanoTime();  //nanoseconds timer
			    	
			    	  int temp;
			    	  int temp2;
			          for (int i = 1; i < list.size(); i++) {
			              for(int j = i ; j > 0 ; j--){
			                  if(list.get(j) < list.get(j-1)){
			                      temp = list.get(j);
			                      temp2 = list.get(j-1);
			                      
			                            
			                      list.set(j, temp2);
			                      list.set(j-1, temp);
			                  }
			              }
			          }
			          
			          long estimatedTime = System.nanoTime() - startTime; //nanoseconds timer end
			          double ToMilliseconds = (double) (estimatedTime * Math.pow(10, -6)); //converts nanoseconds to milliseconds
			          System.out.println(ToMilliseconds + " milliseconds to complete inserstion sort.");
			          
			          BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\kay-p\\Desktop\\sortedfile.txt"));
			          for (int k = 0; k < list.size(); k++) {
			        	       	 
			        	  writer.write(list.get(k).toString());
			        	  writer.write(System.getProperty("line.separator"));
			        	  
			          }
			          
			          writer.close();
			          System.out.println(input + " sort complete");
			    	
			    }else if(input == "selection sort"){
			    	
			    	long startTime = System.nanoTime();  //nanoseconds timer
			    	
			    	  for (int i = 0; i < list.size() - 1; i++)
			          {
			              int index = i;
			              for (int j = i + 1; j < list.size(); j++)
			                  if (list.get(j) < list.get(index)) 
			                      index = j;
			        
			              int smallerNumber = list.get(index);  
			             
			              list.set(index, list.get(i));
			              list.set(i, smallerNumber);
			          }
			    	  
			    	  long estimatedTime = System.nanoTime() - startTime; //nanoseconds timer end
			    	  double ToMilliseconds = (double) (estimatedTime * Math.pow(10, -6)); //converts nanoseconds to milliseconds
			    	  System.out.println(ToMilliseconds + " milliseconds to complete selection sort.");
			    	  
			    	  BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\kay-p\\Desktop\\sortedfile.txt"));
			          for (int k = 0; k < list.size(); k++) {
			        	       	 
			        	  writer.write(list.get(k).toString());
			        	  writer.write(System.getProperty("line.separator"));
			        	 
			          }
			          
			          	writer.close();
			          	System.out.println(input + " sort complete");
			          	
			    }else if(input == null){
			    	System.out.println("none chosen");
			    }//end ifs
	}//end projectsort
//----------------------------------------------------------------------------------------------------------------	
//popupwindow to choose from searching methods
	public static void projectsearch() throws IOException{
		
		
		final JFrame frame = new JFrame();
		
		ArrayList<Integer> list = new ArrayList<Integer>(); //arraylist name is 'list'
		
		//put contents of file to arraylist
		Scanner s = new Scanner(new File(filedirectory + ".txt"));
		
		while (s.hasNext()){
		    list.add(s.nextInt());
		}
		s.close();
		//sort the arraylist
		//overwrite the file with sorted arraylist
		
		
		
		 String[] choices = { "linear search", "binary search"};
		    String input = (String) JOptionPane.showInputDialog(null, "Choose now...",
		        "Choose which searching method you want to use.", JOptionPane.QUESTION_MESSAGE, null,
	        choices, // Array of choices
	        choices[0]); // Initial choice
		    	
			if(input == "linear search"){
				
				String searchnumber = JOptionPane.showInputDialog("Enter a number you want to search for.");
				int key = Integer.parseInt(searchnumber);
				int foundint = 0;
				int size = list.size();
				
				long startTime = System.nanoTime();  //nanoseconds timer
				
			    for(int i=0;i<size;i++){
			        if(list.get(i) == key){
			        	JOptionPane.showMessageDialog(frame, key + " found!");
			        	foundint = 1;
			        	System.out.println("foundint value is '1'");
			       
			        	}//end if inside for
			        }//end for
			    
			    long estimatedTime = System.nanoTime() - startTime; //nanoseconds timer end
			    double ToMilliseconds = (double) (estimatedTime * Math.pow(10, -6)); //converts nanoseconds to milliseconds
			    System.out.println(ToMilliseconds + " milliseconds to complete linear search.");
			    
		        if(foundint == 0){
		        	JOptionPane.showMessageDialog(frame, key + " not found!");
		        	System.out.println("foundint value is still 0");
		        	
			    }//end if
			    
			    
				
			    
		    }else if(input == "binary search"){
		    	
		    	String searchnumber = JOptionPane.showInputDialog("Enter a number you want to search for.");
				int key = Integer.parseInt(searchnumber);
		    	
		    	 
		    	
		    	    
		    	         int low = 0;
		    	         int high = list.size() - 1;
		    	         String found = null; 
		    	         
		    	         long startTime = System.nanoTime();  //nanoseconds timer
		    	         
		    	         while(high >= low) {
		    	        	 
		    	             int middle = (low + high) / 2;
		    	             if(list.get(middle) == key) {
		    	            	 JOptionPane.showMessageDialog(frame, key + " found!");
		    	            	 found = "found";
		    	             }
		    	             else if(list.get(middle) < key) {
		    	            	 
		    	                 low = middle + 1;
		    	                 
		    	             }
		    	             else if(list.get(middle) > key) {
		    	            	 
		    	                 high = middle - 1;
		    	                 
		    	             }
		    	             
		    	             
		    	        }
		    	         if(found == null){
		    	        	 JOptionPane.showMessageDialog(frame, key + " not found in the sorted file!");
		    	         }
		    	       

		    	         long estimatedTime = System.nanoTime() - startTime; //nanoseconds timer end
		    	         double ToMilliseconds = (double) (estimatedTime * Math.pow(10, -6)); //converts nanoseconds to milliseconds
		    	         
		    	         
		    }else if(input == null){
		    	
		    	System.out.println("no search algorithm chosen");
		    	
		    }
			
			
	}//end projectsearch
//----------------------------------------------------------------------------------------------------------------	
//remember to put timing code into the sort and search methods
	
	
	
	
	
	
//----------------------------------------------------------------------------------------------------------------	

//main
	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		projectnumbers();
		projectsort();	
		projectsearch();
		System.exit(0);
		
		/* first, the program asks for your name, then uses it for a greeting when it asks where to save the file
		 * it creates a file at that location, and the file directory is saved as a string so it can be used by
		 * many different methods.
		 * then a popup with a dropdown menu asks which sorting method you want to use. each option reads the file
		 * then saves the numbers into an arraylist. it is sorted that way, then the result is written in a new file
		 * where the original file is located so you don't have to choose where to save it again.
		 * you can then choose a searching option, and then a popup window asks for a user input for a number to search
		 * if it's there, a message appears telling if it's found or not.
		 * then the program terminates.
		 * 
		 * 
		 * 
		 */
		
		
		/*
		final JFrame frame = new JFrame();
		Object[] options = {"yes",
				
                "no",
                "nooo"};
				int n = JOptionPane.showOptionDialog(frame,//parent container of JOptionPane
				"Would you like to run the program? "
				+ "or no...",
				"a sort and search program",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,//do not use a custom Icon
				options,//the titles of buttons
				options[2]);//default button title
				
				
				if(n == 0){
					projectnumbers();
					projectsort();	
					projectsearch();
					System.exit(0);
				}else if(n == 1){
					
					   JFrame f = new JFrame(); //creates jframe f
					   JOptionPane.showMessageDialog(f, " program terminated!");
					  System.exit(0);
				}else if(n == 2){
					
					   JFrame f = new JFrame(); //creates jframe f

					    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); //this is your screen size

					    f.setUndecorated(true); //removes the surrounding border

					    ImageIcon image = new ImageIcon("C:\\Users\\kay-p\\Desktop\\sadface.png"); //imports the image

					    JLabel lbl = new JLabel(image); //puts the image into a jlabel

					    f.getContentPane().add(lbl); //puts label inside the jframe

					    f.setSize(image.getIconWidth(), image.getIconHeight()); //gets h and w of image and sets jframe to the size

					    int x = (screenSize.width - f.getSize().width)/2; //These two lines are the dimensions
					    int y = (screenSize.height - f.getSize().height)/2;//of the center of the screen

					    f.setLocation(x, y); //sets the location of the jframe
					    f.setVisible(true); //makes the jframe visible
					    System.exit(0);
				}//end third if
		
				}//end while
		*/
		
	
			    
		
		
	}//end main
//----------------------------------------------------------------------------------------------------------------		


}