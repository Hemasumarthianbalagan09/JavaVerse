
import java.util.Scanner;
import java.util.Stack;
public class smallestelementinstack {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter no of elements:");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements:");
        for(int i=0;i<n;i++){
            stack.push(sc.nextInt());
        }
        int smallest = stack.get(0);
        for(int i=1;i<stack.size();i++){
            if(stack.get(i)< smallest){
               smallest = stack.get(i);
            }
        }
        System.out.println("Stack" + stack);
        System.out.println("smallest element  " + smallest);
    
    sc.close();
}
}
