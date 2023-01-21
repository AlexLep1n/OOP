package model;

import java.util.List;

public class AttendanceService {
    StudentGroup studentGroup;
    List<MeetingList> meetingLists;

    public AttendanceService(StudentGroup studentGroup, List<MeetingList> meetingLists) {
        this.studentGroup = studentGroup;
        this.meetingLists = meetingLists;
    }

    // Выводит список студентов с посещаемостью каждого.
    public void show() {
        for (int i = 0; i < studentGroup.size(); i++) {
            System.out.println(studentGroup.get(i));
            System.out.println(meetingLists.get(i));
        }
    }

    /*
     * Пересоздает группу студентов с новым полем - проценты
     * рассчитывая проценты каждого студента.
     */
    public void setPercentTGroup() {
        double count = 0.0;
        for (int i = 0; i < meetingLists.size(); i++) {
            int days = meetingLists.get(i).size();
            for (int j = 0; j < meetingLists.get(i).size(); j++) {
                Boolean flag = meetingLists.get(i).get(j).getAttendance();
                if (flag) {
                    count++;
                }
            }
            double attendancePercent = count / days * 100;
            double scale = Math.pow(10, 1);
            double resultPercent = Math.ceil(attendancePercent * scale) / scale;
            studentGroup.get(i).setPercent(resultPercent);
            count = 0;
        }
        show();
    }

    // Сортирует по убыванию группу студентов.
    public void sort() {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int j = 0; j < studentGroup.size(); j++) {
                for (int i = 0; i < studentGroup.size() - 1; i++) {
                    Student cur = studentGroup.students.get(i);
                    Student next = studentGroup.students.get(i + 1);
                    if (cur.getPercent() < next.getPercent()) {
                        studentGroup.students.set(i, next);
                        studentGroup.students.set(i + 1, cur);
                    }
                }
            }
            show();
        }
    }

    public void lessThan25Per() {
        for (Student st : studentGroup) {
            if (st.getPercent() < 25) {
                System.out.println(st);
            }
        }
    }
}
