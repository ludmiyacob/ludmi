package ProyectoNuevo;

import java.util.Scanner;

public class DoWhileSwitch {
    public static void main(String args[]) {

        int opcion; //opcion elejida del menu

        Scanner teclado = new Scanner(System.in);

        do { //menu dentro del bucle
            System.out.println("1. Numeros del 1 al 5");// solo como mostrario
            System.out.print("Introduce una opcion: ");

            opcion = teclado.nextInt();//introducimos la opcion
        } while (opcion > 2); //se repite si es mayor a 2

        switch (opcion) {
            case 1:
            int contador = 0;
            int num = 5;
            while (contador <= num) {
                System.out.println("bucle while Numero:[" + contador + "]");
                contador = contador + 1;


            }
            break;

            default:
                System.out.println("Elige una opcion correcta.");


        }
    }
}
