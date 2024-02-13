import java.util.*;
import java.io.*;

class remconsdupli {
    // Function to remove consecutive duplicates from given string using Stack.
    public static String removeConsecutiveDuplicates(String str) {
        // Your code here
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (st.isEmpty() || st.peek() != str.charAt(i)) {
                st.push(str.charAt(i));
            }
        }
        String ans = "";
        while (!st.isEmpty()) {
            ans = st.pop() + ans;
        }

        return ans;
    }
}