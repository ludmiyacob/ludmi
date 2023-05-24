package ProyectoNuevo;

public class OpNull{
    public static void main(String args[]) {
        promptUser ();
    }
    private static void promptUser(){//metodo que ejecuta si el valor entrado es null o vacio
        String name = "pablo"; //si dejo las " " sin argumento dira no entro en su nombre (no colocar null)
        if(name == null || name.trim().isEmpty()) { //funcion trim().isEmpty()
            System.out.println("No entro su nombre");
        }else{
            System.out.println("Entro su nombre: " + name );
        }
    }
}
