import java.util.Iterator;

public class StudentGroupIterator implements Iterator<Student> {
    private int index = -1;
    private StudentGroup students;

    public StudentGroupIterator(StudentGroup students) {
        this.students = students;
    }

    @Override
    public boolean hasNext() {
        return index < students.size() - 1;
    }

    @Override
    public Student next() {
        index++;
        return students.get(index);
    }

}
