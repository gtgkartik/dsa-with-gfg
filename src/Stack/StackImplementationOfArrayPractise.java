package Stack;

public class StackImplementationOfArrayPractise {
    static class MyStack {
        int top ;
        int arr[];
        int cap ;

        MyStack(int cap){
             this.cap  = cap ;
             arr = new int[cap];
             this.top  = -1 ;
        }

        void push(int x) {
            top++ ;
            arr[top] = x ;
        }

        int pop() {

                int res = arr[top];
                top--;
                return res;


        }


        int peek(){

                return arr[top] ;

        }

        boolean isEmpty(){
            if(top==-1){
                return true ;
            }else {
                return false ;
            }
        }
    }

    public static void main(String args[]){
        MyStack stack = new MyStack(10);

        stack.push(10);
        stack.push(34);
        stack.push(22);
        stack.push(44);
        stack.push(3);
        stack.push(10);
        System.out.println( stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(10);
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());


    }
}
