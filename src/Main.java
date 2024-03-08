import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>(List.of(new Student("Aurora", 24),
                new Student("Martina", 29),
                new Student("Gabriele", 21),
                new Student("Alberto", 27),
                new Student("Davide", 26),
                new Student("Elisabetta", 29),
                new Student("Diego", 27),
                new Student("Francesco", 23),
                new Student("Nancy", 29),
                new Student("Andrea", 30),
                new Student("Mimmo", 31),
                new Student("Nicholas", 17)));
        System.out.println(studentList);

        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student n1, Student n2) {
                return n1.getName().compareTo(n2.getName());
            }
        });

        System.out.println(studentList);
    }
}