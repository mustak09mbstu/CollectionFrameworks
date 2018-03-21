import java.util.Arrays;
import java.util.Comparator;

public class SearchingOfArrayUsingMethod {
    public static void main(String args[]){

        /*Defining Object Type Array*/
        String s[]={"A","Z","K","L","D","B","C"};

        /*Sorting of Array(D.N.S.O)*/
        Arrays.sort(s);

        /*Printing Array Element After sorting*/
        System.out.println("Array Element After Natural Sorting: ");
        for (String i:s){
            System.out.print(i+" ");
        }

        /*Searching Array element*/
        System.out.println();
        System.out.println("Searching Array Element: ");
        System.out.println(Arrays.binarySearch(s,"B"));


        /*For Customized Sorting Defining MyComparator Class implementing Comparator interface*/
        class MyComparator implements Comparator {
            public int compare(Object obj1,Object obj2){
                String s1=(String)obj1;
                String s2=(String)obj2;
                return s2.compareTo(s1);
            }
        }

        /*Sorting of Array Element Using(C.S.O)*/
        Arrays.sort(s,new MyComparator());

        /*Sorting of Array Element After(C.S.O)*/
        System.out.println("Array Element After Customised Sorting: ");
        for (String i:s){
            System.out.print(i+" ");
        }

        /*Searching Array Element*/
        System.out.println();
        System.out.print(Arrays.binarySearch(s,"B",new MyComparator()));

    }
}
