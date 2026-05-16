class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;

        List<StringBuilder> rows = new ArrayList<>();

        for(int i=0;i<numRows && i<s.length();i++){
            rows.add(new StringBuilder());
        }

        int i=0;
        boolean goingDown=false;

        for(char c : s.toCharArray()){
            rows.get(i).append(c);

            if(i==0 || i==numRows-1){
                goingDown=!goingDown;
            }

            if(goingDown){
                i++;
            }else{
                i--;
            }
        }
        StringBuilder result = new StringBuilder();
        for(StringBuilder row : rows){
            result.append(row);
        }
        return result.toString();

    }
}