//Solution for HackerRank problem : Counting Valleys

static int countingValleys(int n, String s) {
                
         char arr[] = s.toCharArray();  //Method to convert String into a Char Array
         
         int level=0; //sea level
         int count=0; //number of times the hiker went up the valley
         
         for(int i=0;i<s.length();i++) {
             
             if(arr[i]=='U') {
                 ++level;
         		 }
             
             if(arr[i]=='D') {
                 --level;
             }
             
						 
             if(level==0 && arr[i]=='U') {  //We are only checking the times when level was at sea level ie 0, and then if the hiker went 'UP' the sea level after reaching the sea level
                count++; 
             }
        	}
             
         return count;
    }
