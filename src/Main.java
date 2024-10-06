public class Main {
    public static void main(String[] args) {
        runGUITest();
    }

    static void documentTest(){
        PDFFactory pdf = new PDFFactory();
        pdf.generateDoc();

        WordFactory word = new WordFactory();
        word.generateDoc();
    }

    static void runGUITest(){
        ThemeFactory lightTheme = new LightThemeFactory();
        Application lightApp = new Application(lightTheme);
        System.out.println("Light theme active");
        lightApp.displayComponents();

        System.out.println("\n\n\n");

        ThemeFactory darkTheme = new DarkThemeFactory();
        Application darkApp = new Application(darkTheme);
        System.out.println("Dark theme active");
        darkApp.displayComponents();
    }
}
