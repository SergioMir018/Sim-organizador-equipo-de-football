public class Doctor extends Person {

    private String title;
    private int years_experience;

    public Doctor(String name, String last_name, int age, String title, int years_experience) {
        super(name, last_name, age);
        this.title = title;
        this.years_experience = years_experience;
    }

    public String getTitle() {

        return title;
    }

    public int getYears_experience() {

        return years_experience;
    }

    @Override
    public String toString() {
        return "\nDoctor:" +
                super.toString() +
                "\nTitle: " + title +
                "\nYears experience: " + years_experience;
    }
}
