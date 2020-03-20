//Solution to HackerRank Problem : Mini-Max Sum


//Method
static void miniMaxSum(int[] arr) {
                 Arrays.sort(arr);
        /*
         * for(int i:arr) { System.out.println(i); }
         */
         
         int size=arr.length;
         long maxsum=0,minsum=0;
         for(int i=1;i<size;i++) {
             maxsum +=arr[i];
         }
         for(int j=0;j<size-1;j++) {
             minsum+=arr[j];
         }
         
         
         System.out.println((minsum+" "+maxsum));

    }
