class Solution {
    public int maxArea(int[] height) {
        int max = -1;
        int p1 =0, p2 = height.length -1;
        while (p1 < p2) {
            int lit = Math.min(height[p1], height[p2]);
            max = Math.max(max, lit * (p2-p1));
            if (height[p1]>height[p2]) {
                p2--;
            } else {
                p1++;
            }
        }
        return max;
    }
}