import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList l=new ArrayList();
        l.add(20);
        l.add(5);
        l.add(3);
        l.add(4);
        l.add(10);
        l.add(11);

        System.out.print(l+" ");
        Collections.sort(l);
        System.out.println();
        //l.clear();

        if (l.isEmpty()){
            System.out.println("List is Empty");
        }
        else {
            System.out.print(l+" ");
        }

        l.remove(0);
        System.out.println(l.get(3));
        System.out.println();
        System.out.print(l);
    }
}
