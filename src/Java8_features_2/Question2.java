package Java8_features_2;

interface MyInterface {
    default void show() {
        System.out.println("default method");
    }

    static void display() {
        System.out.println("static method");
    }
}

class MyClass implements MyInterface {
}

public class Question2 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.show();

        MyInterface.display();
    }
}
