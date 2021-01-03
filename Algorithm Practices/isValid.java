// Valid Parentheses

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            if (tmp == '[' || tmp == '{' || tmp == '(') {
                st.push(tmp);
            } else if (!st.isEmpty()) {
                char temp = st.peek();
                
                if (temp == '[' && tmp == ']') {
                    st.pop();
                } else if (temp == '{' && tmp == '}') {
                    st.pop();
                } else if (temp == '(' && tmp == ')') {
                    st.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        
        return st.isEmpty();
    }
}