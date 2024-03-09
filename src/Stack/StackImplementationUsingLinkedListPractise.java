package Stack;

import java.util.ArrayList ;

public class StackImplementationUsingLinkedListPractise {

    static class MyStack{
        ArrayList<Integer> arr = new ArrayList<Integer>() ;

        void push(int x ){
            arr.add(x);
        }

        int pop(){
            int res = arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            return res ;
        }

        int peek(){
           int res = arr.get(arr.size()-1);
           return res ;
        }

        int get(int index){
            return arr.get(index);
        }

        int size(){
            return arr.size();
        }

        boolean isEmpty(){
            return arr.isEmpty();
        }
    }


    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push(64);
        stack.push(21);
        stack.push(87);
        stack.push(64);
        stack.push(23);
        stack.push(65);
        stack.push(43);
        stack.push(34);
        stack.push(22);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
