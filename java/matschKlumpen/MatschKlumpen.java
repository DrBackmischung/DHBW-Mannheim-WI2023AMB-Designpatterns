package java.matschKlumpen;

import java.util.*;

public class MatschKlumpen {
    public static List<String> datenbank = new ArrayList<>();
    public static int zaehler = 0;
    public static double kontostand = 1000.0;

    public static void main(String[] args) {
        // Direkte Manipulation von globalen Variablen
        datenbank.add("Kunde1");
        zaehler++;

        // Vermischung von Geschäftslogik, UI und Datenzugriff
        if (kontostand > 0) {
            System.out.println("Willkommen im System!");
            berechneUndDruckeAlles();
        }
    }

    public static void berechneUndDruckeAlles() {
        // Methode macht viel zu viele verschiedene Dinge
        kontostand -= 50; // Geschäftslogik

        // UI-Logik
        System.out.println("Verarbeite Daten...");

        // Datenbankoperationen
        datenbank.add("Neue Transaktion");

        // Berechnungen
        double zinsen = kontostand * 0.05;

        // Mehr UI
        System.out.println("Kontostand: " + kontostand);
        System.out.println("Zinsen: " + zinsen);

        // Logging vermischt mit allem anderen
        System.out.println("LOG: Operation abgeschlossen");

        // Weitere globale Zustandsänderungen
        zaehler += 10;

        if (zaehler > 5) {
            datenbank.clear(); // Gefährliche globale Operation
            System.out.println("Datenbank gelöscht!");
        }
    }
}