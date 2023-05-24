package ProyectoNuevo;

public class ForInterator {
    public static void main(String args[]){

        int contador;
        int suma = 0;

        for (contador = 0; contador <=5; contador++){

            System.out.println("contador:["+ contador + "]"); //muestra el contador

            suma = suma + contador;
        }
        System.out.println("La suma del acumulador es:" + suma);
    }
}
