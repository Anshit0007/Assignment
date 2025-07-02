package Beyond_Java_8_Features_2;

import java.util.Objects;

 record Studentt(int id, String name, String standard) {
    public Studentt {
        if (name == null || standard == null) {
            throw new NullPointerException("Name and standard cannot be null");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Studentt other)) return false;
        return id == other.id &&
                name.equals(other.name) &&
                standard.equals(other.standard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, standard);
    }
}

public class Question3 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Anshit", "10th");
        Student s2 = new Student(1, "Anshit", "10th");

        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode() == s2.hashCode());
    }

 }
