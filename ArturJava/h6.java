import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class h6 {

    public static void main(String[] args) {
        
        ArrayList<Integer> arvudeLoend = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        
        while (true) {
            System.out.print("Sisesta täisarv, jäta tühjaks, et lõpetada: ");
            String sisend = scanner.nextLine();
            
            if (sisend.isEmpty()) {
                break;
            }
            
            try {
                int arv = Integer.parseInt(sisend);
                arvudeLoend.add(arv);
            } catch (NumberFormatException e) {
                System.out.println("Pole täisarv");
            }
        }
        
        scanner.close();
        
        int summa = leiaSumma(arvudeLoend);
        double keskmine = leiaKeskmine(arvudeLoend);
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("h6.tulemus.txt"))) {
            writer.write("Lisatud täisarvud: " + arvudeLoend.toString());
            writer.newLine();
            writer.write("Summa: " + summa);
            writer.newLine();
            writer.write("Keskmine: " + keskmine);
        } catch (IOException e) {
            System.out.println("Viga tekstifaili kirjutamisel: " + e.getMessage());
        }
    }

    public static int leiaSumma(ArrayList<Integer> arvudeLoend) {
        int summa = 0;
        for (int arv : arvudeLoend) {
            summa += arv;
        }
        return summa;
    }

    public static double leiaKeskmine(ArrayList<Integer> arvudeLoend) {
        if (arvudeLoend.isEmpty()) {
            return 0.0;
        }
        int summa = leiaSumma(arvudeLoend);
        return (double) summa / arvudeLoend.size();
    }
}
