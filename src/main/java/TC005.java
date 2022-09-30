import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class TC005 {

	public static void main(String[] args) {
		//Declare a set and initialize it with unsorted list
		HashSet<Integer> numSet = new LinkedHashSet<Integer>(Arrays.asList(4,8,6,2,12,10,62,40,36));		
		
		//print the unsorted set
        System.out.println("Unsorted Set: " + numSet); 
        
        //convert set to list
        List<Integer> numList = new ArrayList<Integer>(numSet); 
        
        //Sort the list using Collections.sort () method
        Collections.sort(numList);
        
        //convert list to set
        numSet = new LinkedHashSet<Integer>(numList);  
        
        //Print the sorted set
        System.out.println("Sorted Set:" + numSet);
        
        
	}

}