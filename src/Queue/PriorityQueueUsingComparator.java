package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueUsingComparator {
    public static void main(String args[]){

        PriorityQueue q=new PriorityQueue(new MyComparator());
        
        q.offer("Z");
        q.offer("N");
        q.offer("J");
        q.offer("A");
        q.offer("B");
        q.offer("L");

        System.out.print(q);
    }
}


class MyComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        String s1=(String)o1;
        String s2=(String)o2;

        return s1.compareTo(s2);
    }
}