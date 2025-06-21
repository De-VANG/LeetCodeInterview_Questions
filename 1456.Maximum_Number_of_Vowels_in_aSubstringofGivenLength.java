class Solution {
    public int maxVowels(String s, int k) {
        int left = 0, right = 0, res = 0, count =0;
        for ( ;right <k; right++){
            count += vowel(s.charAt(right));
        }
        res = count;
        while(right < s.length()){
            count -= vowel(s.charAt(left++));
            count += vowel(s.charAt(right++));
            res = Math.max(res, count);
        }
        return res;
    }

    private int vowel(char c){
        return(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')? 1 : 0;
    }
    
}