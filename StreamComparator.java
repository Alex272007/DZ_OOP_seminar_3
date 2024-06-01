import java.util.Comparator;

public class StreamComparator implements Comparator<Stream>{

    @Override
    public int compare(Stream o1, Stream o2) {
        if (o1.getStudentGroups().size() == o2.getStudentGroups().size()){
            return 0;
        }
        if (o1.getStudentGroups().size() > o2.getStudentGroups().size()) {
            return 1;
        }
        return -1;
    }

}

   
    

    

    

   
    

  