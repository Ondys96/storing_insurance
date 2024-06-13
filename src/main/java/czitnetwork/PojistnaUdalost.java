package czitnetwork;

public class PojistnaUdalost {
    String typ;
    String popis;
    double castka;

    // konstruktor třídy pro vytvoření pojistné události
    public PojistnaUdalost(String typ, String popis, double castka) {
        this.typ = typ;
        this.popis = popis;
        this.castka = castka;
    }

    // textový přepis instance
    @Override
    public String toString() {
        return "Typ: " + typ + " " + "Popis: " + popis + " " + "Částka: " + castka;
    }
}
