class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        Arrays.sort(nums);
        for (int i = 0 ;i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int start = i+1;
            int end = nums.length-1; 
            while (start < end) {
                int total = nums[i] + nums[start] + nums[end];
                if (total == 0) {
                    ArrayList<Integer> list = new ArrayList();
                    list.add(nums[i]);
                    list.add(nums[start]);
                    list.add(nums[end]);
                    ans.add(list);
                    while (start < end && nums[start] == nums[start + 1]) {
                        start++;
                    }
                    while (start < end && nums[end] == nums[end - 1]) {
                        end--;
                    }
                    start++;
                } else if (total > 0) {
                    end--;
                } else {
                    start++;
                }
            }
        }
        return ans;
    }
}