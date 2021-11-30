package de.marquardt.main;

import de.marquardt.main.otherPractice.rekursion.*;
import de.marquardt.main.praktikum.rekursion.*;


public class Main {
    public static void main(String [] args) {
        int[] findNumbers = new int[] { -1, 2, 3, 3, -4, 4, 1, 1, -1, 0, 6, -9, 10 };
        int[] containmentArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int[] sorted = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int[] unsorted = new int[] { -1, 2, 3, 3, -4, 4, 1, 1, -1, 0, 6, -9, 10 };


        System.out.println("Quersumme von: " + Quersumme.digitSum(5555));
        System.out.println("Potenz: " + Potenz.power(12, 4));
        System.out.println("Fakultät: " + Fakultaet.fakultaet(5));
        System.out.println("Aufsummieren: " + WerteAufsummieren.sumUpNegatives(findNumbers, 5));
        System.out.println("Anzahl positiver Werte: " + PositiveWerteZaehlen.countPositives(findNumbers, 5));
        System.out.println("Maximum: " + Maximum.maximum(findNumbers, 12));
        System.out.println("Inhaltsüberprüfung ist: " + Inhaltsueberpruefung.contains(containmentArray, 10, 5));
        System.out.println("Sortiert: " + SortierungPruefen.isSorted(sorted, 10));
        System.out.println("Anzahl positiver Werte in einem bestimmten Bereich: " + PositiveWerteZaehlenLimeted.countPositivesLimited(findNumbers, 0, 5));

    }

}
