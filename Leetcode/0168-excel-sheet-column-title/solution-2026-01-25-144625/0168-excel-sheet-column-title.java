class Solution {
    public String convertToTitle(int columnNumber) {
        
        StringBuilder result = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            int ans = columnNumber % 26;

            char ch = (char)(ans+65);

            result.append(ch);
            columnNumber = columnNumber/26;
            
            
        }
        result.reverse();
        return result.toString();
        



    }
}