package assignments_2;

import java.util.Scanner;

public class TowerOfHanoi{
//	public static void main(String[] args) {
//	        Scanner scanner = new Scanner(System.in);
//	        System.out.print("Enter the number of discs: ");
//	        int numDiscs = scanner.nextInt();
//	       
//
//	        towerOfHanoi(numDiscs, "A", "B", "C");
//	    }

	    public static  String towerOfHanoi(int n, String source, String helper,String target) {
	        if (n == 1) {
	            System.out.println("Move disk 1 from " + source + " to " + target);
	            return target;
	        }

	        towerOfHanoi(n - 1, source, target, helper);
	        System.out.println("Move disk " + n + " from " + source + " to " + target);
	        return towerOfHanoi(n - 1, helper, source, target);
	    }
	

}
