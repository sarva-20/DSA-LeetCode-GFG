class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder st = new StringBuilder();
        st.append("0");

        while(st.length() < k){
            st.append('1');
            int ind = st.length()-2;
            while(ind >= 0){
                if(st.charAt(ind) == '1') st.append('0');
                else st.append('1');
                ind--;
            }
        }

        return st.charAt(k-1);
    }
}