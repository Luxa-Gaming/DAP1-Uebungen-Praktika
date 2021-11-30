package de.marquardt.main;

import de.marquardt.main.otherPractice.rekursion.Fakultaet;
import de.marquardt.main.praktikum.rekursion.*;


public class Main {
    public static void main(String [] args) {
        int[] Aufsummieren = new int[] { -1, 2, 3, 3, -4, 4, 1, 1, -1, 0, 6, -9, 10 };

        // System.out.println("Quersumme von: " + Quersumme.digitSum(5555));
        // System.out.println("Potenz: " + Potenz.power(12, 4));
        // System.out.println("Fakultät: " + Fakultaet.fakultaet(5));
        System.out.println("Aufsummieren: " + WerteAufsummieren.sumUpNegatives(Aufsummieren, 9));

    }

}
