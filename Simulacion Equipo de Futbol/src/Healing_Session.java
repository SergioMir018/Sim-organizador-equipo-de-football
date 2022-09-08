public class Healing_Session extends Activity {

    protected String doctor;

    public Healing_Session(int day, int month, float hour, String doctor) {
        super(day, month, hour);
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "\nHealing session:" +
                super.toString() +
                "\nDoctor: " + doctor;
    }
}
