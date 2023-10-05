import java.util.Scanner;

public class h8_2 {
    private String mudel;
    private String voim;
    private int kiirus;

    private static Scanner scanner = new Scanner(System.in);

    public h8_2(String mudel, String voim) {
        this.mudel = mudel;
        this.voim = voim;
        this.kiirus = 50;
    }

    public static void main(String[] args) {
        // Kaks objekti
        h8_2 moto1 = new h8_2("Honda", "500cc");
        h8_2 moto2 = new h8_2("Kawasaki", "750cc");

        // Mootorratta kirjeldus enne muutusi
        System.out.println("Mootorratas 1: " + moto1.mootorrattaKirjeldus());
        System.out.println("Mootorratas 2: " + moto2.mootorrattaKirjeldus());

        // Mootorratas 1 kiirendas
        System.out.println("Kui palju kiirendab mootorratas 1 (kiiruse muutus km/h): ");
        int kiiruseMuutus1 = scanner.nextInt();

        moto1.suurendaKiirust(kiiruseMuutus1);

        // Mootorratas 2 kiirendas
        System.out.println("Kui palju kiirendab mootorratas 2 (kiiruse muutus km/h): ");
        int kiiruseMuutus2 = scanner.nextInt();

        moto2.suurendaKiirust2(kiiruseMuutus2);

        // Mootorratta kirjeldus peale kiirendamist
        System.out.println("Mootorratas 1: " + moto1.mootorrattaKirjeldus());
        System.out.println("Mootorratas 2: " + moto2.mootorrattaKirjeldus());

        // Kiiruste vahe arvutamine
        int kiirusteVahe = moto1.kiirusteVahe(moto2);
        System.out.println("Kiiruste vahe: " + kiirusteVahe + " km/h");
    }

    // Kiirendus 1
    public void suurendaKiirust(int kiiruseMuutus) {
        this.kiirus += kiiruseMuutus;
        System.out.println("Mootorratas 1 andis gaasi ja kiirenes " + kiiruseMuutus + " km/h võrra, uus kiirus: " + this.kiirus + " km/h");
    }

    // Kiirendus 2
    public void suurendaKiirust2(int kiiruseMuutus) {
        this.kiirus += kiiruseMuutus;
        System.out.println("Mootorratas 2 andis gaasi ja kiirenes " + kiiruseMuutus + " km/h võrra, uus kiirus: " + this.kiirus + " km/h");
    }

    // Mootorratta kirejldus
    public String mootorrattaKirjeldus() {
        return "Mudel: " + this.mudel + ", võimsus: " + this.voim + ", kiirus: " + this.kiirus + " km/h";
    }

    // Kiiruste vahe arvutamine
    public int kiirusteVahe(h8_2 teineMootorratas) {
        return Math.abs(this.kiirus - teineMootorratas.kiirus);
    }
}
