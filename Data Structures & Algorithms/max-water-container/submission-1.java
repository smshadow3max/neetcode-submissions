class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int maxarea=0;
        while(left<right){
            int  width=right-left;
            int height=Math.min(heights[left],heights[right]);
            int sum=width*height;
            maxarea=Math.max(maxarea,sum);
            if(heights[left]<heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxarea;
    }
}
