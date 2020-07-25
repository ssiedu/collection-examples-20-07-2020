
import java.util.ArrayList;
import java.util.Iterator;


public class CollectionMethodsExample {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();
        list.add("indore"); list.add("bhopal"); list.add("chennai");
        //System.out.println(list.size());
        //System.out.println(list);
        
        //to fetch the elements of a collection one-by-one

        //using iterator
        
        Iterator it=list.iterator();
       
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        list.remove("bhopal");
        System.out.println(list);
        
        boolean res=list.contains("indore");
        System.out.println(res);
        /*
        //for-each loop
        for(String item:list){
            System.out.println(item);
        }
        */
        
        /*
        //traditional for loop
        
        for(int i=0; i<list.size(); i++){
            String item=list.get(i);
            System.out.println(item);
        }
        */
    }
}
