/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package github_project;

```java
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ZooTicketSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Preise
        final double EURASIEN_ERW = 8;
        final double EURASIEN_ERM = 5;

        final double AFRIKA_ERW = 10;
        final double AFRIKA_ERM = 6;

        final double NORDAMERIKA_ERW = 7;
        final double NORDAMERIKA_ERM = 4;

        final double SUEDAMERIKA_ERW = 7;
        final double SUEDAMERIKA_ERM = 4;

        final double AUSTRALIEN_ERW = 9;
        final double AUSTRALIEN_ERM = 5;

        final double TROPEN_ERW = 12;
        final double TROPEN_ERM = 7;

        final double MEERESWELT_ERW = 15;
        final double MEERESWELT_ERM = 10;

        final double PARKPLATZ_PKW = 5;
        final double PARKPLATZ_BUS = 10;

        final double ZIEGENFUETTERUNG = 3;
        final double ORCA_SHOW = 8;

        double gesamtpreis = 0;

        ArrayList<String> bereiche = new ArrayList<>();
        ArrayList<String> extras = new ArrayList<>();

        System.out.println("===== ZOO TICKET SYSTEM =====");

        // Personenanzahl
        System.out.print("Anzahl Erwachsene: ");
        int erwachsene = scanner.nextInt();

        System.out.print("Anzahl Ermäßigte: ");
        int ermaessigt = scanner.nextInt();

        // Bereichsauswahl
        System.out.println("\nWelche Bereiche möchten Sie besuchen?");
        System.out.println("1 - Eurasien");
        System.out.println("2 - Afrika");
        System.out.println("3 - Nordamerika");
        System.out.println("4 - Südamerika");
        System.out.println("5 - Australien & Ozeanien");
        System.out.println("6 - Tropisches Zentrum");
        System.out.println("7 - Meereswelt");
        System.out.println("0 - Fertig");

        int auswahl;

        do {
            System.out.print("Bereich auswählen: ");
            auswahl = scanner.nextInt();

            switch (auswahl) {

                case 1:
                    bereiche.add("Eurasien");
                    gesamtpreis += (erwachsene * EURASIEN_ERW)
                            + (ermaessigt * EURASIEN_ERM);
                    break;

                case 2:
                    bereiche.add("Afrika");
                    gesamtpreis += (erwachsene * AFRIKA_ERW)
                            + (ermaessigt * AFRIKA_ERM);
                    break;

                case 3:
                    bereiche.add("Nordamerika");
                    gesamtpreis += (erwachsene * NORDAMERIKA_ERW)
                            + (ermaessigt * NORDAMERIKA_ERM);
                    break;

                case 4:
                    bereiche.add("Südamerika");
                    gesamtpreis += (erwachsene * SUEDAMERIKA_ERW)
                            + (ermaessigt * SUEDAMERIKA_ERM);
                    break;

                case 5:
                    bereiche.add("Australien & Ozeanien");
                    gesamtpreis += (erwachsene * AUSTRALIEN_ERW)
                            + (ermaessigt * AUSTRALIEN_ERM);
                    break;

                case 6:
                    bereiche.add("Tropisches Zentrum");
                    gesamtpreis += (erwachsene * TROPEN_ERW)
                            + (ermaessigt * TROPEN_ERM);
                    break;

                case 7:
                    bereiche.add("Meereswelt");
                    gesamtpreis += (erwachsene * MEERESWELT_ERW)
                            + (ermaessigt * MEERESWELT_ERM);
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Ungültige Eingabe!");
            }

        } while (auswahl != 0);

        // Parkplatz
        System.out.println("\nParkplatz auswählen:");
        System.out.println("1 - PKW");
        System.out.println("2 - Bus/Wohnmobil");
        System.out.println("3 - Kein Parkplatz");

        int parkplatz = scanner.nextInt();

        switch (parkplatz) {

            case 1:
                gesamtpreis += PARKPLATZ_PKW;
                break;

            case 2:
                gesamtpreis += PARKPLATZ_BUS;
                break;

            case 3:
                break;

            default:
                System.out.println("Ungültige Auswahl!");
        }

        // Zusatzangebote
        System.out.println("\nZusatzangebote:");
        System.out.println("1 - Ziegenfütterung");
        System.out.println("2 - Orca-Show");
        System.out.println("0 - Keine weiteren Angebote");

        int extra;

        do {
            System.out.print("Zusatzangebot auswählen: ");
            extra = scanner.nextInt();

            switch (extra) {

                case 1:
                    extras.add("Ziegenfütterung");
                    gesamtpreis += ZIEGENFUETTERUNG;
                    break;

                case 2:
                    extras.add("Orca-Show");
                    gesamtpreis += ORCA_SHOW;
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Ungültige Eingabe!");
            }

        } while (extra != 0);

        // Auftragsnummer erzeugen
        Random random = new Random();
        int nummer = random.nextInt(90000) + 10000;

        String auftragsnummer = "ZOO-2026-" + nummer;

        // Einfache Barcode-Darstellung
        String barcode = "|||| ||| |||||| || ||";

        // Ausgabe
        System.out.println("\n==============================");
        System.out.println("          ZOO TICKET");
        System.out.println("==============================");

        System.out.println("Erwachsene: " + erwachsene);
        System.out.println("Ermäßigt: " + ermaessigt);

        System.out.println("\nGewählte Bereiche:");
        for (String b : bereiche) {
            System.out.println("- " + b);
        }

        System.out.println("\nZusatzangebote:");
        if (extras.isEmpty()) {
            System.out.println("Keine");
        } else {
            for (String e : extras) {
                System.out.println("- " + e);
            }
        }

        System.out.printf("\nGesamtpreis: %.2f €\n", gesamtpreis);

        System.out.println("\nAuftragsnummer: " + auftragsnummer);

        System.out.println("Barcode:");
        System.out.println(barcode);

        System.out.println("==============================");

        scanner.close();
    }
}
```
