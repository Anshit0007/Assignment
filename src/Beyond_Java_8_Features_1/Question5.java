package Beyond_Java_8_Features_1;

public class Question5 {
    public static void main(String[] args) {
        String text = "  Hello Java  ";
        String blankText = "   ";

        String repeated = "Hi ".repeat(3);
        System.out.println("repeat(): " + repeated);

        String stripped = text.strip();
        System.out.println("strip(): " + stripped);

        String trimmed = text.trim();
        System.out.println("trim(): " + trimmed);

        boolean isBlank = blankText.isBlank();
        System.out.println("isBlank(): " + isBlank);

        String indented = "Hello\nJava".indent(4);
        System.out.println("indent():");
        System.out.println(indented);

        String transformed = "java".transform(s -> s.toUpperCase());
        System.out.println("transform(): " + transformed);

        String multiline = """
                |  Line 1
                |  Line 2
                |  Line 3
                """;
        String strippedIndent = multiline.stripIndent();
        System.out.println("stripIndent():");
        System.out.println(strippedIndent);

        String escaped = "Hello\\nJava\\tWorld".translateEscapes();
        System.out.println("translateEscapes():");
        System.out.println(escaped);

        String tripleQuotes = """
                This is a text block
                using triple quotes
                in Java.
                """;
        System.out.println("tripleQuotes:");
        System.out.println(tripleQuotes);

        String formatted = "My name is %s and I am %d years old.".formatted("Ankit", 25);
        System.out.println("formatted(): " + formatted);
    }
}
