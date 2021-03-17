package com.juanortiz.user;

import java.util.Scanner;

public class Checker {

    private final Scanner numScanner = new Scanner(System.in);
    private final Scanner stringScanner = new Scanner(System.in);
    private final String error = "Valor incorrecto, ingrese nuevamente: ";


    public int checkedInt(int maximo) {

        while (true){
            try {
                int verifiedInt = numScanner.nextInt();
                if (verifiedInt >= 1 && verifiedInt <= maximo){
                    numScanner.nextLine();
                    return verifiedInt;
                }else {
                    System.out.println(error);
                }
            }catch (Exception e){
                System.out.println(error);
            }
            numScanner.nextLine();
        }

    }

    public float checkedFloat() {

        while (true){
            try {
                return numScanner.nextInt();
            }catch (Exception e){
                System.out.println(error);
            }
            numScanner.nextLine();
        }

    }


}
