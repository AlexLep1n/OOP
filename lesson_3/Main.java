import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

// 1. Класс Группа содержит в себе коллекцию Студентов. По группе можно перемещаться с помощью итератора. (Это повторяет 1-ю задачу из классной работы). Остальные задачи надстраиваются поверх неё.

// 2. Создайте класс GroupListIterator, который позволяет перемещаться по группе в обоих направлениях. Он реализует интерфейс ListIterator<Student>.
// Добавьте в Группу метод listIterator (), который позволяет начать итерацию с помощью GroupListIterator.

// 3. Создайте класс ReverseIterator, который работает как итератор по группе в обратном направлении:
// a. Он отслеживает текущую позицию в переборе
// b. Он изначально выставлен на конечную позицию
// c. Он движется справа налево
// Проверьте, как он работает.

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", LocalDate.of(2000, 10, 15), 4.8);
        Student student2 = new Student("Anton", LocalDate.of(2001, 5, 25), 4.2);
        Student student3 = new Student("Maksim", LocalDate.of(2002, 3, 7), 3.7);
        Student student4 = new Student("Petr", LocalDate.of(1999, 8, 2), 4.5);

        List<Student> students = new LinkedList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        StudentGroup studentGroup = new StudentGroup(students);

        GroupListIterator listIterator = studentGroup.listIterator();
        System.out.println("По направлению вперед (GroupListIterator):\n");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("----------\n");

        System.out.println("В обратном направлении (GroupListIterator):\n");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        System.out.println("----------\n");

        System.out.println("В обратном направлении (ReverseIterator):\n");
        ReverseIterator reverseIterator = studentGroup.descendingIterator();
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}
