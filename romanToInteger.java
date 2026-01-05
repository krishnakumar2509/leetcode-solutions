class Solution {
    public int romanToInt(String s) {
        int total=0;
        for(int i=0;i<s.length();i++){
            int current=value(s.charAt(i));
            if(i+1<s.length()&&current<value(s.charAt(i+1))){
                total-=current;
            }
            else{
                total+=current;
            }
            

        }return total;
    }
    
     private int value(char c){
        switch(c){
            case 'M': return 1000;
            case 'D': return 500;
            case 'C': return 100;
            case 'L': return 50;
            case 'X': return 10;
            case 'V': return 5;
            case 'I': return 1;

        }
        
        return 0;
     }
    }
