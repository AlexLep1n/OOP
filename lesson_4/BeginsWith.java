public class BeginsWith<T> implements IsGood<T> {
    private String str;

    public BeginsWith(String str) {
        this.str = str;
    }

    @Override
    public boolean isGood(T item) {
        if (item instanceof String) {
            if (str.charAt(0) != ((String) item).charAt(0)) {
                System.out.println("Строки начинаются с разных букв!");
                return false;
            }
        }
        System.out.println("Строки начинаются с одинаковой буквы!");
        return true;
    }

}
