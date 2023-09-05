

public class h2 {
 //põhiprogamm
    public static void main(String[] args) {
        tollmeetriks();
        ellipsipindala();
        minuttunniks();
        double[] kiirused = skiirus();
        double kiirus1 = kiirused[0];
        double kiirus2 = kiirused[1];
        skiirusvahe(kiirus1, kiirus2);
    }
 
 
 //Toll meetriteks
    static void tollmeetriks() {

        double toll = 1;
        
        double meeter = toll * 0.0254;
        System.out.println(toll +" tolli meetrites on: "+meeter+" meetrit");
    }


 //Ellipsi puindala
    static void ellipsipindala() {
        double a = 10;
        double b = 9;
        double pi = Math.PI;
        double pindala = Math.round((pi*a*b)* 100.0)/ 100.0;
        System.out.println("Ellipsin mille pooltelg A on: "+a+" ja mille pooltelg B on: "+b+ " pindala on: "+ pindala);
    }


 //Minut tunditeks
    static void minuttunniks() {
        int minut = 82;
        int tund = minut/60;
        int minutalles = minut%60;
        System.out.println("Etteantud minutites "+minut+"min on "+tund+"tund(i) ja "+minutalles+" minutit");
        
    }
//Sportlaste kiirused

    static double[] skiirus() {
        double d = 16;
        double a1 = 2.3;
        double a2 = 1.8;
        

        
        double kiirus1 = Math.round((d / a1)*100.0)/100.0;
        double kiirus2 = Math.round((d / a2)*100.0)/100.0;
        
        System.out.println("1. sportlase kiirus on: "+kiirus1+"km/h 2. sportlase kiirus on: "+kiirus2+"km/h");
        double[] kiirused = {kiirus1, kiirus2};
        return kiirused;
    } 

//Sportlaste kiiruste vahe
    static void skiirusvahe(double kiirus1, double kiirus2) {
        double kiirustevahe = Math.abs(kiirus1 - kiirus2);
        System.out.println("Sportlaste kiiruste vahe on: " + Math.round(kiirustevahe*100.0)/100.0 + " km/h");
}
}