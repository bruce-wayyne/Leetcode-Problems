class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        Arrays.sort(nums);
        int highest = 0;
        int count = 1;
        for (int i = 1;i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                if (nums[i] - nums[i-1] != 1) {
                    count = 1;
                } else {
                    count++;
                }
            }
            if (highest < count) {
                highest = count;
            }
        }
        return highest;
    }
}