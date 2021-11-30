package de.marquardt.main.praktikum.rekursion;

public class SortierungPruefen {
    public static void main(String[] args) {
        System.out.println("Main Methode der Klasse SortierungPruefen wurde aufgerufen.");
    }

    public static boolean isSorted( int[] arr, int i ) {
        if (0 <= i && arr.length > i) {
            if( i != 0) {
                if (arr[i] > arr[i - 1]) {
                    return isSorted(arr, i-1);
                }else{
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}

