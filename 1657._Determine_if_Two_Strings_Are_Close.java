import java.util.*;

class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()){
            return false;
        }

        int f1[] = new int[26];
        int f2[] = new int [26];
        for(char ch : word1.toCharArray()){
            f1[ch - 'a']++;
        }
        for(char ch : word2.toCharArray()){
            f2[ch - 'a']++;
        }
        for(int i = 0; i< 26; i++){
            if(f1[i]==0 && f2[i]!=0 || f2[i] == 0 && f2[i]!= 0){
                return false;
            }
        }
        Arrays.sort(f1);
        Arrays.sort(f2);
        return Arrays.equals(f1, f2);
    }
}
