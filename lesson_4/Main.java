// 1.Создайте интерфейс IsGood<T>. Внутри него содержится единственная функция:
// boolean isGood (T item);
// Создайте следующие детские классы:
// IsEven — ему дают целое число, он одобряет его, если оно чётное
// IsPositive — ему дают целое число, он одобряет его, если оно положительное
// BeginsWithA — ему дают строку, он одобряет её, если она начинается с буквы A
// BeginsWith — в конструкторе запоминает строку. Ему дают строку, он проверяет, 
// что она начинается с того, что он  запомнил

public class Main {
    public static void main(String[] args) {
        IsEven<Integer> isEvenNum = new IsEven<>();
        System.out.println(isEvenNum.isGood(5));
        System.out.println(isEvenNum.isGood(2));

        System.out.println("\n--------\n");

        IsPositive<Integer> isPosNum = new IsPositive<>();
        System.out.println(isPosNum.isGood(10));
        System.out.println(isPosNum.isGood(-5));
        System.out.println(isPosNum.isGood(0));

        System.out.println("\n--------\n");

        BeginsWithA<String> beginsWithA = new BeginsWithA<>();
        System.out.println(beginsWithA.isGood("Акробат"));
        System.out.println(beginsWithA.isGood("Воробей"));
        System.out.println(beginsWithA.isGood("апельсин")); // false, так как а прописная

        System.out.println("\n--------\n");

        BeginsWith<String> beginsWith = new BeginsWith<>("Гироскутер едет быстро.");
        System.out.println(beginsWith.isGood("Гравитация"));
        System.out.println(beginsWith.isGood("гусар")); // false, так как первая буква прописная
        System.out.println(beginsWith.isGood("Автостоп"));

    }
}
