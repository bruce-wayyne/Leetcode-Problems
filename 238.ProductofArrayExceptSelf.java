class Solution {
    public int[] productExceptSelf(int[] nums) {
        int leftOrRight = 1;
        int ans [] = new int[nums.length];
        for (int i = 0 ; i < ans.length; i++) {
            ans[i] = 1;
        }
        for (int i = 0 ; i< nums.length; i++) {
            ans[i]*= leftOrRight;
            leftOrRight*=nums[i];
        }
        leftOrRight = 1;
        for (int i = nums.length - 1 ; i > -1; i--) {
            ans[i]*= leftOrRight;
            leftOrRight*= nums[i];
        }
        return ans;
    }
}