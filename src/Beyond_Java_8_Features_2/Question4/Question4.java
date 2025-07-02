package Beyond_Java_8_Features_2.Question4;
sealed class Person permits Student, Teacher {
    String name;

    public Person(String name) {
        if (name == null) {
            throw new NullPointerException("Name cannot be null");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

final class Student extends Person {
    int grade;

    public Student(String name, int grade) {
        super(name);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }
}

final class Teacher extends Person {
    String subject;

    public Teacher(String name, String subject) {
        super(name);
        if (subject == null) {
            throw new NullPointerException("Subject cannot be null");
        }
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
}




public class Question4 {
    public static void main(String[] args) {
        Student student = new Student("Anshit", 10);
        Teacher teacher = new Teacher("Sir", "Math");

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Grade: " + student.getGrade());

        System.out.println("Teacher Name: " + teacher.getName());
        System.out.println("Subject: " + teacher.getSubject());
    }
}
