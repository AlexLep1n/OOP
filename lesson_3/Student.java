import java.time.LocalDate;

public class Student {
    private String name;
    private LocalDate bDay;
    private double grade;

    public Student(String name, LocalDate bDay, double grade) {
        this.name = name;
        this.bDay = bDay;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student name: " + name + ", bDay: " + bDay + ", grade: " + grade + "\n";
    }
}
