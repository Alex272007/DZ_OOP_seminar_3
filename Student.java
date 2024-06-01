public class Student {
    private int studentID;
    private String firstName;
    private String secondName;
    private String lastName;
    
    public Student(int studentID, String firstName, String secondName, String lastName) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Student {studentID= " + studentID + ", firstName= " + firstName + ", secondName= " + secondName
                + ", lastName= " + lastName + "}";
    }

    @Override
    public int compareTo(Student o) {
        //if(studentId > o.getStudentId())
            //return 1;
        //if(studentId < o.getStudentId())
            //return -1;
        return Integer.compare(studentID, o.studentID);
    }
}
