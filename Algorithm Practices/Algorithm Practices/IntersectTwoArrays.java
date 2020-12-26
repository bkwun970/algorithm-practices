// 350. Intersection of Two Arrays II

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ar = new ArrayList<>();
        
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for (int num : nums2) {
            if (map.get(num) != null && map.get(num) > 0) {
                ar.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        int[] ans = new int[ar.size()];
        
        for (int i = 0; i < ar.size(); i++) {
            ans[i] = ar.get(i);
        }
        return ans;
    }
}