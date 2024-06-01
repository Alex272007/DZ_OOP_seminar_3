import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGroupService {
    StudentGroup studentGroup;

    public StudentGroupService(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public List<Student> getStudentGroup(){
        List<Student> studentsList = new ArrayList<>(studentGroup.getStudentList());
        Collections.sort(studentsList);
        return studentsList;
    }

    public List<Student> getSortedByFIO(){
        List<Student> studentsList = new ArrayList<>(studentGroup.getStudentList());
        studentsList.sort(new StudentCorparator());
        return studentsList;
    }
}
