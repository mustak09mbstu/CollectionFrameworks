package Set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args){


        TreeSet treeSet=new TreeSet(new MyComparator());
        treeSet.add(50);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(22);
        treeSet.add(12);
        treeSet.add(27);
        treeSet.add(26);



        System.out.print(treeSet);

    }
}


class MyComparator implements Comparator{
    public int compare(Object o,Object b){
        Integer I1=(Integer)o;
        Integer I2=(Integer)b;
        //return I1.compareTo(I2); // [Ascending order]
        //return -I1.compareTo(I2); [Descending order]
        //return I2.compareTo(I1);  [Descending order]
        //return -I2.compareTo(I1); [Ascending order]
        return +1;    //[Insertion order]
        //return -1;    [Reverse of Insertion order]
        //return 0;     [Only First Element Will be inserted and remaining element will be Considered as Duplicate]
    }
}
