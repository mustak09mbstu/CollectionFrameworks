package Queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String args[]){
        PriorityQueue p=new PriorityQueue();

        //System.out.print(p.peek()); //NULL
        //System.out.print(p.element()); //NSEE

        for (int i=0;i<10;i++){
            p.offer(i);
        }

        System.out.print(p);

        p.remove(0);

        System.out.println();
        System.out.print(p);

        System.out.println();
        System.out.print(p.poll());

        System.out.println();
        System.out.print(p);



    }
}
