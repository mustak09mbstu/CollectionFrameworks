import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListUsingComparator {
    public static void main(String[] args){

        ArrayList<Student> arraylist = new ArrayList<Student>();
        arraylist.add(new Student("mustafiz",29,20));
        arraylist.add(new Student("masud",41,19));
        arraylist.add(new Student("reza",45,22));
        arraylist.add(new Student("mahmud",22,25));
        arraylist.add(new Student("shamim",48,28));


        Collections.sort(arraylist,Student.StuRollNoComparator);

        for(Student str: arraylist){
            System.out.println(str);
        }
    }

    }


class Student{
    private String studentname;
    private int rollno;
    private int studentage;

    public static Comparator<Student> StuRollNoComparator = new Comparator<Student>() {

        public int compare(Student s1, Student s2) {

            Integer SudentRoll1=(Integer)s1.getRollno();
            Integer StudentRoll2=(Integer)s2.getRollno();

//            String StudentName1 = s1.getStudentname().toUpperCase();
//            String StudentName2 = s2.getStudentname().toUpperCase();

            //ascending order
            return SudentRoll1.compareTo(StudentRoll2);

            //descending order
            //return StudentName2.compareTo(StudentName1);
        }};

    public Student(String studentname, int rollno, int studentage) {
        this.studentname = studentname;
        this.rollno = rollno;
        this.studentage = studentage;
    }

    public String getStudentname() {
        return studentname;
    }

    public int getRollno() {
        return rollno;
    }

    public int getStudentage() {
        return studentage;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setStudentage(int studentage) {
        this.studentage = studentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentname='" + studentname + '\'' +
                ", rollno=" + rollno +
                ", studentage=" + studentage +
                '}';
    }
}






