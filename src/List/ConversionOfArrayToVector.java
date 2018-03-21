import java.util.*;

public class ConversionOfArrayToVector {
    public static void main(String[] args){
        int A[]={25,14,23,65,85,42,15,32,65,87,24};
        Vector<Integer> v=new Vector<Integer>();

        for (int i:A){
            Integer I=(Integer)i;
            v.addElement(I);
        }

        Collections.sort(v);
        System.out.println("Ascending order By Default Sorting: "+v);

        class MyComparator implements Comparator{
            public int compare(Object obj1,Object obj2){
                Integer I1=(Integer)obj1;
                Integer I2=(Integer)obj2;
                return I2.compareTo(I1);

            }
        }

        Collections.sort(v,new MyComparator());
        System.out.println("Descending order By Customised: "+v);

        String s[]={"BD","US","UAE","IND","AUS","KSA"};
        Vector<String> v1=new Vector<String>(Arrays.asList(s));

        Collections.sort(v1);
        System.out.println();
        System.out.print("Ascending order By Default Sorting: "+v1);

        class MyComparator2 implements Comparator{
            public int compare(Object obj1,Object obj2){
                String I1=(String)obj1;
                String I2=(String)obj2;
                return I2.compareTo(I1);

            }
        }

        Collections.sort(v1,new MyComparator2());
        System.out.println();
        System.out.print("Descending order By Customised: "+v1);


        System.out.println();
        System.out.print("Using Iterator: ");
        Iterator e=v.iterator();
        while(e.hasNext()){
            Integer I=(Integer)e.next();

            if (I%2==0){
                System.out.print(I+" ");
            }
        }

        System.out.println();
        System.out.print("Using Enumeration: ");
        Enumeration enumeration=v.elements();
        while(enumeration.hasMoreElements()){
            Integer I=(Integer)enumeration.nextElement();

            if (I%2!=0){
                System.out.print(I+" ");
            }
        }

        System.out.println();
        System.out.print("Using ListIterator: ");
        ListIterator listIterator=v.listIterator();
        while(listIterator.hasNext()){
            Integer I=(Integer)listIterator.next();

            if (I%2!=0){
                System.out.print(I+" ");
            }
        }


    }
}
