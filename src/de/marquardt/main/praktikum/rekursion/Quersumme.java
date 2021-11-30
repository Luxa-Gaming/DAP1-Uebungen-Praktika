package de.marquardt.main.praktikum.rekursion;

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
