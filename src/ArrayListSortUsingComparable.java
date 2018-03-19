import java.util.ArrayList;
import java.util.Collections;

class StudentInfo implements Comparable<StudentInfo>{

    private String studentname;
    private int rollno;
    private int studentage;

    public StudentInfo(String studentname, int rollno, int studentage) {
        this.studentname = studentname;
        this.rollno = rollno;
        this.studentage = studentage;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getStudentage() {
        return studentage;
    }

    public void setStudentage(int studentage) {
        this.studentage = studentage;
    }

    public int compareTo(StudentInfo stuname) {

        int roll = ((StudentInfo)stuname).getRollno();

        //ascending order
        return this.rollno - roll;

        //descending order
        //return roll - this.rollno;

    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "studentname='" + studentname + '\'' +
                ", rollno=" + rollno +
                ", studentage=" + studentage +
                '}';
    }
}


public class ArrayListSortUsingComparable {
    public static void main(String[] args){

        ArrayList<StudentInfo> arraylist = new ArrayList<StudentInfo>();
        arraylist.add(new StudentInfo("mustafiz",2,36));
        arraylist.add(new StudentInfo("masud",43,20));
        arraylist.add(new StudentInfo("reza",45,30));
        arraylist.add(new StudentInfo("mahmud",22,22));

        Collections.sort(arraylist);

        for(StudentInfo str: arraylist){
            System.out.println(str);
        }

    }
}

