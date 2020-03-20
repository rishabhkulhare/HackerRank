package warmup;

public class AppleAndOranges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
  
  //Method 
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int start = s;
        int end = t;
        int applepos = a;
        int orangepos=b;
        
        int applecount = 0;
        int orangecount=0;
        
        int applenum = apples.length;
        int orangenum = oranges.length;
        
        int appledist [] = new int[applenum];
        int orangedist[] = new int[orangenum];
        
        
        //Creating array with distances from apple tree
        for(int i =0 ; i< applenum;i++) {
        	appledist[i]=applepos+apples[i];
        	
        }
        
        //Creating array with distances from orange tree
        for(int i=0;i<orangenum;i++) {
        	orangedist[i]= b+oranges[i];
        }
        
        //Finding number of apples in range s-t
        for(int i =0;i<applenum;i++) {
        	if(appledist[i]>=s && appledist[i]<=t) {
        		applecount++;
        	}
        }
        
      //Finding number of oranges in range s-t
        for(int i =0;i<orangenum;i++) {
        	if(orangedist[i]>=s && orangedist[i]<=t) {
        		orangecount++;
        	}
        }
        
        
        

}
	
}
