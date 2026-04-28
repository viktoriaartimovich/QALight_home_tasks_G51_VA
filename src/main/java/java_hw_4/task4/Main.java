package java_hw_4.task4;

public class Main {
    public static void main(String[] args) {

        Team teamOfStudents = new Team();

        Student student1 = new Student(1234,"Kate","Grinberga");
        Student student2 = new Student(5678,"Ann","Smith");
        Student student3 = new Student(9123,"Tim","Jonson");
        Student student4 = new Student(4567,"Lean","Squad");
        Student student5 = new Student(8910,"Sara","Corner");

        Student[] arrayOfStudents ={student1,student2,student3, student4, student5};

        for (int i = 0; i < arrayOfStudents.length; i++) {
            teamOfStudents.addStudentToTheTeam(arrayOfStudents[i]);
        }
        System.out.println("Students from the team: ");
        teamOfStudents.showStudents();

    }
}
