class delmid
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        // code here
        int size=sizeOfStack;
        Stack<Integer> temp=new Stack<Integer>();
        while(!s.isEmpty()){
            
            if(sizeOfStack==((size+1)/2) && size%2!=0 || size%2==0 && sizeOfStack==(size/2)){
                s.pop();
                sizeOfStack--;
                continue;
            }
            temp.push(s.pop());
            sizeOfStack--;
        }
        
        
        while(!temp.isEmpty()){
            s.push(temp.pop());
        }
        
        return;
    } 
}

