package hashmaps;

import java.util.HashMap ;
public class hashmapImplementation {


    public static void main(String[] args) {

        HashMap<Integer, String> h = new HashMap<Integer, String>() ;
        h.put(0, "kartik");
        h.put(1, "sai");

        System.out.println(h);

        System.out.println(h.containsKey(1));
        System.out.println(h.containsValue("kartik"));
        System.out.println(h.isEmpty());
        System.out.println(h.size());
        System.out.println(h.get(1));
        System.out.println(h.get(2));
    }
}
