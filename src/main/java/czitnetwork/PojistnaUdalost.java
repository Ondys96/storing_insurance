package czitnetwork;

public class PojistnaUdalost {
    String typ;
    String popis;
    double castka;

    public PojistnaUdalost(String typ, String popis, double castka) {
        this.typ = typ;
        this.popis = popis;
        this.castka = castka;
    }

    @Override
    public String toString() {
        return "Typ: " + typ + " " + "Popis: " + popis + " " + "Částka: " + castka;
    }
}
