// single number

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        Stack<Integer> st = new Stack<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (!st.contains(nums[i])) {
                st.push(nums[i]);
            } else {
                st.pop();
            }
        }
        return st.get(0);
    }
}