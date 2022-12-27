public class IsPositive<T> implements IsGood<T> {

    @Override
    public boolean isGood(T item) {
        if (item instanceof Integer && (int) item != 0) {
            if ((int) item < 0) {
                return false;
            }
            return true;
        }
        return false;
    }

}
