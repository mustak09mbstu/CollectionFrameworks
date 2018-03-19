import java.util.Arrays;
import java.util.Comparator;

public class SortingOfArrayUsingMethod {
    public static void main(String[] args){

        /*Initializing Primitive Array*/
        int A[]={12,4,10,7,5,2,9,56};

        /*Printing Array Element Before Sorting*/
        System.out.println("Array Element Before Sorting(Primitive Type): ");
        for (int i:A){
            System.out.print(i+" ");
        }

        /*Printing Array Element After Sorting*/
        Arrays.sort(A);
        System.out.println();
        System.out.println("Array Element After sorting(Primitive Type): ");
        for (int i:A){
            System.out.print(i+" ");
        }


        /*Initializing Object Type Array*/
        String s[]={"A","Z","k","B","x","z"};

        /*Printing Array Element Before sorting*/
        System.out.println();
        System.out.println("Array Element Before sorting(Object Type): ");
        for (String i:s){
            System.out.print(i+" ");
        }

        /*Printing Array Element After Sorting*/

        Arrays.sort(s);
        System.out.println();
        System.out.println("Array Element After sorting(Object Type): ");
        for (String i:s){
            System.out.print(i+" ");
        }


        /*For Customized Sorting Defining MyComparator Class implementing Comparator interface*/
        class MyComparator implements Comparator{
            public int compare(Object obj1,Object obj2){
                String s1=(String)obj1;
                String s2=(String)obj2;
                return s2.compareTo(s1);
            }
        }


        Arrays.sort(s,new MyComparator());

        /*Printing Array Element After Sorting*/
        System.out.println();
        System.out.println("Array Element After sorting(Using Customized Sorting): ");

        for (String i:s){
            System.out.print(i+" ");
        }


    }
}
