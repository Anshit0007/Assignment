import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder inputText = new StringBuilder();
        String line;

        System.out.println("Enter text and type XDONE to finish:");
        while (!(line = sc.nextLine()).equals("XDONE")) {
            inputText.append(line);
        }

        System.out.println("Entered Text:" + inputText);
    }
}
