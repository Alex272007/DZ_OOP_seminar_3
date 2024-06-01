import java.util.Iterator;
import java.util.List;

public class IteratorStream implements Iterator<StudentGroup>{
    private List<StudentGroup> list;
    private int index = 0;

    public IteratorStream(Stream stream){
        this.list = list.getList();
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public StudentGroup next() {
        if(hasNext())
        return list.get(index++);
        return null;
    } 
}
