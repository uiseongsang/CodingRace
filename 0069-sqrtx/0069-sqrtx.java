class Solution {
    public int mySqrt(int x) {
        for (int i = 1; i <= x; i++) {
            long tmp = (long) i * i;
            if (tmp == x) {
                return i;
            } else if (tmp > x) {
                return i - 1;
            }
        }
        return 0;
    }
}


