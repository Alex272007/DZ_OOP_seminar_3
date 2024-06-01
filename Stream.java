
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {
    
    private List<StudentGroup> studentGroups;

    public Stream(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
    } 

    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }
    
    public void AddStudentGroup(StudentGroup studentGroup){
        studentGroups.add(studentGroup);
    }

    @Override
    public Iterator<StudentGroup> iterator(){
        return new IteratorStream(this);
    }
} 

    
