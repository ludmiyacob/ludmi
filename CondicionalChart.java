package ProyectoNuevo;

import java.io.IOException;

public class CondicionalChart {
    public static void main(String[] args) throws IOException {

        char car1,car2;
        System.out.print("Introduzca primer caracter: ");
        car1 = (char) System.in.read(); //lee un caracter

        System.in.read(); //saltar el intro que ha quedado en el buffer

        car2 = 'A';

        if (car1 == car2)
            System.out.println("Son iguales");
        else
            System.out.println("No son iguales");

    }
}
