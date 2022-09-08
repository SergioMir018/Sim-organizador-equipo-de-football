public class Trainer extends Person {

    private String strategy;

    public Trainer(String name, String last_name, int age, String strategy) {
        super(name, last_name, age);
        this.strategy = strategy;
    }

    public String getStrategy() {

        return strategy;
    }

    @Override
    public String toString() {

        return "\nTrainer:" +
                super.toString() +
                "\nStrategy: " + strategy;
    }
}
