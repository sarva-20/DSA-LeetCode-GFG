class Solution {
    public int minimumDeletions(String s) {
        int[] countA = new int[s.length()];
        int[] countB = new int[s.length()];

        int bcount=0;

        for(int i=0;i<s.length();i++){
            countB[i]=bcount;
            if(s.charAt(i)=='b') bcount++;
        }

        int acount=0;
        for(int i=s.length()-1;i>=0;i--){
            countA[i]=acount;
            if(s.charAt(i)=='a') acount++;
        }

        int deletions=s.length();

        for(int i=0;i<s.length();i++){
            deletions=Math.min(deletions, countA[i]+countB[i]);
        }
        return deletions;

    }
}