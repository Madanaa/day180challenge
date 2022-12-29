package collectionsFramework;

public class ObjectArray {
    public static void main(String[] args) {
        Student1[] students = new Student1[]{new Student1("Madan"),new Student1("Rohan")};
        //System.out.println(students);
        for (Student1 i : students) {
            System.out.println(i);
        }
    }
}
class Student1 {
    public String name;

    Student1(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
