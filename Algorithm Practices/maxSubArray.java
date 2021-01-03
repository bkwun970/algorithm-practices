// Maximum Subarray

class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int sum = nums[0];
        int max = nums[0];
        // [-2,1,-3,4,-1,2,1,-5,4]
        
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];

            if (nums[i] > sum) {
                sum = nums[i];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}

// another approach

class Solution {
    public int maxSubArray(int[] nums) {
        int localMax = nums[0];
        int max = nums[0];
        // [-2,1,-3,4,-1,2,1,-5,4]
        
        for (int i = 1; i < nums.length; i++) {
            localMax = Math.max(localMax + nums[i], nums[i]);
            max = Math.max(max, localMax);
        }
        return max;
    }
}