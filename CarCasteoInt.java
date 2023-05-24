package ProyectoNuevo;

public class CarCasteoInt { //su decimal es 65 lo cual (Alt + 65) y hexadecimal (0041)
    public static void main(String args[]){
        char ch = 'A';
        int chNumero = (int)ch;//castea a entero

        System.out.printf("ch:%c chNumero:%d chHex:%04x%n",ch,chNumero,chNumero); //muestra el ascii y hexadecimal
    }
}
