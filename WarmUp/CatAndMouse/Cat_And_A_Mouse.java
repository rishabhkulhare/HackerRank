//Method for Cat And a Mouse problem of HackerRank

static String catAndMouse(int x, int y, int z) {
                int cata=0,catb=0;
        
        cata=Math.abs(z-x);   //To get the absolute difference 
        catb=Math.abs(z-y);   
        
        
        //Simple if conditions to return Suitable Answers
        if(cata==catb) {
            return "Mouse C";
        }
        else if(cata>catb) {
            return "Cat B";
        }
        else {
            return "Cat A";
        }

    }
