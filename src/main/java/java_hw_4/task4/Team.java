package java_hw_4.task4;

import java.util.Arrays;

public class Team {

    Student[] students = new Student[0];
    int count = 0;

    public void addStudentToTheTeam(Student student){
        if(count >= students.length){
            students = Arrays.copyOf(students, students.length +1);
        }
        students[count] = student;
        count ++;
    }

    public void showStudents(){
        for (int i = 0; i < count; i++) {
            System.out.println(students[i].getFullStudentInfo());
        }

    }
}