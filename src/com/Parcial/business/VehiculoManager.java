package com.Parcial.business;

import com.Parcial.entity.*;
import com.Parcial.entity.patronBuilderParcialDos.Avion;
import com.Parcial.entity.patronBuilderParcialDos.AvionBuilder;
import com.Parcial.entity.Carro;
import com.Parcial.entity.Yate;
import com.Parcial.user.Checker;
import com.Parcial.user.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



// Patron de diseño Factory Method
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
    // Patron utilizado : Builder
    public static void selectOptionVehicle() {

        //Patron utilizado Singleton
        Checker checker = Checker.getInstance();

        int option = checker.checkedInt(4);
        Menu.crearVehiculoMensajes(1);
        String referencia = new Scanner(System.in).nextLine();
        Color color = Menu.seleccionarColor();
        Menu.crearVehiculoMensajes(2);
        float velocidadMaxima = checker.checkedFloat();
        switch (option) {

            case 1:
                //Aplicación de patron de diseño Builder, ubicado en el paquete: src/com/Parcial/entity/patronBuilderParcialDos
                Menu.crearVehiculoMensajes(3);
                float alturaMaxima = checker.checkedFloat();
                Avion avion = new AvionBuilder()
                        .referencia(referencia)
                        .color(color)
                        .velocidadMaxima(velocidadMaxima)
                        .altitudMaxima(alturaMaxima)
                        .build();
                garaje.add(avion);
                Menu.vehiculoCreado(avion);
                Menu.showMenu();
                break;
            case 2:

                Menu.crearVehiculoMensajes(4);
                float pesoMaximo = checker.checkedFloat();
                //FactoryMethod
                Yate yate = new Yate(referencia, color, velocidadMaxima, pesoMaximo);
                garaje.add(yate);
                Menu.vehiculoCreado(yate);
                Menu.showMenu();
                break;
            case 3:
                int numeroPuertas = checker.checkedInt(5);
                Carro carro = new Carro(referencia, color, velocidadMaxima, numeroPuertas);
                garaje.add(carro);
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

    public static void mostrarGaraje() {
        Menu.imprimirGaraje(garaje);
    }


}
