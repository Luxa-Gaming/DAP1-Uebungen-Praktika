package de.marquardt.main.praktikum.rekursion;

public class PositiveWerteZaehlen {
    public static void main(String[] args) {
        System.out.println("Main Methode der Klasse PositiveWerteZaehlen wurde aufgerufen.");
    }

    public static int countPositives( int[] arr, int n ) {
        int summe = 0; // Variable Summe initialisieren
        if (0 <= n && arr.length > n) { // Überprüfen ob n größer oder gleich 0 ist
            // und ob die Länge des Arrays kleiner ist als n.
            if (arr[n] > 0) { //Schauen, ob der Wert aus dem Array, größer als 0 ist.
                summe++; // Summe um einen hochzählen.
            }
            return summe + countPositives(arr, n - 1); // Summe zum rekursiven Aufruf addieren.
        }

        return summe; // Falls die Bedingungen nicht erfüllt sind, wird die Summe zurückgegeben.
    }

}
