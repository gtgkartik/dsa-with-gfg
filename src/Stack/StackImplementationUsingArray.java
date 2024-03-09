package Stack;

public class StackImplementationUsingArray {

    static class Stack {
        int arr[] ;
        int top ;
        int cap ;

        Stack(int cap){
            this.cap = cap ;
            this.top = -1 ;
            arr = new int[cap];
        }

        void push(int x){
            top++ ;
            arr[top] = x ;
        }

        int pop(){
            int res = arr[top] ;
            top-- ;
            return res;
        }

        int peek(){
            if(top==-1){
                return -1 ;
            }else {
                return arr[top] ;

            }
        }
    }

    public static void main(String args[]){
       Stack s = new Stack(10);
       s.push(2);
       s.pop();
       System.out.println(s.peek());
    }
}
