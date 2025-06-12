class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder word = new StringBuilder();
        int num1 = word1.length();
        int num2 = word2.length();
        int i = 0;
        while(i< num1 || i <num2)
        {
            if(i<num1)
                word.append(word1.charAt(i));
            if(i< num2)
                word.append(word2.charAt(i));
            i++;
        }
        return word.toString();
    }
}