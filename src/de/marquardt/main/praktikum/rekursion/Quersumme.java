package de.marquardt.main.praktikum.rekursion;

/*
    public static int digitSum(int x) {
        int summe = 0;
        while(0 != x) {
            summe = summe + (x % 10);
            x = x / 10;
        }

        public static int fakultaet(int n) {
        if (n <= 1) {
            return 1;
        }else{
            return fakultaet(n-1)*n;
        }
    }

 */

public class Quersumme {
    public static void main(String[] args) {
        System.out.println("Main Methode der Klasse Quersumme wurde aufgerufen.");
    }

    public static int digitSum(int n) {
        if(n <= 9) { // Checken ob die Zahl mindestens 2 Stellen besitzt.
            return n; //Falls nicht, wird einfach die eingegebene Zahl zurückgegeben.
        }
            return n%10 + digitSum(n/10); // Die Zahl (n) wird mit Modulo 10 um eine Zehnerstelle reduziert
        // und dann mit dem rekursiven Aufruf der Methode digitSum (mit dem Übergabewert durch 10 geteilt) addiert.
    }

}
