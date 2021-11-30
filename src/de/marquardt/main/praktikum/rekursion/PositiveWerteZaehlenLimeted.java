package de.marquardt.main.praktikum.rekursion;

public class PositiveWerteZaehlenLimeted {
    public static void main(String[] args) {
        System.out.println("Main Methode der Klasse PositiveWerteZaehlenLimeted wurde aufgerufen.");

    }

    public static int countPositivesLimited( int[] arr, int d, int t ) {
        int summe = 0;
        if (d<=t && t<arr.length) {
            if (arr[d] > 0) {
                summe++;
            }
            return summe + countPositivesLimited(arr, d + 1, t);
        }
        return summe;
    }

}
