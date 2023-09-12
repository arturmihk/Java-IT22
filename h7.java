import java.util.Scanner;

public class h7 {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        korrutamine();
    }

    static void korrutamine() {
        
        while(true)
        {
            try {
                System.out.print("Sisesta esimene number: ");
                int arv1 = Integer.parseInt(scanner.nextLine());

                System.out.print("Sisesta teine number: ");
                int arv2 = Integer.parseInt(scanner.nextLine());

                int korrutis = arv1 * arv2;
                System.out.println("Korrutis: " + korrutis);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Pole number.");
            }
        }
    }
}
