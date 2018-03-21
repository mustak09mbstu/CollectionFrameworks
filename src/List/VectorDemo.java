import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String args[]){
        Vector v=new Vector();

        System.out.print("Initail Capacity: "+v.capacity());

        for (int i=0;i<=10;i++){
            v.addElement(i);
        }

        System.out.println();
        System.out.print(v);

        System.out.println();
        System.out.print("Incremented capacity: "+v.capacity());

        Enumeration enumeration=v.elements();
        System.out.println();

        while (enumeration.hasMoreElements()) {
            Integer I=(Integer)enumeration.nextElement();
            if (I%2==0)
            System.out.print(I+" ");

        }

        v.addElement(1);
        v.addElement(8);
        v.addElement(7);
        v.addElement(5);

        System.out.println();
        System.out.print(v);

        Collections.sort(v);
        System.out.println();
        System.out.print("Using Default Natural Sorting: "+v);

        class MyComparator implements Comparator {
            public int compare(Object obj1,Object obj2){
                Integer s1=(Integer)obj1;
                Integer s2=(Integer)obj2;
                return s2.compareTo(s1);
            }
        }

        v.sort(new MyComparator());
        System.out.println();
        System.out.print("Using Customised Sorting: "+v);
    }
}
