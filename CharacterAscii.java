package ProyectoNuevo;

public class CharacterAscii {
    public static void main(String args[]) throws java.io.IOException {

        System.out.print("Introducir un caracter: ");

        char entrada;
        entrada = (char) System.in.read(); //returna codigo ascii de 1 caracter
        System.out.println("El caracter tipeado es: " + entrada); //podria imprimir los caracteres

    }
}
