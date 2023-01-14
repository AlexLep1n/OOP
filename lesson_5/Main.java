import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

// Напишите программу, позволяющую анализировать посещаемость студентов. Используйте паттерн MVP.

// Есть группа студентов. Для каждого студента есть журнал его посещаемости: список дат занятий и для каждой даты — посетил студент занятие или нет. Создайте класс AttendanceService (сервис посещаемости), в котором хранится информация обо всех студентах. Создайте класс AttendanceView, который позволяет отображать студентов и их посещаемость.

// Создайте класс контроллера со следующими функциями:
// - Распечатать всех студентов и посещаемость каждого в процентах
// - Распечатать студентов, отсортировав их по убыванию посещаемости
// - Распечатать студентов с посещаемостью ниже 25%

public class Main {
    public static void main(String[] args) {

        List<Meeting<LocalDate, Boolean>> meetingsAlex = new LinkedList<>();
        meetingsAlex.add(new Meeting<LocalDate, Boolean>(LocalDate.of(2023, 1, 9), true));
        meetingsAlex.add(new Meeting<LocalDate, Boolean>(LocalDate.of(2023, 1, 10), false));
        meetingsAlex.add(new Meeting<LocalDate, Boolean>(LocalDate.of(2023, 1, 11), true));
        MeetingList meetingListAlex = new MeetingList(meetingsAlex);

        Student student1 = new Student("Alex", "A-111", 18, "Male");

        List<Meeting<LocalDate, Boolean>> meetingsMaks = new LinkedList<>();
        meetingsMaks.add(new Meeting<LocalDate, Boolean>(LocalDate.of(2023, 1, 9), false));
        meetingsMaks.add(new Meeting<LocalDate, Boolean>(LocalDate.of(2023, 1, 10), false));
        meetingsMaks.add(new Meeting<LocalDate, Boolean>(LocalDate.of(2023, 1, 11), true));
        MeetingList meetingListMaks = new MeetingList(meetingsMaks);

        Student student2 = new Student("Maks", "B-222", 18, "Male");

        List<Meeting<LocalDate, Boolean>> meetingsOlga = new LinkedList<>();
        meetingsOlga.add(new Meeting<LocalDate, Boolean>(LocalDate.of(2023, 1, 9), true));
        meetingsOlga.add(new Meeting<LocalDate, Boolean>(LocalDate.of(2023, 1, 10), true));
        meetingsOlga.add(new Meeting<LocalDate, Boolean>(LocalDate.of(2023, 1, 11), true));
        MeetingList meetingListOlga = new MeetingList(meetingsOlga);

        Student student3 = new Student("Olga", "C-333", 18, "Female");

        List<Meeting<LocalDate, Boolean>> meetingsIvan = new LinkedList<>();
        meetingsIvan.add(new Meeting<LocalDate, Boolean>(LocalDate.of(2023, 1, 9), false));
        meetingsIvan.add(new Meeting<LocalDate, Boolean>(LocalDate.of(2023, 1, 10), false));
        meetingsIvan.add(new Meeting<LocalDate, Boolean>(LocalDate.of(2023, 1, 11), false));
        MeetingList meetingListIvan = new MeetingList(meetingsIvan);

        Student student4 = new Student("Ivan", "D-444", 18, "Male");

        List<Student> students = new LinkedList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        StudentGroup studentGroup = new StudentGroup(students);

        List<MeetingList> meetingLists = new LinkedList<>();
        meetingLists.add(meetingListAlex);
        meetingLists.add(meetingListMaks);
        meetingLists.add(meetingListOlga);
        meetingLists.add(meetingListIvan);

        AttendanceService attendanceService = new AttendanceService(studentGroup, meetingLists);
        attendanceService.getPercent();
        attendanceService.show();

    }
}
