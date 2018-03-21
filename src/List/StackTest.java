import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;


public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack();

        /*Initial Capacity*/
        System.out.print("Initial Capacity: " + stack.capacity());

        /*Adding Element into stack*/

        stack.push("mustak");
        stack.push("mahmud");
        stack.push("reza");
        stack.push("masud");
        stack.push("shamim");

        /*Printing the element*/
        System.out.println();
        System.out.print(stack);

        System.out.println();

        /*remove and return first element*/
        System.out.println(stack.pop());

        /*search the element and if found return the index*/
        System.out.println(stack.search("masud"));

        /*Printing the element*/
        System.out.println();
        System.out.print(stack);

        /*Sorting the element using DNSO*/
        Collections.sort(stack);

        /*Printing the element*/
        System.out.println();
        System.out.print(stack);

        /*Defining Comparator for CSO*/
        class Mycompartor implements Comparator{
            public int compare(Object o1,Object o2){

                String s1=(String)o1;
                String s2=(String)o2;

                return -s1.compareTo(s2);
            }
        }

        /*Sorting element using Comparator*/
        stack.sort(new Mycompartor());

        /*Printing Element*/

        System.out.println();
        System.out.print(stack);



    }
}
