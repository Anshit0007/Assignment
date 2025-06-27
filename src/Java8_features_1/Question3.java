package Java8_features_1;

interface InterfaceA {
    default void show() {
        System.out.println("InterfaceA show method");
    }
}


interface InterfaceB {
    default void show() {
        System.out.println("InterfaceB show method");
    }
}


public class Question3 implements InterfaceA, InterfaceB{
    public void show() {
        InterfaceA.super.show();
        InterfaceB.super.show();
        System.out.println("MultipleInheritanceExample show method");
    }


    public static void main(String[] args) {
        Question3 obj = new Question3();
        obj.show();
    }
}
