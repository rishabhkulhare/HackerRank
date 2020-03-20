package warmup;

public class SimpleArraySum {

	public static void main(String[] args) {
			
	}
  
  
  //Method
	static int simpleArraySum(int[] ar) {
        
		
            int sum=0;
         int size = ar.length;
         for(int i=0;i<size;i++){

                sum+= ar[i];
         }
    return sum;
    }
}
