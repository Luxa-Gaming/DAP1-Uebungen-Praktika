package de.marquardt.main.praktikum.rekursion;

public class GleicheWerte {
    public static void main(String[] args) {
        System.out.println("Main Methode der Klasse GleicheWerte wurde aufgerufen.");
    }
    public static boolean contentCheck( char[] arr1, char[] arr2, int i ) {
        if (0 <= i && arr1.length > i && arr2.length > i) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }else{
                    return contentCheck(arr1, arr2, i - 1);
                }
            }
        return true;
    }
}
