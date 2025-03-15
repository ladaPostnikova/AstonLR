import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();

        Map<String, Integer> grades1 = new HashMap<>();
        grades1.put("Информатика", 4);
        grades1.put("Физика", 3);
        grades1.put("Экономика", 3);


        Map<String, Integer> grades2 = new HashMap<>();
        grades2.put("Информатика", 5);
        grades2.put("Физика", 5);
        grades2.put("Экономика", 3);

        Map<String, Integer> grades3 = new HashMap<>();
        grades3.put("Информатика", 2);
        grades3.put("Физика", 2);
        grades3.put("Экономика", 3);

        Map<String, Integer> grades4 = new HashMap<>();
        grades4.put("Информатика", 4);
        grades4.put("Физика", 4);
        grades4.put("Экономика", 4);

        students.add(new Student("Петр Иванов", "119/1", 1, grades1));
        students.add(new Student("Сергей Константинов", "219/1", 1, grades2));
        students.add(new Student("Роман Федоров", "119/1", 1, grades3));
        students.add(new Student("Владимир Молодов", "219/1", 1, grades4));

        System.out.println("Студенты:");
        printStudents(students, 1);

        removeStudents(students);
        promoteStudents(students);

        System.out.println("\nПрошедшие студенты:");
        printStudents(students, 2);
    }

    public static void removeStudents(Set<Student> students) {
        students.removeIf(student -> student.getAverageGrade() < 3.0);
    }

    public static void promoteStudents(Set<Student> students) {
        for (Student student : students) {
            if (student.getAverageGrade() >= 3.0) {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    public static void printStudents(Set<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName() + ", " + student.getGroup());
            }
        }
    }
}
