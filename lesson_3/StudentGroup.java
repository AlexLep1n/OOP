import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    private List<Student> students;

    public StudentGroup(List<Student> students) {
        this.students = students;
    }

    public int size() {
        return students.size();
    }

    public Student get(int index) {
        return students.get(index);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    public GroupListIterator listIterator() {
        return new GroupListIterator(this);
    }

    public ReverseIterator descendingIterator() {
        return new ReverseIterator(this);
    }
}
