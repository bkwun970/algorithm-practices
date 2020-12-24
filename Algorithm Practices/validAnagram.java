// Valid Anagram

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        
        Arrays.sort(s1);
        Arrays.sort(s2);
        
        String s1_sorted = new String(s1);
        String s2_sorted = new String(s2);
        
        return s1_sorted.equals(s2_sorted);
    }
}