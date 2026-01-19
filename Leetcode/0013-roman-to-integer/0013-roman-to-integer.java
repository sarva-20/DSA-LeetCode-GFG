class Solution {
    public int romanToInt(String s) {
        
        int sum =0;

        for(int i=0;i<s.length();i++){

            char ch = s.charAt(i);
            switch(ch){
                case 'I':
                    sum+=1;
                    if(i+1<s.length() && (s.charAt(i+1)=='V' || s.charAt(i+1)=='X')){
                        if(s.charAt(i+1)=='V'){
                            sum+=3;
                            i++;
                        }else{
                            sum+=8;
                            i++;
                        }
                    }
                    break;
                case 'V':
                    sum+=5;
                    break;
                case 'X':
                    sum+=10;
                    if(i+1<s.length() && (s.charAt(i+1)=='L' || s.charAt(i+1)=='C')){
                        if(s.charAt(i+1)=='L'){
                            sum+=30;
                            i++;
                        }else{
                            sum+=80;
                            i++;
                        }
                    }
                    break;
                case 'L':
                    sum+=50;
                    break;
                case 'C':
                    sum+=100;
                    if(i+1<s.length() && (s.charAt(i+1)=='D' || s.charAt(i+1)=='M')){
                        if(s.charAt(i+1)=='D'){
                            sum+=300;
                            i++;
                        }else{
                            sum+=800;
                            i++;
                        }
                    }
                    break;
                case 'D':
                    sum+=500;
                    break;
                case 'M':
                    sum+=1000;
                    break;
                default: 
                    continue;
            }
        }
        return sum;
    }
}