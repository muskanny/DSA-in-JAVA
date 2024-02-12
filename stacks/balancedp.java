class balancedp {
    public boolean isValid(String str) {
        Stack<Character> s= new Stack<>();
        for(int i=0; i<str.length(); i++){

            char x=str.charAt(i);
            if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='['){
                s.push(str.charAt(i));
            }
            else{
                if(s.isEmpty()==true){
                    return false;
                }

                char check;
                switch(x){
                    case ')':
                    check=s.pop();
                    if(check!='('){
                        return false;
                    }
                    break;
                    case '}':
                    check=s.pop();
                    if(check!='{'){
                        return false;
                    }
                    break;
                    case ']':
                    check=s.pop();
                    if(check!='['){
                        return false;
                    }
                    break;
                }
            }

            
        }
        return (s.isEmpty());
    }
}