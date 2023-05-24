package ProyectoNuevo;

public class Cuadratica { //ax^2+bx+c=0
    public static void main(String args[]){

        double a = 1; //1(r), 1(ns)
        double b = 1; //-3(r), 1(ns)
        double c = 2; //2(r), 2(ns)

        double x1;
        double x2;

        if(Math.pow(b, 2)- (4 * a * c) > 0) { //discriminante

            x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
            x2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

            System.out.println("Tiene dos soluciones x1 " + x1 + " y x2: " + x2);
        } else if (Math.pow(b, 2)- (4 * a * c)==0) {

                x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
                x2 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

                System.out.println("La solucion es real x1: " + x1 + "y x2: " + x2);
            } else if (Math.pow(b , 2)- (4 * a * c)==0){

                x1 =(-b + Math.sqrt(Math.pow(b, 2)- (4 * a * c))) / (2 * a);
                x2 = (-b + Math.sqrt(Math.pow(b, 2)- (4 * a * c))) / (2 * a);

                System.out.println("no tiene solucion real x1: " + x1 + " y x2: " + x2);

            }
            }

    }

