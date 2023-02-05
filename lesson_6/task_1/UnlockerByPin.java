public class UnlockerByPin implements Unlocker<String> {

    @Override
    public String howToUnlocked() {
        return "Режим с паролем.\n";
    }

}
