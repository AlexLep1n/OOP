public class UnlockerByFingerprint implements Unlocker<String> {

    @Override
    public String howToUnlocked() {
        return "Разблокировка отпечатком пальца.\n";
    }

}