package Arrays;

import java.awt.Checkbox;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Twosum{
   
      public static void main(String args[]){
        int nums[]={2,7,5,11};
        int target =9;
        
        Map<Integer,Integer>num= new HashMap<Integer, Integer>();
        
        for (int i = 0; i < nums.length; i++) {
			num.put(nums[i],i);
		}
        
        
        
        for (int i = 0; i < nums.length; i++) {
        	int delta=target-i;
        	if(num.containsKey(delta)&&num.get(delta)!=i) {
        		System.out.println(i+" "+num.get(delta));
        	}
			
		}
    
        
    }
     
            	
            	
         
            
      
    	  
    	  
      
      
}