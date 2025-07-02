package Beyond_Java_8_Features_2;

 record Student(int id, String name, String standard) {
}


public class Question1 {
    public static void main(String[] args) {
        Student student = new Student(1, "Anshit", "10th");
        System.out.println(student.id());
        System.out.println(student.name());
        System.out.println(student.standard());
    }
}
