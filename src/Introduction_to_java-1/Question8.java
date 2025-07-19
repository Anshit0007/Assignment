class MissingClass {
    void display() {
        System.out.println("Hello from MissingClass");
    }
}


public class Question8 {
    public static void main(String[] args) {
        try {
            Class.forName("com.unknown.MissingClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Caught: " + e);
        }
        MissingClass obj = new MissingClass(); // Assume MissingClass compiled but deleted later
        obj.display();
    }
}
