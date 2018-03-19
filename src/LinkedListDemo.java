
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args){
        LinkedList l=new LinkedList();
        l.add("mustafiz");
        l.add("masud");
        l.add("reza");
        l.add("mahmud");
        l.add("shamim");
        System.out.print(l);
        System.out.println();
        Iterator itr=l.iterator();
        while (itr.hasNext()){
            String str=(String)itr.next();
            System.out.print(str+" ");
        }

        l.add(0,"Emran");
        System.out.println();
        System.out.print(l);
        l.remove("mustafiz");
        System.out.println();
        System.out.print(l);
        l.removeFirst();
        System.out.println();
        System.out.print(l);
        System.out.println();
        System.out.print(l.getFirst());

    }
}
