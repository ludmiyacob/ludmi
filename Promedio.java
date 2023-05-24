package ProyectoNuevo;

public class Promedio { //promedia un entero (6)
    public static void main(String args[]){
        int num1 =5;
        int num2 =6;
        int num3 =7;
        int promedio = 0; //el promedio sera un entero por su declaracion

        promedio = (num1+num2+num3)/3;//no esta casteado el promedio
        if(promedio >= 4) {
            System.out.println("El alumno aprobo: " + promedio);
        }else{
            System.out.println("El alumno reprobo: "+promedio);
        }
    }

}
