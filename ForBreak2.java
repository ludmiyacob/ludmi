package ProyectoNuevo;

public class ForBreak2 {
    public static void main(String args[]){
        for (int contador = 1; contador <= 10; contador++) {
            System.out.println("El valor de contador es :" + contador); //incluye el 5
            if (contador == 5) {
                continue; //salta el valor en condicion
            }

            System.out.println("El valor de contador es :" + contador); //cuenta hasta 4 salta a 6
            //no incluye el 5
        }
    }
}
