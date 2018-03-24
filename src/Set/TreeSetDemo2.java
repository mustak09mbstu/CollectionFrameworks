package Set;

/*StringBuffer Objects are not Comparable so we have to use our own Sorting means Customised Sorting*/

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String args[]){
        TreeSet t=new TreeSet(new MyComparator1());

        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("Z"));
        t.add(new StringBuffer("K"));
        t.add(new StringBuffer("L"));

        System.out.print(t);

    }
}

class MyComparator1 implements Comparator{
    public int compare(Object o1,Object o2){

        String s1=o1.toString();
        String s2=o2.toString();
        return s1.compareTo(s2);
    }
}