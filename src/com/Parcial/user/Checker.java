package com.Parcial.user;

import java.util.Scanner;


// Patron de diseno singleton
public class Checker {

    private final Scanner numScanner = new Scanner(System.in);
    private final Scanner stringScanner = new Scanner(System.in);
    private final String error = "Valor incorrecto, ingrese nuevamente: ";


    private static Checker checker;

    public static Checker getInstance() {
        if (checker == null) {
            checker = new Checker();
        }
        return checker;
    }

    public int checkedInt(int maximo) {

        while (true) {
            try {
                int verifiedInt = new Scanner(System.in).nextInt();
                if (verifiedInt >= 1 && verifiedInt <= maximo) {
                    return verifiedInt;
                } else {
                    System.out.println(error);
                }
            } catch (Exception e) {
                System.out.println(error);
            }
            numScanner.nextLine();
        }

    }


    public float checkedFloat() {
        while (true) {
            try {
                return numScanner.nextInt();
            } catch (Exception e) {
                System.out.println(error);
            }
            ;
        }

    }


}
