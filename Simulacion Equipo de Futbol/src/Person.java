public abstract class Person {

    private String name;
    private String last_name;
    int age;

    public Person(String name, String last_name, int age) {
        this.name = name;
        this.last_name = last_name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLast_name() {
        return last_name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "\nName: " + name +
                "\nLast name: " + last_name +
                "\nAge: " + age;
    }
}
