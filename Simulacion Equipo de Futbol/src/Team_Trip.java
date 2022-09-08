public class Team_Trip extends Activity {

    protected String place;
    protected String transportation;

    public Team_Trip(int day, int month, float hour, String place, String transportation) {
        super(day, month, hour);
        this.place = place;
        this.transportation = transportation;
    }

    @Override
    public String toString() {
        return "\nTeam trip:" +
                super.toString() +
                "\nPlace: " + place +
                "\nTransportation: " + transportation;
    }
}
