import java.util.Comparator;

public class StreamComparator implements Comporator<Stream>{

    @Override
    public int compare(Stream o1, Stream o2) {
        if (o1.studentGroups().size() == o2.studentGroups().size()){
            return 0;
        }
        if (o1.studentGroups().size() > o2.studentGroups().size()) {
            return 1;
        }
        return -1;
    }

}

   
    

    

    

   
    

  