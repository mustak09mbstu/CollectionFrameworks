package Map;

import java.util.*;

public class HashmapDemo {

    public static void main(String args[]) {

        HashMap m = new HashMap();
        m.put("mustafiz", 1000);
        m.put("mahmud", 1500);
        m.put("reza", 2000);
        m.put("shamim", 2500);
        m.put("masud", 3000);

        System.out.print(m);
        m.put("masud", 2000);

        /*Duplicate key found so value will be replaced*/

        System.out.println();
        System.out.print(m);

        /*Collection views of Map*/
        Set set = m.keySet();
        Set s = m.entrySet();
        Collection c = m.values();


        System.out.println();
        System.out.print(set);

        System.out.println();
        System.out.print(s);

        System.out.println();
        System.out.print(c);

        /*Defining Cursor*/
        Set s1 = m.entrySet();
        Iterator itr = s1.iterator();

        System.out.println();

        while (itr.hasNext()) {
            Map.Entry m1 = (Map.Entry) itr.next();

            System.out.print(m1.getKey() + "....." + m1.getValue() + " ");

            if (m1.getKey().equals("masud")) {
                m1.setValue("3500");
            }
        }

        System.out.println();
        System.out.print(m);
    }
}
