class Solution {
    public int trap(int[] height) {
        int leftMax[] = new int[height.length];
        int rightMax[] = new int[height.length];
        
        int max = 0;
        for (int i = height.length - 1 ; i > -1 ; i--) {
            rightMax[i] = Math.max(height[i], max);
            max = rightMax[i];
        }

        int total = 0;
        max = 0;
        for (int i = 0 ; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], max);
            max = leftMax[i];
            if (i != 0 && i != height.length-1) {
                int minHeight = Math.min(leftMax[i], rightMax[i]);
                if (minHeight > height[i]) {
                    total+= minHeight - height[i];
                }
            }
        }
        return total;

    }
}