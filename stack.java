import java.util.ArrayList;
public class stack{
    ArrayList <Integer> stack = new ArrayList<>(); 
    void push(int value){
        stack.add(value);
        System.out.println(value + "Pushed into stack");
    }

    void pop(){
        if(stack.isEmpty()){
            System.out.println( "stack is empty");

        }
        else{
            int value = stack.remove(stack.size()-1);
            System.out.println(value + "popped from stack");
        }
    }
    void peek(){
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
    }else{
        System.out.println("Top element:" + stack.get(stack.size()-1));
    }
}
public static void main(String[] args){
    stack s = new stack();
    s.push(10);
    s.push(20);
    s.push(30);
    s.push(40);
    s.peek();
    s.pop();
    s.peek();
   }
}