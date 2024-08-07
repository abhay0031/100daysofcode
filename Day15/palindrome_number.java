class Solution {
    public boolean isPalindrome(int x) {
        // first method
        // if(x<0){

        //     return false;
        // }
        // int original=x;
        // int r=0;
        // int n;
        
        // while(x>0){
        //     n=x%10;
        //     r=r*10+n;
        //     x=x/10;
        // }

        // return(original==r);

        // second method

        String str=String.valueOf(x);

        String or=str;
        StringBuilder sb=new StringBuilder(str);
        String st1=sb.reverse().toString();  //.toString is written because Stringbuilder returns an objects  
        
        return st1.equals(or);



    

        
    }
}