package Set;

import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSetExample2 {
    public static void main(String[] args){

        LinkedHashSet<StudentLinkedHashSet> studentLinkedHashSets=new LinkedHashSet<StudentLinkedHashSet>();
        studentLinkedHashSets.add(new StudentLinkedHashSet("mustafiz",10,22));
        studentLinkedHashSets.add(new StudentLinkedHashSet("mahmud",12,23));
        studentLinkedHashSets.add(new StudentLinkedHashSet("masud",13,24));
        studentLinkedHashSets.add(new StudentLinkedHashSet("shamim",8,19));

        System.out.print(studentLinkedHashSets);


    }
}

class StudentLinkedHashSet{
    private String name;
    private int roll;
    private int age;

    StudentLinkedHashSet(String name,int roll,int age){
        this.name=name;
        this.roll=roll;
        this.age=age;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name=name;
    }

    public int getRoll(){
        return roll;
    }
    public void setRoll(){
        this.roll=roll;
    }

    public int getAge() {
        return age;
    }
    public void setAge(){
        this.age=age;
    }

    @Override
    public String toString() {
        return "StudentLinkedHashSet{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", age=" + age +
                '}';
    }
}