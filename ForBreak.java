package ProyectoNuevo;

public class ForBreak {
    public static void main(String args[]) {
        for (int contador = 1; contador <= 10; contador++) {

            System.out.println("El valor de contador es :" + contador);

            if (contador == 5) {
                break; //hace un pare u stop en 5
            }

            //System.out.println("El valor de contador es :"+contador); //lo hace en 4
        }
    }
}
