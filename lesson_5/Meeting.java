public class Meeting<LocalDate, Boolean> {
    private LocalDate date;
    private Boolean attendance;

    public Meeting(LocalDate date, Boolean attendance) {
        this.date = date;
        this.attendance = attendance;
    }

    public LocalDate getDate() {
        return date;
    }

    public Boolean getAttendance() {
        return attendance;
    }

    @Override
    public String toString() {
        return date + " - " + attendance;
    }

}
