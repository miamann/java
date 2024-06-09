package lab3;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private double grade;
    private List<String> courses;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public List<String> getCourses() {
        return new ArrayList<>(courses);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            throw new IllegalArgumentException("оценка должна быть от 0 до 100");
        }
    }

    public void addCourse(String course) {
        if (!courses.contains(course)) {
            courses.add(course);
            System.out.println("курс добавлен: " + course);
        } else {
            System.out.println("курс уже существует: " + course);
        }
    }

    public void removeCourse(String course) {
        if (courses.contains(course)) {
            courses.remove(course);
            System.out.println("курс удален: " + course);
        } else {
            System.out.println("курс не найден: " + course);
        }
    }

    public static void main(String[] args) {
        Student student = new Student("джон доу", 85.5);

        System.out.println("имя: " + student.getName());
        System.out.println("оценка: " + student.getGrade());
        System.out.println("курсы: " + student.getCourses());

        student.addCourse("математика");
        student.addCourse("физика");
        student.addCourse("химия");

        System.out.println("курсы после добавления: " + student.getCourses());

        student.removeCourse("физика");

        System.out.println("курсы после удаления: " + student.getCourses());
    }
}


