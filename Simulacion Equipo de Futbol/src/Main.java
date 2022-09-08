public class Main {
    public static void main(String[] args) {

        Menu.getMenu1();
        show_Team();
        Menu.getMenu2();
        show_Team_Plans();
    }

    public static void show_Team() {

        System.out.println("This is the team:");

        for (Person person:Menu.person) {
            System.out.println(person.toString());
            System.out.println("");
            System.out.print("-------------------------------");
        }
    }

    public static void show_Team_Plans() {

        System.out.println("This are the plans of the team:");

        for (Activity activity:Menu.activities) {
            System.out.println(activity.toString());
            System.out.println("");
            System.out.print("-------------------------------");
        }
    }
}


