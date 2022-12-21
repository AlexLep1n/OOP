import java.util.ListIterator;

public class GroupListIterator implements ListIterator<Student> {
    private int index = -1;
    // private int index = index - 1;
    private StudentGroup students;

    public GroupListIterator(StudentGroup students) {
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

    @Override
    public boolean hasPrevious() {
        return index < students.size() + 1 - index;
    }

    @Override
    public Student previous() {
        index++;
        if (index < 0) {
            index = 0;
            return students.get(students.size() - 1 - index);
        } else {
            return students.get(students.size() - 1 - index);
        }
    }

    @Override
    public int nextIndex() {
        return index++;
    }

    @Override
    public int previousIndex() {
        return index++;
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
