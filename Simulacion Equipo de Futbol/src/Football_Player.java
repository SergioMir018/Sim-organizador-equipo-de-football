public class Football_Player extends Person {

    private int back_number;
    private String position;

    public Football_Player(String name, String last_name, int age, int back_number, String position) {
        super(name, last_name, age);
        this.back_number = back_number;
        this.position = position;
    }

    public int getBack_number() {

        return back_number;
    }

    public String getPosition() {

        return position;
    }

    @Override
    public String toString() {
        return "\nFootball Player" +
                super.toString() +
                "\nBack number: " + back_number +
                "\nPosition: " + position;
    }
}
