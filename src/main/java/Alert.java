public class Alert {
    private MainUser user;
    private Medication medication;
    private int priority;

    public Alert(MainUser user, Medication medication, int priority) {
        this.user = user;
        this.medication = medication;
        this.priority = priority;
    }

    public String getAlertMessage(int currentTime) {
        return "Som las " + currentTime + " y " + user.getName() + " ha tomado " + medication.getName();
    }
}
