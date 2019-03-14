public class LegacyCodeClass {

    public void longMethodWithMuchLogic() {
        int counter = 0;
        for (int i = 0; i < 100; i++) {
            counter++;
        }
        new WindowOpener().openWindow(counter);
    }
}
