package ProyectoNuevo;
//se desea clasificar a los socios de un club por edades de la siguiente manera:
//infantil (menor a 14), cadete(14 y 20), activo(21 y 59),
//senior(60 o mas)
public class Escalonador {
    public static void main(String args[]){
        int edad =34; //una sola entrada a comparar
        if (edad > 59) {
            System.out.println("socio senior: " + edad);
        } else if (edad > 20) {
            System.out.println("socio activo: " + edad);
        } else if (edad > 13) {
            System.out.println("socio cadete: " + edad);
        }else{
            System.out.println("socio infantil: " + edad);

        }
        }
    }

