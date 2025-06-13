
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int cadmax = Integer.MIN_VALUE;
        for(int i= 0; i < candies.length; i++){
            if(candies[i]> cadmax){
                cadmax = candies[i];
            }
        }
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i< candies.length; i++){
            if(candies[i]+ extraCandies >= cadmax){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}
