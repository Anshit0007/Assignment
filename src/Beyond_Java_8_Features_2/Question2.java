package Beyond_Java_8_Features_2;

record Students(int id, String name, String standard) {
    public Students {
        if (name == null || standard == null) {
            throw new NullPointerException("Name and standard cannot be null");
        }
    }
}

public class Question2 {
    public static void main(String[] args) {
        Students student = new Students(1, "Anshit", "10th");
        System.out.println(student.id());
        System.out.println(student.name());
        System.out.println(student.standard());


    }
}
