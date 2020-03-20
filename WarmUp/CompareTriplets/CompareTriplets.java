//Method
static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int apoint=0,bpoint=0;
for(int i =0;i<3;i++){
            if(a.get(i)>b.get(i)) {
                apoint++;
        }
            else if(a.get(i)<b.get(i)){
                bpoint++;
            }
            else if(a.get(i)==a.get(i)) {
                apoint=bpoint=0;
            }
    }
List<Integer> points = new ArrayList<Integer>();
points.add(0,apoint);
points.add(1, bpoint);

    return points;

}
