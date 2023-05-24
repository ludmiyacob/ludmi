package ProyectoNuevo;

public class Anidado {
    public static void main(String args []) {
        int scanner = 1; //introducir manualmente valores de (1 a 4)una sola entrada
        int num1 = 8;
        int num2 = 4;
        int resultado = 0;
        //operaciones matematicas a seleccion
        if ( scanner== 1) {
            resultado = num1 + num2;
            System.out.println("El resultado de la suma es: "+ resultado);
        }else if (scanner ==2) {
            resultado = num1 - num2;
            System.out.println("El resultado de la resta es: "+ resultado);
        }else if(scanner ==3) {
            resultado = num1 * num2;
            System.out.println("El resultado de la multiplicacion es: " + resultado);
        }else if(scanner ==4){
            resultado = num1/num2;
            System.out.println("El resultado de la division es: "+resultado);

        }
    }
}
