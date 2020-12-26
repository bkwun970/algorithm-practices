// Move Zeros

class Solution {
    public void moveZeroes(int[] nums) {
        // insertion sort
        
        for (int n = 0; n < nums.length - 1; n++) {
            int i = n;
            while (i >= 0 && nums[i] == 0) {
                int tmp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = tmp;
                i--;
            }
        }
    }
}