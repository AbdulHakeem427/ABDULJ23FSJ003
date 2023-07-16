package Week2LabBook;

public class SwitchCaseDemo {
	public static void main(String[] args) {
		switchCase();
		System.out.println(".................\n");
		
		nestedSwitchCase();
	}
	static void switchCase() {
		int tech = 2; 
	    
	    switch(tech){ 
	    case 1: 
	    { 
	          System.out.println("java"); 
	          break; 
	      } 
	    case 2:{ 
	      System.out.println("ES6"); 
	      break; 
	    } 
	    default:{ 
	      System.out.println("Not Listed.."); 
	    } 
	   }
	}
	    static public  void nestedSwitchCase() {
	    	int tech = 2; 
	        int course = 2;  
	          
	        switch(tech){ 
	        case 1: 
	              System.out.println("python"); 
	              break; 
	        case 2:  
	              switch(course){ 
	              case 1: 
	                     System.out.println("J2EE"); 
	                     break; 
	              case 2: 
	                    System.out.println("advance java"); 
	             } 
	          } 
	    }
}
