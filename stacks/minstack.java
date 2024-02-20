
//brute force method
import java.util.Stack;
import java.io.*;
import java.util.*;

class minstack {
    Stack<Integer> st=new Stack<>();
    public minstack() {
        
    }
    
    public void push(int val) {
        st.push(val);
    }
    
    public void pop() {
        if(st.isEmpty()){
            return;
        }
        st.pop();
    }
    
    public int top() {
        if(st.isEmpty()){
            return -1;
        }
        return st.peek();
    }
    
    public int getMin() {
        if(st.isEmpty()){
            return -1;
        }
        Stack<Integer> temp=new Stack<>();
        int min=Integer.MAX_VALUE;
        while(!st.isEmpty()){
            
            int current=st.pop();
            temp.push(current);
            if(current<min){
                min=current;
            }
        }

        while(!temp.isEmpty()){
            st.push(temp.pop());
        }

        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */