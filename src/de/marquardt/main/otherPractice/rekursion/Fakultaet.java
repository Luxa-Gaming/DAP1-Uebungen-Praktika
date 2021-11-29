package de.marquardt.main.otherPractice.rekursion;

public class Fakultaet {
    public static void main(String[] args) {
        System.out.println("Main Methode der Klasse Fakultaet wurde aufgerufen.");
    }

    public static int fakultaet(int n) {
        if (n <= 1) { //Wenn die Variable (n) kleiner oder gleich 1 ist, wird n zurückgegeben.
            return 1;
        }else{
            return n * fakultaet(n-1); //Rekursiver Aufruf wobei n mit n-1 multipliziert wird.
        }
    }



}
