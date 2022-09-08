import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    static ArrayList<Person> person = new ArrayList<Person>();
    static ArrayList<Activity> activities = new ArrayList<Activity>();
    static Scanner input = new Scanner(System.in);

    static int option;
    static char answer;

    public static void getMenu1() {

        do {
            do {
                System.out.println("What person do you want to inscribe: ");
                System.out.println("1 ==> Football player");
                System.out.println("2 ==> Trainer");
                System.out.println("3 ==> Doctor");
                System.out.print("What option do you choose? ");
                option = input.nextInt();
            } while (option < 1 || option > 3);

            switch (option) {
                case 1 -> fill_Player();
                case 2 -> fill_Trainer();
                case 3 -> fill_Doctor();
            }

            System.out.print("Do you want to inscribe another person?(y/n) ");
            answer = input.next().charAt(0);
            System.out.println("");
        } while (answer == 'y' || answer == 'Y');
    }

    public static void fill_Player(){

        String name;
        String last_name;
        int age;
        int back_number;
        String position;

        System.out.print("\nWrite the name of the player: ");
        name = input.next();
        System.out.print("Write the last name of the player: ");
        last_name = input.next();
        System.out.print("Write the age of the player: ");
        age = input.nextInt();
        System.out.print("Write the back number of the player: ");
        back_number = input.nextInt();
        System.out.print("Write the position of the player: ");
        position = input.next();

        Football_Player footballPlayer = new Football_Player(name,last_name,age,back_number,position);

        person.add(footballPlayer);
        System.out.println("");
    }

    public static void fill_Trainer(){

        String name;
        String last_name;
        int age;
        String strategy;

        System.out.print("\nWrite the name of the trainer: ");
        name = input.next();
        System.out.print("Write the last name of the trainer: ");
        last_name = input.next();
        System.out.print("Write the age of the trainer: ");
        age = input.nextInt();
        System.out.print("Write the strategy of the trainer: ");
        strategy = input.next();

        Trainer trainer = new Trainer(name,last_name,age,strategy);

        person.add(trainer);
        System.out.println("");
    }

    public static void fill_Doctor() {

        String name;
        String last_name;
        int age;
        String title;
        int years_experience;

        System.out.print("\nWrite the name of the doctor: ");
        name = input.next();
        System.out.print("Write the last name of the doctor: ");
        last_name = input.next();
        System.out.print("Write the age of the doctor: ");
        age = input.nextInt();
        System.out.print("Write the title of the doctor: ");
        title = input.next();
        System.out.print("Write how many years of experience does the doctor have: ");
        years_experience = input.nextInt();

        Doctor doctor = new Doctor(name,last_name,age,title,years_experience);

        person.add(doctor);
        System.out.println("");
    }

    public static void getMenu2() {

        do {
            do {
                System.out.println("What do you want to do now?");
                System.out.println("1 ==> Plan team trip");
                System.out.println("2 ==> Plan training");
                System.out.println("3 ==> Plan football game");
                System.out.println("4 ==> Plan press conference");
                System.out.println("5 ==> Plan healing session for lesion");
                System.out.print("What option do you choose? ");
                option = input.nextInt();
            } while (option < 1 || option > 5);

           switch (option){
                case 1 -> fill_TeamTrip();
                case 2 -> fill_Training();
                case 3 -> fill_Football_Game();
                case 4 -> fill_Press_Session();
                case 5 -> fill_Healing_Session();
            }

            System.out.print("Do you want to plan another activity(y/n)? ");
            answer = input.next().charAt(0);
        } while (answer == 'y' || answer == 'Y');
    }

    public static void fill_TeamTrip() {

        int day;
        int month;
        float hour;
        String place;
        String transportation;

        System.out.print("\nWrite the day of the trip: ");
        day = input.nextInt();
        System.out.print("Write in which mont the trip will be made (1-12): ");
        month = input.nextInt();
        System.out.print("Write at what time the trip will begin: ");
        hour = input.nextFloat();
        System.out.print("Write the destiny of the trip: ");
        place = input.next();
        System.out.print("Write in what type of transportation the trip will be made: ");
        transportation = input.next();

        Team_Trip trip = new Team_Trip(day,month,hour,place,transportation);

        activities.add(trip);
        System.out.println("");
    }

    public static void fill_Training() {

        int day;
        int month;
        float hour;
        String method;

        System.out.print("\nWrite the day of the training: ");
        day = input.nextInt();
        System.out.print("Write the moth the training will be done(1-12): ");
        month = input.nextInt();
        System.out.print("Write at what time the training will start: ");
        hour = input.nextFloat();
        System.out.print("Write the method of training: ");
        method = input.next();

        Training train = new Training(day,month,hour,method);

        activities.add(train);
        System.out.println("");
    }

    public static void fill_Football_Game() {

        int day;
        int month;
        float hour;
        String rival;

        System.out.print("\nWrite the day of the match: ");
        day = input.nextInt();
        System.out.print("Write the moth of the match(1-12): ");
        month = input.nextInt();
        System.out.print("Write a what time the match will start: ");
        hour = input.nextFloat();
        System.out.print("Write the rival of the team: ");
        rival = input.next();

        Football_Game match = new Football_Game(day,month,hour,rival);

        activities.add(match);
        System.out.println("");
    }

    public static void  fill_Press_Session() {

        int day;
        int month;
        float hour;
        String commentator;

        System.out.print("\nWrite the day of the press session: ");
        day = input.nextInt();
        System.out.print("Write the moth of the press session(1-12): ");
        month = input.nextInt();
        System.out.print("Write a what time the press session will start: ");
        hour = input.nextFloat();
        System.out.print("Write who will give the session: ");
        commentator = input.next();

        Press_Conference press_session = new Press_Conference(day,month,hour,commentator);

        activities.add(press_session);
        System.out.println("");
    }

    public static void  fill_Healing_Session() {

        int day;
        int month;
        float hour;
        String doctor;

        System.out.print("\nWrite the day of the treatment session: ");
        day = input.nextInt();
        System.out.print("Write the moth of the treatment session(1-12): ");
        month = input.nextInt();
        System.out.print("Write a what time the treatment session will start: ");
        hour = input.nextFloat();
        System.out.print("Write who will give the session: ");
        doctor = input.next();

        Healing_Session healing_session = new Healing_Session(day,month,hour,doctor);

        activities.add(healing_session);
        System.out.println("");
    }
}
