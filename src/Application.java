public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(ThemeFactory themeFactory) {
        this.button = themeFactory.createButton();
        this.checkBox = themeFactory.createCheckBox();
    }

    public void displayComponents() {
        button.display();
        checkBox.display();
    }
}
