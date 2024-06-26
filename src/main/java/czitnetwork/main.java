package czitnetwork;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    private static ArrayList<PojistnaUdalost> seznamUdalosti = new ArrayList<>();
    private static ArrayList<Pojisteny> seznamPojistenych = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in, "Windows-1250");

    // main metoda s hlavním menu který pomocí cyklu while jede nekonečnou smyčku dokud uživatel neukončí pomoci čísla 6.
    // pokud neukončí smyčka pokračuje dál.
    public static void main(String[] args) {
        while (true) {
            zobrazMenu();
            int volba = scanner.nextInt();
            scanner.nextLine();

            switch (volba) {
                case 1:
                    pridatUdalost();
                    break;
                case 2:
                    zobrazUdalosti();
                    break;
                case 3:
                    pridatPojisteneho();
                    break;
                case 4:
                    zobrazPojistene();
                    break;
                case 5:
                    vyhledatPojisteneho();
                    break;
                case 6:
                    System.out.println("Aplikace ukončena.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Neplatná volba. Prosím zkuste to znovu.");
                    break;
            }
        }
    }

    // metoda na zobrazeni menu
    private static void zobrazMenu() {
        System.out.println("1. Přidej pojistnou událost.");
        System.out.println("2. Zobraz pojistnou událost.");
        System.out.println("3. Přidej pojištěného.");
        System.out.println("4. Zobraz všechny pojištěné.");
        System.out.println("5. Vyhledej pojištěného.");
        System.out.println("6. Ukončit aplikaci.");
        System.out.print("Vyberte možnost: ");
    }

    // metoda na pridaní pojistné události
    private static void pridatUdalost() {
        System.out.println("Zadejte typ události: ");
        String typ = scanner.nextLine().trim();

        System.out.println("Zadejte popis události: ");
        String popis = scanner.nextLine().trim();

        System.out.println("Zadejte částku: ");
        double castka = scanner.nextDouble();
        scanner.nextLine();

        PojistnaUdalost udalost = new PojistnaUdalost(typ, popis, castka);
        seznamUdalosti.add(udalost);

        System.out.println("Událost byla úspěšně přídána.");
    }


    // metoda na zobrazeni pojistné udalosti
    private static void zobrazUdalosti() {
        System.out.println("Zobraz seznam pojistných událostí: ");
        for (PojistnaUdalost udalost : seznamUdalosti) {
            System.out.println(udalost);
        }
    }

    // metoda na pridani pojisteneho
    private static void pridatPojisteneho() {
        System.out.println("Zadejte jméno pojíštěného: ");
        String jmeno = scanner.nextLine().trim();

        System.out.println("Zadejte příjmení pojíštěného: ");
        String prijmeni = scanner.nextLine().trim();

        System.out.println("Zadejte věk pojíštěného: ");
        int vek = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Zadejte telefonní číslo pojíštěného: ");
        String telefon = scanner.nextLine().trim();

        Pojisteny pojistnik = new Pojisteny(jmeno, prijmeni, vek, telefon);
        seznamPojistenych.add(pojistnik);

        System.out.println("Pojištěný byl úspěšně přidán.");
    }

    // metoda na zobrazeni pojisteneho
    private static void zobrazPojistene() {
        System.out.println("Zobraz všechny pojištěné: ");
        for (Pojisteny pojistnik : seznamPojistenych) {
            System.out.println(pojistnik);
        }
    }

    // metoda na vyhledani pojisteneho
    private static void vyhledatPojisteneho() {
        System.out.println("Zadejte jméno pojištěného pro vyhledání: ");
        String hledaneJmeno = scanner.nextLine().trim();

        System.out.println("Zadejte příjmení pojíštěného pro vyhledání: ");
        String hledanePrijmeni = scanner.nextLine().trim();

        for (Pojisteny pojisteny : seznamPojistenych) {
            if (pojisteny.jmeno.equalsIgnoreCase(hledaneJmeno) && pojisteny.prijmeni.equalsIgnoreCase(hledanePrijmeni)) {
                System.out.println("Nalezený pojištěný: " + pojisteny);
                return;
            }
        }
        System.out.println("Pojíštěný s tímto jménem a příjmením nebyl nalezen.");
    }
}
