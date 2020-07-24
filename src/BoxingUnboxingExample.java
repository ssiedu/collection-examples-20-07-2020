
import java.util.Stack;


public class BoxingUnboxingExample {

    public static void main(String[] args) {

        Stack stk=new Stack();
        stk.push("abc");
        stk.push(10);       //automatic wrapping of premitive value to an object
        stk.push(5.6);
        
        Double d1=(Double)stk.pop();
        System.out.println(d1*2);       //d1.doubleValue()  automatic (autounboxing)
        
    }
}
