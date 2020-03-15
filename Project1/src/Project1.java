import java.util.StringTokenizer;
public class Project1 {

	public static void main(String[] args) {
		
		String hour, minute, second;
		
		Clock unsorted[], sorted[];
		
		TextFileInput in = new TextFileInput("project1.txt");
		
		int clock = 0;
		
		int size = 0;
	   
		String line = in.readLine();
	   
		while(line != null){ //make line read all of the data from the txt
	      
		  size++;
	      line = in.readLine();
	   
		}  
		
		unsorted = new Clock[size]; //sets the size of sorted to 16
		
		sorted = new Clock[size]; //sets the size of unsorted to 16
		
		in.close(); //stops from receiving anymore info and closes it
		
		in = new TextFileInput("project1.txt"); //opens the file back up
		
		line = in.readLine(); // grabs the first thing
		
		while(line != null) { //fill the arrays
	 
	    	  StringTokenizer tokens = new StringTokenizer(line,":");
	    	  
	    	  if(tokens.countTokens() == 3) {
	    	  
	    	  hour = tokens.nextToken();
	    	  
	    	  minute = tokens.nextToken();
	    	 
	    	  second = tokens.nextToken();
	    	  
	    	  unsorted[clock]= new Clock(Integer.parseInt(hour),Integer.parseInt(minute),Integer.parseInt(second));
	    	  
	    	  sorted[clock] = new Clock(Integer.parseInt(hour),Integer.parseInt(minute),Integer.parseInt(second));
	    	  
	    	  clock++;
	    	  
	    	  }
	    	  else System.out.println(line);
	    	  
	    	  line = in.readLine();
	      }
	     
		  selectionSort(sorted, clock);
	     
	      ClockGUI print = new ClockGUI(unsorted,sorted,clock);
	     
	      System.out.print(print);
	      
	}
	public static void selectionSort(Clock[] array, int length) { //sorts the array
		
		for ( int i = 0; i < length - 1; i++ ) { 
		      
			int indexLowest = i; 
		      
		      for ( int j = i + 1; j < length; j++ ) 
		          
		    	  if (array[j].getHour() < array[indexLowest].getHour()) //checks the hour
		    		  
		    		  indexLowest = j;
		    	  
		    	  else if(array[j].getHour() == array[indexLowest].getHour())
		    		  if(array[j].getMinute() < array[indexLowest].getMinute()) //checks the minute
		    			  
		    			  indexLowest = j;
		    		  
		    		  else if (array[j].getMinute() == array[indexLowest].getMinute())
		    			  if(array[j].getSecond() < array[indexLowest].getSecond()) //checks the second
		    				  
		    				  indexLowest = j;
		       
		      	  if (array[indexLowest] != array[i]) { 
		          
		      	  Clock temp = array[indexLowest];
		          
		      	  array[indexLowest] = array[i]; 
		          
		      	  array[i] = temp;
		      	  
		       }
		}  
	}
	//read input from txt file
	//parse the information into 3 variables
	//set it through class clock
	//put it into 2 arrays
	//sort
	//call gui class to print
}
