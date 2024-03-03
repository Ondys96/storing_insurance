package czitnetwork;

public class PojistnaUdalost {
    String typ;
    String popis;
    double castka;

    // vytvoreni pojistné udalosti
    public PojistnaUdalost(String typ, String popis, double castka) {
        this.typ = typ;
        this.popis = popis;
        this.castka = castka;
    }

    // vypsaní pojistné udalosti
    @Override
    public String toString() {
        return "Typ: " + typ + " " + "Popis: " + popis + " " + "Částka: " + castka;
    }
}
