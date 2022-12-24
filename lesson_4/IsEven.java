public class IsEven<T> implements IsGood<T> {

    @Override
    public boolean isGood(T item) {
        if (item instanceof Integer) {
            if ((int) item % 2 != 0) {
                System.out.println("Нечетное число!");
                return false;
            }
        }
        System.out.println("Четное число!");
        return true;
    }

}
