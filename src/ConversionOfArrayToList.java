import java.util.*;

public class ConversionOfArrayToList {
    public static void main(String[] args) {

        /*Initializing object Type Array*/
        String s[] = {"A", "z", "x", "C", "B", "F", "E"};

        /*Converting Array to List*/
        ArrayList l = new ArrayList(Arrays.asList(s));

        /*Printing Size of List*/
        System.out.print("List Size is: "+l.size());
        System.out.println();

        /*Sorting of List*/
        Collections.sort(l);

        /*Printing sorted List*/
        System.out.print(l);
        System.out.println();


        /*Initializing Cursor*/
        Iterator itr=l.iterator();

        /*Checking Condition using Cursor*/

        while (itr.hasNext()){
            String s1=(String)itr.next();
            if (s1.contains("A")){
                System.out.print("Element Found in the List");
            }
        }

        /*Clearing List*/
        l.clear();

        /*Now List is Empty*/
        System.out.println();
        System.out.print(l);




    }
}
