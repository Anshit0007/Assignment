package Java8_features_1;

interface Operation {
    int apply(int a, int b);
}


public class Question2 {
    public int add(int a, int b) {
        return a + b;
    }


    public int subtract(int a, int b) {
        return a - b;
    }


    public static int multiply(int a, int b) {
        return a * b;
    }


    public static void main(String[] args) {
        Question2 obj = new Question2();


        Operation addition = obj::add;
        System.out.println(addition.apply(10, 5));


        Operation subtraction = obj::subtract;
        System.out.println(subtraction.apply(10, 5));


        Operation multiplication = Question2::multiply;
        System.out.println(multiplication.apply(10, 5));
    }
}


