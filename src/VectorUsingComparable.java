import java.util.Vector;

public class VectorUsingComparable {
    public static void main(String args[]){

        Vector<StudentComparable> vectorUsingComparables=new Vector<>();

        vectorUsingComparables.addElement(new StudentComparable("mustafiz",12,22));
        vectorUsingComparables.addElement(new StudentComparable("mahmud",2,20));
        vectorUsingComparables.addElement(new StudentComparable("masud",1,23));
        vectorUsingComparables.addElement(new StudentComparable("reza",4,24));
        vectorUsingComparables.addElement(new StudentComparable("shamim",5,31));


        vectorUsingComparables.sort(StudentComparable::compareTo);
        System.out.print(vectorUsingComparables);

    }
}


class StudentComparable implements Comparable<StudentComparable>{

    private String name;
    private int roll;
    private int age;

    public StudentComparable(String name, int roll, int age) {
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
        return "StudentComparable{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", age=" + age +
                '}'+"\n";
    }

    @Override
    public int compareTo(StudentComparable o1){
        Integer I=(Integer)o1.getRoll();

        return this.roll-I;
    }
}