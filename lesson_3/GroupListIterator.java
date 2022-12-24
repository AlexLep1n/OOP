import java.util.ListIterator;

public class GroupListIterator implements ListIterator<Student> {
    private int indexNext;
    private int indexPrev;
    private StudentGroup students;

    public GroupListIterator(StudentGroup students) {
        this.students = students;
        this.indexNext = -1;
        this.indexPrev = students.size() - 1;

    }

    @Override
    public boolean hasNext() {
        return indexNext < students.size() - 1;
    }

    @Override
    public Student next() {
        return students.get(nextIndex());
    }

    @Override
    public boolean hasPrevious() {
        return indexPrev >= 0;
    }

    @Override
    public Student previous() {
        return students.get(previousIndex());
    }

    @Override
    public int nextIndex() {
        return ++indexNext;
    }

    @Override
    public int previousIndex() {
        return indexPrev--;
    }

    @Override
    public void remove() {
    }

    @Override
    public void set(Student e) {
    }

    @Override
    public void add(Student e) {
    }

}
