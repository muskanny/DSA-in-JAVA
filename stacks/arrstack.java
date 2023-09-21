package stacks;
class Stack{
    static final int MAX=1000;
    int top;
    int a[]=new int[MAX];
    
    Stack(){
        top=-1;
    }

    boolean isEmpty(){
        return (top<0);
    }

    boolean push(int val){
        if(top>=MAX-1){
            System.out.println("it is a stack overflow condn, can't be inserted");
            return false;
        }

        else{
            top=top+1;
            a[top]=val;
            System.out.println(val+" pushed into the stack");
            return true;

        }

    }

    int pop(){
        if(top<0){
            System.out.println("underflow condition achieved, cant pop");
            return -1;
        }

        else{
            int x=a[top];
            top--;
            return x;

        }
        

    }

    int peek(){
        if(top<0){
            System.out.println("stack is empty");
            return -1;
        }
        else{
            return a[top];
        }
    }

    public void print(){
        for(int i=a.length; i>-1; i--){
            System.out.println(a[i]);
        }
    }

}
public class arrstack {
    //driver code goes into our main function
    public static void main(String[] args) {
        Stack s= new Stack();
        s.push(3);
        s.push(7);
        s.push(11);
        s.push(13);
        s.push(22);

        System.out.println("popping for first time now "+s.pop()+ " popped");
        System.out.println("popping for second time "+s.pop()+" popped");

        System.out.println("peeking the element at the top now "+s.peek());

        s.print();
    }
    

    
}
