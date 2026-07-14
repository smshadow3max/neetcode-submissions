class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=0;
        for(int i=0;i<piles.length;i++){
            right=Math.max(right,piles[i]);
        }
        int fright=right;
        while(left<=right){
            int total1=0;
            int mid=left+(right-left)/2;
            for(int i=0;i<piles.length;i++){
            int k=(piles[i]+mid-1)/mid;
             total1=total1+k;
            }
            if(total1<=h){
                fright=mid;
                right=mid-1;
            }
            else {
                left=mid+1;
            }
        }
        return fright;
    }
}
