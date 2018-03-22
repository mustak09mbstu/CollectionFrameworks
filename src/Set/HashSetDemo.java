package Set;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;


public class HashSetDemo {
    public static void main(String[] args){
        HashSet h=new HashSet();
        for (int i=0;i<=10;i++){
            h.add(i);
        }

        System.out.print(h);
        System.out.println();

        System.out.print(h.add(11));
        System.out.println();
        System.out.print(h);

        System.out.println();

        Iterator itr=h.iterator();
        while (itr.hasNext()){
            Integer s1=(Integer) itr.next();
            System.out.print(s1+" ");
        }


        h.add(50);
        h.add(33);
        h.add(22);
        h.add(72);
        h.add(100);
        System.out.println();
        System.out.print(h);

        /*Insertion Order is not preserved and Duplicate value is not allowed*/
    }
}
