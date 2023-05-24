package ProyectoNuevo;

public class ForDoble {
    public static void main(String args[]){
        int respuesta;
        int FILA = 10; //si coloco uno 1 solo saldra la fila como uno
        int COLUMNA = 10; // si coloco 10 recorrera de 1 a 10 en columna

        for (int contador1 = 1; contador1 <= FILA; contador1++) {
            for (int contador2 = 1; contador2 <= COLUMNA; contador2++){

                respuesta = contador1 * contador2;
                System.out.println(contador1 + " x " + contador2 + " = " + respuesta);
            }
            System.out.println("FIN!!!");
        }
    }
}
