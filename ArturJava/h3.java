public class h3 {
    public static void main(String[] args) {
        int[] mass = { 12, 5, 10, 10, 28, 17, 5, 19, 0, 13, 0, 22, 7, 0, 17, 2, 24, 1, 13, 29, 0, 7, 16, 8, 7, 4, 27,
                8, 8, 23, 26, 25, 15, 2, 26, 1 };
                
                System.out.println("Esimese elemendi väärtus: "+mass[0]);

                System.out.println("Viimase elemendi väärtus: "+mass[mass.length-1]);

                System.out.println("Massiivi pikkus: "+mass.length);

                int summa = 0;
                for (int i = 0; i < mass.length; i++) {
                     summa += mass[i];}
                System.out.println("Massiivi summa: "+summa);

                double keskmine = (double) summa / mass.length;
                System.out.println("massiivi keskmine: " + keskmine);
                
                int[][] mass2 = { { 1, 23 }, { 2, 15 }, { 3, 29 }, { 4, 15 }, { 5, 26 }, { 6, 17 }, { 7, 26 }, { 8, 15 },
                { 9, 28 }, { 10, 12 }, { 11, 24 }, { 12, 16 }, { 13, 21 }, { 14, 10 }, { 15, 10 }, { 16, 26 },
                { 17, 27 }, { 18, 19 }, { 19, 14 }, { 20, 14 }, { 21, 14 }, { 22, 26 }, { 23, 20 }, { 24, 28 },
                { 25, 29 }, { 26, 11 }, { 27, 28 }, { 28, 19 }, { 29, 25 }, { 30, 12 } };
                
                int[] temps = new int[mass2.length];

                for (int i = 0; i < mass2.length; i++) {
                    temps[i] = mass2[i][1];
                }
        
                for (int temp : temps) {
                    System.out.println(temp);
            }
    }
}
