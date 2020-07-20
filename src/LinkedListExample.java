
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        //we wish to store some strings in LinkedList.
        
        LinkedList list=new LinkedList();
        list.add("java");
        list.add("cpp");
        list.add("php");
        System.out.println(list);
        list.addFirst("python");//we wish to add this new item in beginging
        System.out.println(list);
        list.add(2, "mysql");
        System.out.println(list);
        //list.removeFirst();
        //list.removeLast();
        list.remove(1);
        System.out.println(list);
    }
}
