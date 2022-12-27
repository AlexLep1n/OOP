public class BeginsWith<T> implements IsGood<T> {
    private String str;

    public BeginsWith(String str) {
        this.str = str;
    }

    @Override
    public boolean isGood(T item) {
        if (item instanceof String) {
            if (str.charAt(0) != ((String) item).charAt(0)) {
                return false;
            }
        }
        return true;
    }

}
