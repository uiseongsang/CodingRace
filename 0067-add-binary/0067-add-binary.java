class Solution {
    public String addBinary(String a, String b) {
        int ia = Integer.parseInt(a, 2);  // 2진수 문자열 a -> 10진수 정수
        int ib = Integer.parseInt(b, 2);  // 2진수 문자열 b -> 10진수 정수
        int sum = ia + ib;                
        return Integer.toBinaryString(sum); // 10진수 -> 2진수 문자열
    }
}