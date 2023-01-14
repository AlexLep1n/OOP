import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class AttendanceService {
    StudentGroup studentGroup;
    List<MeetingList> meetingLists;

    public AttendanceService(StudentGroup studentGroup, List<MeetingList> meetingLists) {
        this.studentGroup = studentGroup;
        this.meetingLists = meetingLists;
    }

    public void show() {
        for (int i = 0; i < studentGroup.size(); i++) {
            System.out.println(studentGroup.get(i));
            System.out.println(meetingLists.get(i));
        }
    }

    public StudentGroup getPercent() {
        // List<Pair<String, Double>> stPercentAtt = new LinkedList<>();
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

            // System.out.printf("%s - %.1f %% \n", studentGroup.get(i).getName(),
            // attendancePercent);

            // stPercentAtt.add(new Pair<String, Double>(studentGroup.get(i).getName(),
            // attendancePercent));
            count = 0;
        }
        return studentGroup;
    }

    // public void sort() {
    // List<Pair<String, Double>> listToSort = getPercent();
    // for (int i = 0; i < listToSort.size(); i++) {
    // if (listToSort.get(i).getValue2() > listToSort.get(i + 1).getValue2()) {
    // Double buf = listToSort.get(i + 1).getValue2();

    // }
    // }
    // }

}
