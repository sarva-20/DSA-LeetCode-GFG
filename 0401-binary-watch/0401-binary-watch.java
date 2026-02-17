class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        ArrayList<String> result = new ArrayList<>();

        if(turnedOn>8){
            return new ArrayList<String>();
        }
        for(int i=0;i<1024;i++){
            int h = i>>6;
            int m = i&63;
            if(h<12 && m<60 && countBit(i)==turnedOn){
                result.add(h+":"+((m)<10 ? "0"+m : m));
            }
        }
        return result;
    }
    public static int countBit(int num){
        int count=0;

        while(num>0){
            if((num&1)==1){
                count++;
            }
            num=num>>1;
        }
        return count;
    }   
}