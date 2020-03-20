//Solution to Sock Merchant Problem of HackerRank


//Method
static int sockMerchant(int n, int[] ar) {

           HashSet<Integer> socks = new HashSet<Integer>();
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            int sockno = ar[i];
            if (socks.contains(sockno)) {    //if set contains the sock number , remove it and increment count
                socks.remove(sockno);
                count++;
            } else {
                socks.add(sockno);        //if set does not contain the sock number from array ar, simply add in the HashSet socks
            }

        }
        return count;

    }
