package Beyond_Java_8_Features_2.Question5;



sealed class Person permits Student, Staff, Guest {
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
    public Student(String name) {
        super(name);
    }
}

sealed class Staff extends Person permits Teacher {
    public Staff(String name) {
        super(name);
    }
}

final class Teacher extends Staff {
    public Teacher(String name) {
        super(name);
    }
}

non-sealed class Guest extends Person {
    public Guest(String name) {
        super(name);
    }
}

class TemporaryGuest extends Guest {
    public TemporaryGuest(String name) {
        super(name);
    }
}


public class Question5 {
    public static void main(String[] args) {
        Student student = new Student("Anshit");
        Teacher teacher = new Teacher("Sir");
        Guest guest = new Guest("Visitor");
        TemporaryGuest tempGuest = new TemporaryGuest("One-Day Visitor");

        System.out.println("Student: " + student.getName());
        System.out.println("Teacher: " + teacher.getName());
        System.out.println("Guest: " + guest.getName());
        System.out.println("Temporary Guest: " + tempGuest.getName());
    }
}
