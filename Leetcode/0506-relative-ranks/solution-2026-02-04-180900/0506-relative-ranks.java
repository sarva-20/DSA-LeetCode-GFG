class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] result = new String[score.length];

        int[][] players = new int[score.length][2];
        
        for(int i=0;i<score.length;i++){
            players[i][0]=score[i];
            players[i][1]=i;
        }

        Arrays.sort(players, (a, b) -> b[0] - a[0]);
        
        for(int i=0;i<players.length;i++){
            int originalindex = players[i][1];
            if(i==0){
                result[originalindex]="Gold Medal";
            }else if(i==1){
                result[originalindex]="Silver Medal";
            }else if(i==2){
                result[originalindex]="Bronze Medal";
            }else{
                result[originalindex] = String.valueOf(i+1);
            }
        }
        return result;

    }
}