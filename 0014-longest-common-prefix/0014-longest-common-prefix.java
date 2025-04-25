class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];

        StringBuilder ret = new StringBuilder();
        String str = strs[0];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean allMatch = true;

            for (int j = 1; j < strs.length; j++) {
                String cmpStr = strs[j];
                if (i >= cmpStr.length() || cmpStr.charAt(i) != ch) {
                    allMatch = false;
                    break;
                }
            }

            if (allMatch) {
                ret.append(ch);
            } else {
                break; 
            }
        }

        return ret.toString();
    }
}