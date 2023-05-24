package ProyectoNuevo;

import java.util.Scanner;
public class RestoInvert {
    public static void main(String args[]){
        int num, div;
        Scanner teclado = new Scanner(System.in);
        num = teclado.nextInt();
        div = teclado.nextInt();

        if(! ((num%div) != 0) ) { //operador not (!) o inversor y operador distinto (!=)
            System.out.printf("\n\n%d es divisibles por %d ", num, div);
        }else{
            System.out.printf("\n\n%d no es divisible por %d ",num, div);
        }
    }
}
