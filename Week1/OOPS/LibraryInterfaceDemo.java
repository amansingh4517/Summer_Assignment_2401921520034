import java.util.Scanner;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {

        KidUsers kid1 = new KidUsers(10, "Kids");
        System.out.println();
        KidUsers kid2 = new KidUsers(10, "Fiction");
        System.out.println();
        AdultUser adult1 = new AdultUser(5, "Kids");
        System.out.println();
        AdultUser adult2 = new AdultUser(23, "Fiction");
    }
}
