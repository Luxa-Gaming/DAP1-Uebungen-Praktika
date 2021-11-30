package de.marquardt.main.praktikum.rekursion;

public class WerteAufsummieren {
    public static void main(String[] args) {
        System.out.println("Main Methode der Klasse WerteAufsummieren wurde aufgerufen.");
    }

    public static int sumUpNegatives( int[] arr, int n ) {
        int summe = 0;
        if(0<=n && arr.length>n) {
            if (arr[n] < 0) {
                summe = summe + arr[n];
            }
            return summe + sumUpNegatives(arr, n - 1);
        }

        return summe;
    }

}
