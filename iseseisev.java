import java.util.Scanner;

public class iseseisev {
    public static void main(String[] args) {
        u9();
        u13();
        //u15();
        //u23();
        //u24();
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
}
        //static void u15();
        //static void u23();
        //static void u24();







    

