package ProyectoNuevo;

import java.util.*;
public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Numero;
        System.out.print("Introduzca Numero entero: ");
        Numero = sc.nextInt(); //aqui se introduce el valor tipo entero
        if(Numero%2==0) { //numeros pares son divisibles por 2 y resto cero
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }
    }
}
