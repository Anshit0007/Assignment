package Introduction_to_java_2;

class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton instance created.");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton");
    }
}

public class Question5 {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        s1.showMessage();

        Singleton s2 = Singleton.getInstance();
        s2.showMessage();

        System.out.println("Are both instances same? " + (s1 == s2));
    }
}
