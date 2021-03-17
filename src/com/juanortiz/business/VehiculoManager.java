package com.juanortiz.business;

import com.juanortiz.entity.*;
import com.juanortiz.user.Checker;
import com.juanortiz.user.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehiculoManager {

    private static final int maxVehiculos = 10;
    static List<Vehiculo> garaje = new ArrayList<Vehiculo>(maxVehiculos);

    // iniciar el programa
    public static void initialize() {
        Menu.welcomeMessage();
        Menu.showMenu();
    }

    // seleccionar agregar vehiculo mostrar garaje o salir
    public static void selectOption() {
        Checker checker = new Checker();

        int option = checker.checkedInt(3);
        switch (option) {
            case 1:
                Menu.menuVehiculo();
                break;
            case 2:
                VehiculoManager.mostrarGaraje();
                Menu.showMenu();
                break;
            case 3:
                Menu.ExitMessage();
                System.exit(0);
        }
    }

    // seleccionar tipo de vehiculo y crear
    public static void selectOptionVehicle() {
        Checker checker = new Checker();
        Scanner scanner = new Scanner(System.in);

        Menu.crearVehiculoMensajes(1);
        String referencia = scanner.nextLine();
        Color color = Menu.seleccionarColor();
        Menu.crearVehiculoMensajes(2);
        float velocidadMaxima = checker.checkedFloat();

        int option = checker.checkedInt(4);

        switch (option) {

            case 1:
                Menu.crearVehiculoMensajes(3);
                float alturaMaxima = checker.checkedFloat();
                Avion avion = new Avion(referencia,color,velocidadMaxima,alturaMaxima);
                garaje.add(avion);
                Menu.vehiculoCreado(avion);
                Menu.showMenu();
                break;
            case 2:
                Menu.crearVehiculoMensajes(4);
                float pesoMaximo = checker.checkedFloat();
                Yate yate = new Yate(referencia,color,velocidadMaxima,pesoMaximo);
                garaje.add(yate);
                Menu.vehiculoCreado(yate);
                Menu.showMenu();
                break;
            case 3:
                int numeroPuertas = checker.checkedInt(5);
                Carro carro = new Carro(referencia,color,velocidadMaxima,numeroPuertas);
                Menu.vehiculoCreado(carro);
                Menu.showMenu();
                break;
            case 4:
                System.out.println("salir al menu");
                Menu.showMenu();
                break;

        }


    }

    public static Color selectColor() {
        Checker checker = new Checker();

        int option = checker.checkedInt(5);
        switch (option) {
            case 1:
                return Color.NEGRO;
            case 2:
                return Color.BLANCO;
            case 3:
                return Color.AZUL;
            case 4:
                return Color.VERDE;
            case 5:
                return Color.GRIS;

        }
        return null;
    }

    public static void mostrarGaraje(){
       Menu.imprimirGaraje(garaje);
    }



}
