class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        // Create an array where the index is the car's position
        // This automatically sorts the positions for us
        double[] timeatpos = new double[target+1];

        // Calculate time and place in position bucket
        for(int i=0;i<position.length;i++){
            int pos = position[i];
            double time = (double)(target-pos) / speed[i];
            timeatpos[pos] = time;
        }

        int fleet = 0;
        double maxtime = 0.0;

        // Iterating backwards towards zero
        for(int i=target;i>=0;i--){
            if(timeatpos[i]>0){
                if(timeatpos[i]>maxtime){
                    fleet++;
                    maxtime=timeatpos[i];
                }
            }
        }
        return fleet;
    }
}