public abstract class Activity {
    protected int day;
    protected int month;
    protected float hour;

    public Activity(int day, int month, float hour) {
        this.day = day;
        this.month = month;
        this.hour = hour;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public float getHour() {
        return hour;
    }

    @Override
    public String toString() {
        return "\nDay: " + day +
                "\nMonth: " + month +
                "\nHour: " + hour;
    }
}
