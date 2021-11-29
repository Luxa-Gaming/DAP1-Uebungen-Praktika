package de.marquardt.main.praktikum.rekursion;

public class Potenz {
    public static void main(String[] args) {
            System.out.println("Main Methode der Klasse Potenz wurde aufgerufen.");
    }

    public static int power(int a, int n) {
        // Variable a = Zahl die potenziert werden soll
        // Variable n = Potenz auf die a potenziert werden soll

        if(n==1) { // Wenn die Potenz (n) kleiner oder gleich 1 ist, wird a einfach zurückgegeben.
            return a;
        }
        return a * power(a, n-1); // Rekursiver Aufruf der Methode Power in der a mit n multipliziert wird
        // und von n einer abgezogen wird.

    }

}
