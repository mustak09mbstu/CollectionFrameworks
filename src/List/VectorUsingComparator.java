import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class VectorUsingComparator {
    public static void main(String[] args){
        Vector<StudentVector> studentVectors=new Vector<StudentVector>();
        studentVectors.addElement(new StudentVector("mustafiz",21,45));
        studentVectors.addElement(new StudentVector("mahmud",20,47));
        studentVectors.addElement(new StudentVector("masud",22,41));
        studentVectors.addElement(new StudentVector("shamim",14,58));

        Collections.sort(studentVectors, StudentVector.studentVectorComparator);
        System.out.print(studentVectors);



    }
}

class StudentVector{
    private String name;
    private int age;
    private int roll;

    public StudentVector(String name, int age, int roll) {
        this.name = name;
        this.age = age;
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "StudentVector{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", roll=" + roll +
                '}';
    }

    public static Comparator<StudentVector> studentVectorComparator=new Comparator<StudentVector>() {
        @Override
        public int compare(StudentVector o1, StudentVector o2) {
            Integer I1=(Integer)o1.getRoll();
            Integer I2=(Integer)o2.getRoll();

            return I1.compareTo(I2);
        }
    };



}
