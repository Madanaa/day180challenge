package collectionsFramework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortStudentClass {
      public static void main(String[] args) {
            List<Student> list = new ArrayList<Student>();
            list.add(new Student(1,"Madan","Gangwar","Up"));
            list.add(new Student(4,"Anand","Gangwar","Up"));
            list.add(new Student(3,"Karan","Gangwar","Up"));
            list.add(new Student(1,"Arjun","Gangwar","Up"));
            list.sort(new Comparator <Student> () {
                  public int compare(Student a, Student b) {
                        return a.rollNo - b.rollNo;
                  }
            });
            System.out.println(list);
            System.out.println("*****************************");
            list.sort(new Comparator<Student>(){
                  public int compare(Student a, Student b) {
                        int res = b.rollNo - a.rollNo;
                        if (res == 0) {
                              b.lastName.compareTo(a.lastName);
                        }
                        return res;
                  }
            });
            System.out.println(list);
      }

}
