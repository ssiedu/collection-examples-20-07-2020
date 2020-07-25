
import java.util.TreeMap;


public class MapExample {

    public static void main(String[] args) {

        //HashMap<String,String> map=new HashMap<>();
        //LinkedHashMap<String,String> map=new LinkedHashMap<>();
        TreeMap<String,String> map=new TreeMap<>();
        map.put("pm", "Mr. Modi");
        map.put("hm", "Mr. Shah");
        map.put("dm", "Mr. Singh");
        //System.out.println(map);
        String res=map.get("fm");
        System.out.println(res);
    }
}
