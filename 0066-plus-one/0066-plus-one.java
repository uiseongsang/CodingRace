import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        // 배열 -> int
        StringBuilder sb = new StringBuilder();

        for (int num : digits) {
            sb.append(num);
        }

        // 9876543210 case에서 int가 범위를 벗어남
        BigInteger addOne = new BigInteger(sb.toString());

        addOne = addOne.add(BigInteger.ONE);

        // int -> 배열
        String numberStr = addOne.toString();
        int[] ret = new int[numberStr.length()];

        for (int i = 0; i < numberStr.length(); i++) {
            ret[i] = numberStr.charAt(i) - '0'; // 문자 → 숫자 변환
        }

        return ret;

    }
}