public class Student{
    String firstName;
    String lastName;
    int age;

    public Student(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getStudentName(){
        return this.firstName + " " + this.lastName;
    }

  
}