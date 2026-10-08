class Solution {
    public boolean isValid(String s) {
        //   ([{}])
        //[(])

        Map<Character, Character> hm = new HashMap<>();
        hm.put(']', '[');
        hm.put('}', '{');
        hm.put(')', '(');

        Stack<Character> st = new Stack<>();

        char[] chars = s.toCharArray();
        if (chars.length%2 !=0)
        return false;
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '[':
                    st.push(chars[i]);
                    break;
                case '{':
                    st.push(chars[i]);
                    break;
                case '(':
                    st.push(chars[i]);
                    break;
                case ']':
                case '}':
                case ')': {
                   if (st.size() >= 1 && st.peek() == hm.get(chars[i]))
                        st.pop();
                        else 
                        return false;
                        break;
            
                }
            }
        }
        if (st.isEmpty())
            return true;
        else
            return false;
    }
}
