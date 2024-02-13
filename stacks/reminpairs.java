class reminpairs {
    // Function to remove pair of duplicates from given string using Stack.
    public static String removePair(String str) {
        // your code here
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (st.isEmpty() || st.peek() != str.charAt(i)) {
                st.push(str.charAt(i));
                continue;
            }

            st.pop();
        }

        String ans = "";
        while (!st.isEmpty()) {
            ans = st.pop() + ans;
        }
        return ans;
    }
}