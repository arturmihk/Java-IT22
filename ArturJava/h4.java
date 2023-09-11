import java.util.Scanner;

public class h4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sisesta suvaline text: ");
        String text = scanner.nextLine();
        System.out.println("Sisestatud text: " + text);
        System.out.println("Sisestatud text suurtähtedega: " + text.toUpperCase());
        System.out.println("Sisestatud texti märkida arv: " + text.length());
        System.out.println("Sisestatud texti sõnade arv: " + text.split(" ").length);

        String[] tykeldus = text.split(" ");
        System.out.println(String.format("Sisestatud texti esimene sõna %s", tykeldus[0]));
}
}