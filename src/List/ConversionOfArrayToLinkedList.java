import java.util.*;

public class ConversionOfArrayToLinkedList {
    public static void main(String[] args){

        LinkedList ls=new LinkedList();
        for (int i=0;i<10;i++){
            ls.add(i);
        }

        System.out.print(ls);
        ls.add(10);
        System.out.println();
        System.out.print(ls);

        ls.add(0,20);

        System.out.println();
        System.out.print(ls);

        Collections.sort(ls);

        System.out.println();
        System.out.print(ls);


        class MyComparator implements Comparator {
            public int compare(Object obj1,Object obj2){
                Integer s1=(Integer) obj1;
                Integer s2=(Integer) obj2;
                return s2.compareTo(s1);
            }
        }
        Collections.sort(ls,new MyComparator());
        System.out.println();
        System.out.print(ls);

   String str[]={"mustafiz","Mahmud","Reza","Masud"};
   LinkedList lst=new LinkedList(Arrays.asList(str));
   System.out.println();
   System.out.print(lst);

   int[] A={586,547,528,145,159,369,489};
   LinkedList<Integer> ld=new LinkedList<Integer>();
   for (int i:A){
       ld.add(i);
   }
        System.out.println();
        System.out.print(ld+" ");



    }
}
