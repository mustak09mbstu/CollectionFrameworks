package Set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetEmployee {
    public static void main(String[] args){

        Employee e1=new Employee("mustafiz",100);
        Employee e2=new Employee("mahmud",50);
        Employee e3=new Employee("reza",40);
        Employee e4=new Employee("mizan",101);
        Employee e5=new Employee("Shahneel",102);

        TreeSet t=new TreeSet();
        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        t.add(e5);

        //System.out.print(t);

        TreeSet t1=new TreeSet(new MyComparatorEmployee());
        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        t1.add(e5);

        System.out.println();
        System.out.println(t1);


    }

}

class Employee implements Comparable{

    private String name;
    private int eid;

    public Employee(String name, int eid) {
        this.name = name;
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", eid=" + eid +
                '}';
    }

    public  int compareTo(Object o){

        int eid1=this.eid;
        Employee e=(Employee)o;
        int eid2=e.eid;

        if (eid1<eid2)
        return  -1;
        else if (eid1>eid2)
            return +1;
        else
            return 0;


    }
}




class MyComparatorEmployee implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Employee e1=(Employee)o1;
        Employee e2=(Employee)o2;

        String s1=e1.getName();
        String s2=e2.getName();

        return s1.compareTo(s2);

    }
}