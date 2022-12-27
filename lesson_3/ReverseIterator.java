import java.util.Iterator;

public class ReverseIterator implements Iterator<Student> {
    private int index;
    private StudentGroup students;

    public ReverseIterator(StudentGroup students) {
        this.students = students;
        this.index = students.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    @Override
    public Student next() {
        return students.get(index--);
    }

}
