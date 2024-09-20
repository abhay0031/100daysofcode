import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        
        BigInteger n1=new BigInteger(a,2);
        
        BigInteger n2=new BigInTteger(b,2);
    

        BigInteger result=n1.add(n2);

        return result.toString(2);
    }
}