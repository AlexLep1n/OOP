import java.util.ArrayList;
import java.util.List;

public abstract class MyList<T> {
    List<T> myList = new ArrayList<>();

    public MyList(List<T> myList) {
        this.myList = myList;
    }

    public int getSize() {
        return myList.size();
    };

    public T get(int index) {
        return myList.get(index);
    }

    @Override
    public String toString() {
        return myList + "";
    }

}
