
import java.util.Stack;


public class StackExample {

    public static void main(String[] args) {

        String e1="indore", e2="bhopal", e3="delhi";
        
        //we wish to store them in a stack.
        
        Stack stk=new Stack();
        stk.push(e1); stk.push(e2); stk.push(e3);
        System.out.println(stk);
        stk.pop();//removes and returns the top most element.
        System.out.println(stk);
        stk.pop();
        System.out.println(stk);
        stk.pop();
        System.out.println(stk);
    }
}
