
/**
 * Das Konto soll einen Kontoinhaber einen Kontostand und einen Zinssatz
 * enthalten.
 *
 * @author jaenefab
 * @version 24.09.2017
 */

import java.util.Scanner;

public class Konto
{
    /** 
     * Die neue Klasse Konto hat die Variablen: Inhaber, Stand und Satz.
     * Sie beschreiben den Kontoinhaber den Kontostand und den Zinssatz.
     */
    private String inhaber;
    private int stand;
    private int satz;

    /**
     * Erzeugt ein Konto, welches einen Kontostand von 0 und einen Standard-
     * Zinssatz von 2% hat.
     */
    public Konto(String kontoinhaber)
    {
        inhaber = kontoinhaber;
        stand = 0;
        satz = 2;
    }
    
      
    /**
     * Informiert den Benutzer über seinen aktuellen Kontostand.
     * Ermöglicht das einzahlen (Drücke "1") oder das abheben (Drücke "2").
     * Der anschliessend eingegebene Betrag erhöht oder verringert den Kontostand.
     * Der neue Kontostand wird zurückgegeben, auch dann, wenn keine Einzahlung gemacht wurde.
     * 
    */
    public int neuerstand()
    {
        System.out.println("Ihr momentaner Kontostand beträgt: " + stand + " CHF");
        System.out.println("Wählen Sie eine der Optionen: Geld einzahlen (1) / Geld abheben (2)");
        System.out.println("Und drücken sie 'Enter'");
        Scanner varibl2 = new Scanner(System.in);
        int Transaktionstyp = varibl2.nextInt();
	System.out.println(varibl2.nextLine());
	switch (Transaktionstyp){
	case 1: {
	System.out.println("Wählen Sie den einzuzahlenden Betrag aus: ");
        Scanner varibl3 = new Scanner(System.in);
        int betrag = varibl3.nextInt();
	System.out.println(varibl3.nextLine());
	stand = (stand + betrag);
	return stand;
	}
	case 2:{
	System.out.println("Wählen Sie den abzuhebenden Betrag aus: ");
        Scanner varibl4 = new Scanner(System.in);
        int betrag = varibl4.nextInt();
	System.out.println(varibl4.nextLine());
        stand = (stand - betrag);
	return stand;
        }
        }
    System.out.println("Diese Eingabe ist ungültig, bitte wählen Sie die 1 oder die 2");
    return stand;
    }

    /**
     * Informiert den Benutzer über seinen aktuellen Zinssatz.
     * Ermöglicht die Eingabe eines neuen Zinssatzes und liefert den aktuellen - neuen - Zinssatz.
    */
    public int neuersatz()
    {
        System.out.println("Ihr momentaner Zinssatz ist: " + satz + " %");
        System.out.println("Geben Sie Ihren gewünschten neuen Zinssatz ein und drücken sie 'Enter'");
        Scanner varibl1 = new Scanner(System.in);
        satz = varibl1.nextInt();
	System.out.println(varibl1.nextLine());
        return satz;
    }
    
    /**
     * Liefert den aktuellen Kontostand.
    */
    public int gibstand()
    {
        return stand;
    }
       
    /**
     * Berechnet den aktuellen Zins.
     */
    public int zinsBerechnung()
    {
        int zins = (stand * satz / 100);
        return zins;
    }
    
    /**
     * Gibt Informationen zum Konto aus.
     */
    public void kontoinformationen()
    {
        System.out.println("Informationen zum Konto: ");
        System.out.println("Kontoinhaber: " + inhaber);
        System.out.println("Kontostand: " + stand);
        System.out.println("Zinssatz " + satz + "%");
    }
}

