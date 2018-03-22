package Set;

import java.util.HashSet;

public class StudentHashSetDemo {
    public static void main(String args[]){

        HashSet<StudentHashSet> studentHashSets=new HashSet<StudentHashSet>();
        studentHashSets.add(new StudentHashSet("mustafiz",14,26));
        studentHashSets.add(new StudentHashSet("mahmud",8,29));
        studentHashSets.add(new StudentHashSet("masud",7,25));
        studentHashSets.add(new StudentHashSet("reza",4,21));

        System.out.print(studentHashSets);
    }
}
class StudentHashSet{
    private String name;
    private int roll;
    private int age;

    public StudentHashSet(String name, int roll, int age) {
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
        return "StudentHashSet{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", age=" + age +
                '}';
    }
}

