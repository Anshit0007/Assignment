public class Question7 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];

            arr[10] = 100;
            int result = 10 / 0;


           // arr[10] = 100;


        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {

            System.out.println("An error occurred: " + e.getClass().getSimpleName());
            System.out.println("Error message: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block. It always runs.");
        }

        System.out.println("Program continues after try-catch-finally block.");
    }
}
