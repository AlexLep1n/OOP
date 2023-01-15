package model;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

public class MeetingList implements Iterable<Meeting<LocalDate, Boolean>> {
    private List<Meeting<LocalDate, Boolean>> meetings;

    public MeetingList(List<Meeting<LocalDate, Boolean>> meetings) {
        this.meetings = meetings;
    }

    @Override
    public String toString() {
        return meetings + "\n";
    }

    public int size() {
        return meetings.size();
    }

    public Meeting<LocalDate, Boolean> get(int index) {
        return meetings.get(index);
    }

    @Override
    public Iterator<Meeting<LocalDate, Boolean>> iterator() {
        return new MeetingIterator(this);
    }

}
