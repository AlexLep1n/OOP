import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

// 1.Создайте интерфейс IsGood<T>. Внутри него содержится единственная функция:
// boolean isGood (T item);
// Создайте следующие детские классы:
// IsEven — ему дают целое число, он одобряет его, если оно чётное
// IsPositive — ему дают целое число, он одобряет его, если оно положительное
// BeginsWithA — ему дают строку, он одобряет её, если она начинается с буквы A
// BeginsWith — в конструкторе запоминает строку. Ему дают строку, он проверяет, 
// что она начинается с того, что он  запомнил

// 2. Создайте обобщённую функцию filter. Ей дают любую коллекцию любого типа, и одобрятель IsGood. Функция возвращает новую коллекцию, куда входят только одобренные элементы из коллекции.

public class Main {
    public static void main(String[] args) {
        // Первая задача
        System.out.println("Первая задача:\n");
        IsEven<Integer> isEvenNum = new IsEven<>();
        System.out.println("IsEven:");
        System.out.println(isEvenNum.isGood(5));
        System.out.println(isEvenNum.isGood(2));

        System.out.println("\n--------\n");

        IsPositive<Integer> isPosNum = new IsPositive<>();
        System.out.println("IsPositive:");
        System.out.println(isPosNum.isGood(10));
        System.out.println(isPosNum.isGood(-5));
        System.out.println(isPosNum.isGood(0));

        System.out.println("\n--------\n");

        BeginsWithA<String> beginsWithA = new BeginsWithA<>();
        System.out.println("BeginsWithA:");
        System.out.println(beginsWithA.isGood("Акробат"));
        System.out.println(beginsWithA.isGood("Воробей"));
        System.out.println(beginsWithA.isGood("апельсин")); // false, так как а прописная

        System.out.println("\n--------\n");

        BeginsWith<String> beginsWith = new BeginsWith<>("Гироскутер едет быстро.");
        System.out.println("BeginsWith:");
        System.out.println(beginsWith.isGood("Гравитация"));
        System.out.println(beginsWith.isGood("гусар")); // false, так как первая буква прописная
        System.out.println(beginsWith.isGood("Автостоп"));

        System.out.println("\n--------\n");

        // Вторая задача
        System.out.println("Вторая задача:\n");
        List<Integer> lIntegers = new LinkedList<>();
        lIntegers.add(5);
        lIntegers.add(2);
        lIntegers.add(3);
        lIntegers.add(4);
        lIntegers.add(0);

        System.out
                .println("Возращаемая коллекция после фильтрации по четности числа:\n" + filter(lIntegers, isEvenNum));
        System.out.println("\n--------\n");

        List<Integer> lIntegers2 = new LinkedList<>();
        lIntegers2.add(10);
        lIntegers2.add(-5);
        lIntegers2.add(0);
        lIntegers2.add(7);
        lIntegers2.add(-3);

        System.out.println(
                "Возращаемая коллекция после фильтрации по положительному числу:\n" + filter(lIntegers2, isPosNum));
        System.out.println("\n--------\n");

        List<String> lStrings = new LinkedList<>();
        lStrings.add("Акробат");
        lStrings.add("Воробей");
        lStrings.add("апельсин");
        lStrings.add("Абрикос");
        lStrings.add("Валик");
        lStrings.add("Ананас");

        System.out.println("Возращаемая коллекция после фильтрации строки, начинающейся на букву А:\n"
                + filter(lStrings, beginsWithA));
        System.out.println("\n--------\n");

        List<String> lStrings2 = new LinkedList<>();
        lStrings2.add("Гусар");
        lStrings2.add("Галилео");
        lStrings2.add("апельсин");
        lStrings2.add("Абрикос");
        lStrings2.add("Валик");
        lStrings2.add("Глонас");
        lStrings2.add("Кураж");

        BeginsWith<String> beginsWithG = new BeginsWith<>("Гироскутер едет быстро.");
        System.out.println(
                "Возращаемая коллекция после фильтрации строки, начинающейся на букву слова, переданного в конструктор:\n"
                        + filter(lStrings2, beginsWithG));
        System.out.println("\n");

    }

    private static <T> Collection<T> filter(Collection<T> collection, IsGood<T> approver) {
        Collection<T> it = new LinkedList<>();
        for (T item : collection) {
            if (approver.isGood(item)) {
                it.add(item);
            }
        }
        return it;
    }
}
