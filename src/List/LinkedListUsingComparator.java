import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class LinkedListUsingComparator {
    public static void main(String[] args){
        LinkedList<Student1> ld =new LinkedList<Student1>();
        ld.add(new Student1("Mustafiz",5,36));
        ld.add(new Student1("masud",1,21));
        ld.add(new Student1("reza",3,19));
        ld.add(new Student1("mahmud",10,96));

        Collections.sort(ld,Student1.student1Comparator);
        System.out.println("\n"+ld);

    }
}

class Student1 {
    private String name;
    private int roll;
    private int age;

    public Student1(String name, int roll, int age) {
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
        return "Student1{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", age=" + age +
                '}';
    }

    public static Comparator<Student1> student1Comparator = new Comparator<Student1>() {
        @Override
        public int compare(Student1 o1, Student1 o2) {
            Integer I1 = (Integer) o1.getRoll();
            Integer I2 = (Integer) o2.getRoll();

            return I1.compareTo(I2);
        }
    };

}