// Two Sum

// using two pointers
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
      
        for (int n = 0; n < nums.length; n++) {
            int i = n;
            int j = nums.length - 1;
            
            while (i < j) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                } else {
                    j--;
                }
            }
        }
        return ans;
    }
}