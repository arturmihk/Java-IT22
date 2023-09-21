import java.util.Scanner;
import java.util.Random;

public class iseseisev {

    private static Scanner sisestus = new Scanner(System.in);

    public static void main(String[] args) {
        u9();
        u13();
        System.out.print("Sisestage isikukood: ");
        String isikukood = sisestus.nextLine();
        u15(isikukood);
        u23();
        u24();
        sisestus.close();
    }

    static void u9() {
        for (int i = 0; i < 66; i++) {
            System.out.println(i + 1);
        }
    }

    static void u13() {
        System.out.print("Sisestage kolmnurga kõrgus: ");
        int korgus = sisestus.nextInt();

        for (int i = 1; i <= korgus; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sisestus.nextLine();
    }

    public static void u15(String isikukood) {
        if (isikukood.length() != 11) {
            System.out.println("Isikukood peab olema 11 numbri pikkune.");
        } else {
            char esimeneNumber = isikukood.charAt(0);
            int sunniaasta;
            int kuu;
            int paev;

            if (esimeneNumber == '3' || esimeneNumber == '4') {
                // Isikukood on enne 2000. aastat
                sunniaasta = 1900 + Integer.parseInt(isikukood.substring(1, 3));
                kuu = Integer.parseInt(isikukood.substring(3, 5));
                paev = Integer.parseInt(isikukood.substring(5, 7));
            } else {
                // Isikukood on parast 2000. aastat
                sunniaasta = 2000 + Integer.parseInt(isikukood.substring(1, 3));
                kuu = Integer.parseInt(isikukood.substring(3, 5));
                paev = Integer.parseInt(isikukood.substring(5, 7));
            }

            char sugum = isikukood.charAt(0);
            String sugu;

            if (Character.getNumericValue(sugum) % 2 == 0) {
                sugu = "naine";
            } else {
                sugu = "mees";
            }

            System.out.println("Sugu: " + sugu);
            System.out.println("Sünniaeg: " + paev + "." + kuu + "." + sunniaasta);
        }
    }

    public static void u23() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int kasutajaVõidud = 0;
        int arvutiVõidud = 0;

        System.out.println("Täringumäng algab!");

        while (true) {
            int kasutajaTäring1 = viskaTäring();
            int kasutajaTäring2 = viskaTäring();
            int arvutiTäring1 = random.nextInt(6) + 1;
            int arvutiTäring2 = random.nextInt(6) + 1;

            System.out.println("Sinu visatud täringud: " + kasutajaTäring1 + " ja " + kasutajaTäring2);
            System.out.println("Arvuti visatud täringud: " + arvutiTäring1 + " ja " + arvutiTäring2);

            int kasutajaSumma = kasutajaTäring1 + kasutajaTäring2;
            int arvutiSumma = arvutiTäring1 + arvutiTäring2;

            if (kasutajaSumma > arvutiSumma) {
                System.out.println("Sa võitsid vooru!");
                kasutajaVõidud++;
            } else if (arvutiSumma > kasutajaSumma) {
                System.out.println("Arvuti võitis vooru!");
                arvutiVõidud++;
            } else {
                System.out.println("Viik sel korral!");
            }

            System.out.println("Hetkelised tulemused: Sinu võidud: " + kasutajaVõidud + ", Arvuti võidud: " + arvutiVõidud);
            System.out.print("Kas soovid veel mängida? (jah/ei): ");
            String vastus = scanner.next();

            if (!vastus.equalsIgnoreCase("jah")) {
                break;
            }
        }

        if (kasutajaVõidud > arvutiVõidud) {
            System.out.println("Sa võitsid mängu!");
        } else if (arvutiVõidud > kasutajaVõidud) {
            System.out.println("Arvuti võitis mängu!");
        } else {
            System.out.println("Mäng lõppes viigiga!");
        }

        scanner.close();
    }

    public static int viskaTäring() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }


    static void u24() {
        Random rand = new Random();
        int arv = rand.nextInt(100);
        int arvamisi = 0;

        System.out.print("Kas soovite mangida 3 korda (1) või lõpmatuseni (2)?:");
        int korrad = sisestus.nextInt();

        System.out.print("Arva ara arv 1-100: ");
        int arvamus = sisestus.nextInt();

        if (korrad == 1) {
            while (arvamisi < 2) {
                if (arvamus == arv) {
                    System.out.println("Arvasid ara!");
                    break;
                } else if (arvamus < arv) {
                    System.out.println("Arv on suurem");
                    arvamisi++;
                    System.out.print("Arva uuesti: ");
                    arvamus = sisestus.nextInt();
                } else if (arvamus > arv) {
                    System.out.println("Arv on väiksem");
                    arvamisi++;
                    System.out.print("Arva uuesti: ");
                    arvamus = sisestus.nextInt();
                }
            }
        } else
            while (arvamisi >= 0) {
                if (arvamus == arv) {
                    System.out.println("Arvasid ära!");
                    break;
                } else if (arvamus < arv) {
                    System.out.println("Arv on suurem");
                    arvamisi++;
                    System.out.print("Arva uuesti: ");
                    arvamus = sisestus.nextInt();
                } else if (arvamus > arv) {
                    System.out.println("Arv on väiksem");
                    arvamisi++;
                    System.out.print("Arva uuesti: ");
                    arvamus = sisestus.nextInt();
                }
            }
    }
}
