package ProyectoNuevo;

public class DoubleFloatC {//estilo lenguaje c++
    public static void main(String args[]){
        double num = 2.2;//double num = 2.2f; es float, ok
                        //float num = 2.2; es double, ilegal
                       //float tiene 32bits y double 64 bits no hay problema
                      //de double(64) a float(32) si hay diferencia en tamaño
        System.out.printf("Numero: %f \n",num);// seria: double = 2.2f
    }
}
