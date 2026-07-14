class Solution {
    public int longestConsecutive(int[] nums) {

        int n = nums.length;

        if (n == 0)
            return 0;

        HashSet<Integer> map = new HashSet<>();

        for (int i = 0; i < n; i++) {
            map.add(nums[i]);
        }

        int longest = 1;

        for (int i = 0; i < n; i++) {

            if (!map.contains(nums[i] - 1)) {

                int current = nums[i];
                int count = 1;

                while (map.contains(current + 1)) {
                    count++;
                    current++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}