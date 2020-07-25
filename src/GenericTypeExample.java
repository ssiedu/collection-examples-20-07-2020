
import java.util.Stack;


class Emp {
    
}
        
public class GenericTypeExample {
    public static void main(String[] args) {
        Stack<Emp> stk=new Stack<>();
        Emp e1=new Emp();
        Emp e2=new Emp();
        stk.push(e1); stk.push(e2);
    }
}
