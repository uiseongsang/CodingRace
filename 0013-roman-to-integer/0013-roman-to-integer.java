import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> mVal = Map.of(
            'I', 1, 'V', 5, 'X', 10, 'L', 50,
            'C', 100, 'D', 500, 'M', 1000
        );

        int sumVal = 0;
        int len = s.length();

        for (int i = 0; i < len; i++) {
            int currVal = mVal.get(s.charAt(i));
            int nextVal = (i + 1 < len) ? mVal.get(s.charAt(i + 1)) : 0;

            if (currVal < nextVal) {
                sumVal -= currVal;
            } else {
                sumVal += currVal;
            }
        }

        return sumVal;
    }
}