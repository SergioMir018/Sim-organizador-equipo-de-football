public class Training extends Activity {

    protected String method;

    public Training(int day, int month, float hour, String method) {
        super(day, month, hour);
        this.method = method;
    }

    @Override
    public String toString() {
        return "\nTraining:" +
                super.toString() +
                "\nTraining method: " + method;
    }
}
