package de.marquardt.main.praktikum.rekursion;

public class Inhaltsueberpruefung {
    public static void main(String[] args) {
        System.out.println("Main Methode der Klasse Inhaltsueberpruefung wurde aufgerufen.");


    }

    public static boolean contains(int[] arr, int i, int x) {
        if (0 <= i && arr.length > i) {
            if (arr[i] != x) {
                return contains(arr, i - 1, x);
            } else {
                return true;
            }
        }
        return false;
    }
}
