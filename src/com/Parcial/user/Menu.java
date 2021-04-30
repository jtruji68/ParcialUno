package com.Parcial.user;

import com.Parcial.business.VehiculoManager;
import com.Parcial.entity.Color;
import com.Parcial.entity.Vehiculo;

import java.util.List;

public class Menu {

    public static void welcomeMessage() {
        System.out.println("\nBIENVENIDO AL PROGRAMA DE GESTION DE VEHICULOS\n");
    }


    public static void showMenu() {
        System.out.println("--------MENU PRINCIPAL--------" +
                "\n ++ Ingrese alguna de las siguientes opciones. " +
                "\n 1. Agregar Vehículo." +
                "\n 2. Mostrar Garaje." +
                "\n 3. Salir.");

        VehiculoManager.selectOption();
    }


    public static void menuVehiculo() {
        System.out.println("--------TIPO DE VEHICULO--------" +
                "\n ++ Ingrese alguna de las siguientes opciones. " +
                "\n 1. Avion." +
                "\n 2. Yate." +
                "\n 3. Carro." +
                "\n 4. Salir.");

        VehiculoManager.selectOptionVehicle();
    }

    public static Color seleccionarColor() {
        System.out.println("--------Color--------" +
                "\n ++ Ingrese alguna de las siguientes opciones. " +
                "\n 1. Negro." +
                "\n 2. Blanco." +
                "\n 3. Azul." +
                "\n 4. Verde." +
                "\n 5. Gris.");

        return VehiculoManager.selectColor();
    }

    public static void vehiculoCreado(Vehiculo vehiculo) {
        System.out.println("se ha creado el vehiculo " + vehiculo.getReferencia() + " .");
    }

    public static void crearVehiculoMensajes(int mensaje) {

        String mess;
        switch (mensaje) {

            case 1:
                mess = "Ingresa la referencia del vehiculo: ";
                break;
            case 2:
                mess = "Ingresa la velocidad maxima: ";
                break;
            case 3:
                mess = "Ingresa la altura maxima: ";
                Menu.menuVehiculo();
                break;
            case 4:
                mess = "Ingresa el peso maximo: ";
                break;

            case 5:
                mess = "Ingresa el numero de puertas: ";
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + mensaje);
        }
        System.out.println(mess);
    }


    public static void imprimirGaraje(List<Vehiculo> garaje){

        System.out.println("-----GARAJE-----");
         for (Vehiculo vehiculo :
                garaje) {
             System.out.println(vehiculo.toString() + "\n ---");
        }

        System.out.println("--------------");
    }


    public static void ExitMessage(){
        System.out.println("Adios");
    }
}
