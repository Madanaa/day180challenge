package day24;

class Student {
    int id;
    String name;
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class StudentTest{
    public static void main(String[] args) {
        Student student = new Student(100,"Madan");
        System.out.println(student.id);
        System.out.println(student.name);
    }

}