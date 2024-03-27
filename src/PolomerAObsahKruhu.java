import java.util.Scanner;

public class PolomerAObsahKruhu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.println("Zadej poloměr kruhu (cm):");
        double r = Double.parseDouble(scanner.nextLine());
        double pi = 3.1415;
        double o = 2 * pi * r;
        double s = pi * r * r;
        System.out.println("Obvod zadaného kruhu je: " + o + " cm ");
        System.out.println("Jeho obsah je: " + s + " cm^2");

    }
}