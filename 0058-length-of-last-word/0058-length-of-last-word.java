class Solution {
    public int lengthOfLastWord(String s) {
        String word = "";
        ArrayList<String> ret = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                word += s.charAt(i);
            } else {
                if (!word.equals("")) {
                    ret.add(word);
                    word = "";
                }
            }
        }
        // 마지막 단어가 남아있을 경우 추가
        if (!word.equals("")) {
            ret.add(word);
        }

        String lastItem = ret.get(ret.size() - 1);
        return lastItem.length();
    }
}
