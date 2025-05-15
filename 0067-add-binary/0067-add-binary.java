import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        BigInteger ia = new BigInteger(a, 2); 
        BigInteger ib = new BigInteger(b, 2);
        BigInteger sum = ia.add(ib);
        return sum.toString(2);
    }
}