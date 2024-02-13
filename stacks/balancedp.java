class balancedp {
    public boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {

            char x = str.charAt(i);
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                s.push(str.charAt(i));
            } else {
                if (s.isEmpty() == true) {
                    return false;
                }

                char check;
                switch (x) {
                    case ')':
                        check = s.pop();
                        if (check != '(') {
                            return false;
                        }
                        break;
                    case '}':
                        check = s.pop();
                        if (check != '{') {
                            return false;
                        }
                        break;
                    case ']':
                        check = s.pop();
                        if (check != '[') {
                            return false;
                        }
                        break;
                }
            }

        }
        return (s.isEmpty());
    }
}

/*
 * class Solution
 * {
 * //Function to check if brackets are balanced or not.
 * static boolean ispar(String x)
 * {
 * // add your code here
 * 
 * Stack<Character> s=new Stack<>();
 * for(int i=0; i<x.length(); i++){
 * 
 * if(x.charAt(i)=='(' || x.charAt(i)=='{' || x.charAt(i)=='[' ){
 * s.push(x.charAt(i));
 * }
 * 
 * else{
 * if(s.size()==0){return false;}
 * switch(x.charAt(i))
 * {
 * case ')':
 * if(s.peek()!='(' ){
 * return false;
 * }
 * 
 * s.pop(); break;
 * 
 * case '}':
 * if(s.peek()!='{' ){
 * return false;
 * }
 * 
 * s.pop(); break;
 * case ']':
 * if(s.peek()!='[' ){
 * return false;
 * }
 * 
 * s.pop(); break;
 * }
 * }
 * }
 * 
 * if(s.isEmpty()){
 * return true;
 * }
 * 
 * return false;
 * }
 * }
 * 
 */