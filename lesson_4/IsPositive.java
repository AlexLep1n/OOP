public class IsPositive<T> implements IsGood<T> {

    @Override
    public boolean isGood(T item) {
        if (item instanceof Integer && (int) item != 0) {
            if ((int) item < 0) {
                System.out.println("Это отрицательное число!");
                return false;
            }
            System.out.println("Это положительное число!");
            return true;
        }
        System.out.println("Это ноль!");
        return false;
    }

}
