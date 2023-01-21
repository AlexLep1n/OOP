import java.util.List;

public class MutableList<T> extends MyList<T> {

    public MutableList(List<T> myList) {
        super(myList);
    }

    public T set(int i, T newValue) {
        myList.set(i, newValue);
        return myList.get(i);
    }

    public void add(T newValue) {
        myList.add(newValue);
    }

    public void remove(T value) {
        myList.remove(value);
    }
}
