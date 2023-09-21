import java.util.Scanner;

public class IsikukoodiAnalüsaator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sisestage isikukood: ");
        String isikukood = scanner.nextLine();

        if (isikukood.length() != 11) {
            System.out.println("Isikukood peab olema 11 numbri pikkune.");
        } else {
            char esimeneNumber = isikukood.charAt(0);
            int sünniaasta;
            int kuu;
            int päev;

            if (esimeneNumber == '3' || esimeneNumber == '4') {
                // Isikukood on enne 2000. aastat
                sünniaasta = 1900 + Integer.parseInt(isikukood.substring(1, 3));
                kuu = Integer.parseInt(isikukood.substring(3, 5));
                päev = Integer.parseInt(isikukood.substring(5, 7));
            } else {
                // Isikukood on pärast 2000. aastat
                sünniaasta = 2000 + Integer.parseInt(isikukood.substring(1, 3));
                kuu = Integer.parseInt(isikukood.substring(3, 5));
                päev = Integer.parseInt(isikukood.substring(5, 7));
            }

            char suguMarker = isikukood.charAt(0);
            String sugu;

            if (Character.getNumericValue(suguMarker) % 2 == 0) {
                sugu = "naine";
            } else {
                sugu = "mees";
            }

            System.out.println("Sugu: " + sugu);
            System.out.println("Sünniaeg: " + päev + "." + kuu + "." + sünniaasta);
        }

        scanner.close();
    }
}
