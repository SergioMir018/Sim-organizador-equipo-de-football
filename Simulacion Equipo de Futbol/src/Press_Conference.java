public class Press_Conference extends Activity {

    protected String commentator;

    public Press_Conference(int day, int month, float hour, String commentator) {
        super(day, month, hour);
        this.commentator = commentator;
    }

    @Override
    public String toString() {
        return "\nPress conference:" +
                super.toString() +
                "\nCommentator: " + commentator;
    }
}
