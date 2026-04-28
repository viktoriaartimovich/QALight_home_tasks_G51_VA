package java_hw_4.task1;

public class Main {
    public static void main(String[] args) {

        Student studentVika = new Student("Vika", "Artimovich", 35);
        Student studentIhor = new Student("Ihor", "Kravetc", 33);
        Student studentLaura = new Student("Laura","Abdulaeva", 33);
        Student studentEugen = new Student("Eugen","Zhyman", 36);
        Student studentOlga = new Student("Olga", "Kuleshova", 34);

        Student[] arrayOfStudents = {studentVika,studentIhor,studentLaura,studentEugen,studentOlga};

        for (int i = 0; i < arrayOfStudents.length; i++) {
            System.out.println(arrayOfStudents[i].getFullName());
        }
    }
}

