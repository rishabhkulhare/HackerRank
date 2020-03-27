//Solution for HackerRank problem : Bon Appetit

package challenges;

import java.util.ArrayList;
import java.util.List;

public class Bon_Appetit {

	public static void main(String[] args) {
		 //Used for testing the output
		List<Integer> bill= new ArrayList<Integer>();
		bill.add(3);
		bill.add(10);
		bill.add(2);
		bill.add(9); 
    
		bonAppetit(bill, 1, 12);
	}
		
    //Actual Solution
	static void bonAppetit(List<Integer> bill, int k, int b) {
		int sum=0;
		bill.remove(k);   //removing the item She did not pay for 
		
		for(int i=0;i<bill.size();i++) {
			sum+= bill.get(i);
		}
    
    //simple if condition blocks
		if(sum/2==b) {
			System.out.println("Bon Appetit");
			
		}
		else {
			System.out.println(Math.abs((sum/2)-b));   //Math.abs can be skipped. Simply print (b-(sum/2))
		}
			
    }
	
}
