public class Student extends User{

    String studentId;
    public Student(String firstName, String lastName, String studentId)
    {
        super(firstName, lastName);
        this.studentId = studentId;
    }

    public String getId()
    {
        return studentId;
    }
}
