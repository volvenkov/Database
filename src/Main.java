import DatabaseAPI.Cow;
import DatabaseAPI.CowDatabase;

public class Main {

    public static void main(String[] args) {
        Cow cow1 = new Cow(1, 12, null, "Brown");
        Cow cow2 = new Cow(2, 14, null, "Black");
        Cow cow3 = new Cow(3, 7, null, "Red");
        Cow cow4 = new Cow(4, 8, null, "Yellow");
        Cow cow5 = new Cow(5, 32, null, "Red");

        CowDatabase cowDatabase = new CowDatabase("database", true);

        cowDatabase.insert(cow1);
        cowDatabase.insert(cow2);
        cowDatabase.insert(cow3);
        cowDatabase.insert(cow4);
        cowDatabase.insert(cow5);

        cowDatabase.delete(1);
        cowDatabase.delete(4);

        System.out.println("-----");

        System.out.println(cowDatabase.extract(1));
        System.out.println(cowDatabase.extract(2));
        System.out.println(cowDatabase.extract(3));
        System.out.println(cowDatabase.extract(4));
        System.out.println(cowDatabase.extract(5));

        cowDatabase.save();

        cowDatabase = new CowDatabase("database", false);

        System.out.println("-----");

        System.out.println(cowDatabase.extract(1));
        System.out.println(cowDatabase.extract(2));
        System.out.println(cowDatabase.extract(3));
        System.out.println(cowDatabase.extract(4));
        System.out.println(cowDatabase.extract(5));

        System.out.println("-----");

    }
}
