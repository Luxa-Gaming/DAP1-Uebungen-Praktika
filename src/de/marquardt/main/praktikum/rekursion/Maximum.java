package de.marquardt.main.praktikum.rekursion;

public class Maximum {
    public static void main(String[] args) {
        System.out.println("Main Methode der Klasse Maximum wurde aufgerufen.");
    }

    public static int maximum(int[] arr, int i) {
        if (0 <= i && arr.length > i) {
            int v = maximum(arr, i-1);
            if(arr[i]> v) {
                return arr[i];
            }
            return v;
        } else {
            return arr[0];
        }
    }
}

//return Math.max(arr[i], maximum(arr, i - 1)); // Es wird Rekursiv die Methode wieder aufgerufen.
