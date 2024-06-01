import java.util.Collections;
import java.util.List;

public class StreamService {
    public void sortStreamService(List<Stream> streams){
        Collections.sort(streams, new StreamComparator());
    }
}
