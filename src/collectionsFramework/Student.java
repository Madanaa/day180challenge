package collectionsFramework;

public class Student {
    int rollNo;
    String firstName;
    String lastName;
    String address;
          public Student(int rollNo,String firstName,String lastName,String address){
              this.rollNo = rollNo;
              this.firstName = firstName;
              this.lastName = lastName;
              this.address = address;

          }
    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", firstName='"
                + firstName + '\''
                + ", lastName='"
                + lastName + '\''
                + ", address='"
                + address + '\'' + '}';
    }
}
