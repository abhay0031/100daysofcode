class Solution {
    public String toLowerCase(String s) {
        // return s.toLowerCase();

        char []chars=s.toCharArray();
        int len=chars.length;

        for(int i=0;i<len;i++){

            if(chars[i]>='A' && chars[i]<='Z'){

                chars[i]=(char)(chars[i]+32);
            }
        }
        return new String(chars);
    }
}