package ProyectoNuevo;

import java.util.Scanner;

public class CarArt {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un caracter: ");

        char caracter = teclado.next().charAt(0); //asegura que la posicion sea (0)
        //o sea el primer caracter ingresado

        System.out.println("Su caracter ingresado es: " + caracter);
    }
}
