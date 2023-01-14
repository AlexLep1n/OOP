import java.time.LocalDate;
import java.util.Iterator;

public class MeetingIterator implements Iterator<Meeting<LocalDate, Boolean>> {
    MeetingList meetingList;
    int index = -1;

    public MeetingIterator(MeetingList meetingList) {
        this.meetingList = meetingList;
    }

    @Override
    public boolean hasNext() {
        return index < meetingList.size() - 1;
    }

    @Override
    public Meeting<LocalDate, Boolean> next() {
        index++;
        return meetingList.get(index);
    }

}
