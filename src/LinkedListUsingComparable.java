import java.util.Collections;
import java.util.LinkedList;

public class LinkedListUsingComparable {
    public static void main(String[] args){
        LinkedList<ExStudent> list=new LinkedList<>();
        list.add(new ExStudent("mustafiz",58,14));
        list.add(new ExStudent("mahmud",45,23));
        list.add(new ExStudent("Reza",74,25));
        list.add(new ExStudent("shamim",48,67));

        Collections.sort(list);
        System.out.print(list);

    }
}


class ExStudent implements Comparable<ExStudent>{

    private String name;
    private int roll;
    private int age;

    public ExStudent(String name, int roll, int age) {
        this.name = name;
        this.roll = roll;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ExStudent{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(ExStudent o) {
        Integer I1=(Integer)o.getRoll();
        return -(this.roll-I1);
    }
}