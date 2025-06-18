class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int currArea =0;
        int left = 0;
        int right = height.length -1;
        while(left < right){
            currArea = (int)(Math.min(height[left], height[right]) *(right -left));
            maxArea = Math.max(currArea, maxArea);
            if(height[left] <= height[right]){
                left++;
            }else if(height[left] > height[right]){
                right--;
            }
        }
        return maxArea;
    }
}