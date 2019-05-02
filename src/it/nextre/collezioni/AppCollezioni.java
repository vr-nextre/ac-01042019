package it.nextre.collezioni;

import java.util.*;

public class AppCollezioni {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put(null,"ciao");
        map.put(null,"ciaoneee");
        System.out.println(map.get(null));

        Set<String> set = new HashSet<>();
        set.add(null);
        System.out.println(set.contains(null));

        List<String> l2 = new ArrayList<>();
        l2.add("a");
        l2.add(null);
        l2.add("x");
        l2.add(null);
        l2.add("d");
        System.out.println(l2);
        //l2.removeIf(e->e==null);

        //l2.remove(null);
        //l2.remove(null);

        l2.removeAll(Arrays.asList("x"));

        System.out.println(l2);
    }//end main


}//end class
