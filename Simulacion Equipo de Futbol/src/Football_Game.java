public class Football_Game extends Activity {

    protected String rival;

    public Football_Game(int day, int month, float hour, String rival) {
        super(day, month, hour);
        this.rival = rival;
    }

    @Override
    public String toString() {
        return "\nFootball Game:" +
                super.toString() +
                "\nRival: " + rival;
    }
}
