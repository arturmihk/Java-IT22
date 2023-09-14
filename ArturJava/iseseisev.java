import java.util.Scanner;
import java.util.Random;

public class iseseisev {
    public static void main(String[] args) {
        u9();
        u13();
        //u15();
        //u23();
        u24();
        }

        static void u9() {
            for (int i = 0; i < 66; i++) {
                System.out.println(i + 1);
            }
        }
        static void u13() {
            Scanner sisestus = new Scanner(System.in);
        
            System.out.print("Sisestage kolmnurga kõrgus: ");
            int korgus = sisestus.nextInt();
        
         for (int i = 1; i <= korgus; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
             System.out.println(); 
         }
        
        sisestus.close();
    }

        //static void u15() {
        //}
        //static void u23() {
        
        static void u24() {
            Random rand = new Random();
            int arv = rand.nextInt(100);
            int arvamisi = 0;

            Scanner mangukorrad = new Scanner(System.in);
            System.out.print("Kas soovite mängida 3 korda (1) või lõpmatuseni (2)?:");
            int korrad = mangukorrad.nextInt();

            Scanner sisestus = new Scanner(System.in);
            System.out.print("Arva ära arv 1-100: ");
            int arvamus = sisestus.nextInt();
            
            if (korrad == 1) {
                while (arvamisi < 3) {
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
        }   else
                while (arvamisi >= 0) {
                    if (arvamus == arv) {
                        System.out.println("Arvasid ära!");
                        break;
                }   else if (arvamus < arv) {
                        System.out.println("Arv on suurem");
                        arvamisi++;
                        System.out.print("Arva uuesti: ");
                        arvamus = sisestus.nextInt();
                }   else if (arvamus > arv) {
                        System.out.println("Arv on väiksem");
                        arvamisi++;
                        System.out.print("Arva uuesti: ");
                        arvamus = sisestus.nextInt();
                }
            }
            sisestus.close();
            mangukorrad.close();
        }

        
}






    

