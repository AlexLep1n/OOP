public class BeginsWithA<T> implements IsGood<T> {

    @Override
    public boolean isGood(T item) {
        if (item instanceof String) {
            if (((String) item).charAt(0) != 'А') {
                return false;
            }
        }
        return true;
    }

}
