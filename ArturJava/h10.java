// Looma klass
class Loom {
    private String nimi;
    private int vanus;

    public Loom(String nimi, int vanus) {
        this.nimi = nimi;
        this.vanus = vanus;
    }

    public void haalita() {
        System.out.println("Loom teeb häält");
    }

    public void toit() {
        System.out.println("Loom sööb erinevaid asju");
    }
}

// Roomaja klass (alamklass Loomast)
class Roomaja extends Loom {
    private boolean soomustatud;

    public Roomaja(String nimi, int vanus, boolean soomustatud) {
        super(nimi, vanus);
        this.soomustatud = soomustatud;
    }

    @Override
    public void haalita() {
        System.out.println("Roomaja hissib");
    }

    @Override
    public void toit() {
        System.out.println("Roomaja sööb putukaid ja väikseid loomi");
    }
}

// Lind klass (alamklass Loomast)
class Lind extends Loom {
    private boolean lendab;

    public Lind(String nimi, int vanus, boolean lendab) {
        super(nimi, vanus);
        this.lendab = lendab;
    }

    @Override
    public void haalita() {
        System.out.println("Lind laulab");
    }

    @Override
    public void toit() {
        System.out.println("Lind sööb seemneid ja putukaid");
    }
}

// Kala klass (alamklass Loomast)
class Kala extends Loom {
    private boolean ujub;

    public Kala(String nimi, int vanus, boolean ujub) {
        super(nimi, vanus);
        this.ujub = ujub;
    }

    @Override
    public void haalita() {
        System.out.println("Kala blubiseb");
    }

    @Override
    public void toit() {
        System.out.println("Kala sööb vetikaid ja väikseid kalu");
    }
}

// Koer klass (alamklass Loomast ja alamklass Imetajast)
class Koer extends Loom {
    private String tõug;

    public Koer(String nimi, int vanus, String tõug) {
        super(nimi, vanus);
        this.tõug = tõug;
    }

    @Override
    public void haalita() {
        System.out.println("Koer haugub");
    }

    @Override
    public void toit() {
        System.out.println("Koer sööb liha ja koeratoitu");
    }
}

public class h10 {
    public static void main(String[] args) {
        Loom roomaja = new Roomaja("Madu", 5, true);
        Loom lind = new Lind("Kana", 2, true);
        Loom kala = new Kala("Lõhe", 3, true);
        Loom koer = new Koer("Fido", 4, "Poks");

        roomaja.haalita();
        roomaja.toit();

        lind.haalita();
        lind.toit();

        kala.haalita();
        kala.toit();

        koer.haalita();
        koer.toit();
    }
}
