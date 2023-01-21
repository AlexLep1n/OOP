import java.util.ArrayList;
import java.util.List;

/*
Задача 2. Есть два самодельных класса коллекций:

ImmutableList<T> — коллекция, которая никогда ни при каких обстоятельствах не меняется. Методы:
• getSize ()
• get (int i)

MutableList<T> — коллекция, которая допускает изменения. Методы:
• getSize ()
• get (int i)
• set (int i, T newValue)
• add (T newValue)
• remove (T value)

Реализуйте такую схему наследования между двумя этими классами, которая будет соответствовать принципу подстановки Лисков.
*/

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        ImmutableList<Integer> immutableList = new ImmutableList<>(numbers);
        System.out.printf("Исходный список immutableList: %s\n", immutableList);
        System.out.printf("Первый элемент списка immutableList: %d\n", immutableList.get(0));
        System.out.printf("Размер списка immutableList: %d\n", immutableList.getSize());
        System.out.println();

        MutableList<Integer> mList = new MutableList<>(numbers);
        System.out.printf("Исходный список mList: %s\n", mList);
        System.out.printf("Второй элемент списка mList: %d\n", mList.get(1));
        System.out.printf("Размер списка mList: %d\n", mList.getSize());
        mList.set(0, 144);
        System.out.printf("Список mList после set(0, 144): %s\n", mList);
        mList.add(555);
        System.out.printf("Список mList после add(555): %s\n", mList);

    }
}
