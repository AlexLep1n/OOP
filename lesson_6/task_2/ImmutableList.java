import java.util.List;

public class ImmutableList<T> extends MyList<T> {

    public ImmutableList(List<T> myList) {
        super(myList);
    }

}
