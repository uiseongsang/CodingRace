class Solution {
    public boolean isPalindrome(int x) {
        String strX = Integer.toString(x);

        String reversedStrX = new StringBuilder(strX).reverse().toString();

        return strX.equals(reversedStrX);
    }
}