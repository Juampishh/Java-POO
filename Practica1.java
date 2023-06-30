import java.util.ArrayList;
import java.util.Scanner;

public class Practica1 {

    public static class Cuenta {
        private String titular;
        private double cantidad;

        // Constructor con titular y cantidad
        public Cuenta(String titular, double cantidad) {
            this.titular = titular;
            this.cantidad = cantidad;
        }

        // Constructor sin parámetros
        public Cuenta() {
            this.titular = "";
            this.cantidad = 0.0;
        }

        // Métodos getter y setter para el atributo "titular"
        public String getTitular() {
            return titular;
        }

        public void setTitular(String titular) {
            this.titular = titular;
        }

        // Métodos getter y setter para el atributo "cantidad"
        public double getCantidad() {
            return cantidad;
        }


        public double setCantidad(double cantidad){
            if(cantidad < 0){
                System.out.println("La cantidad ingresada es menor a 0");
                return 0;
            }else{
                this.cantidad += cantidad;
                System.out.println("Se actualizo la cantidad: "+ this.cantidad);
                return this.cantidad;
            }
        }
        public double removeCantidad (double cantidad){
            if(cantidad < 0){
                System.out.println("La cantidad ingresada es menor a 0");
                return 0;
            }else{
                this.cantidad = this.cantidad - cantidad;
                System.out.println("Se actualizo la cantidad: "+ this.cantidad);
                return cantidad;
            }
        }
    }

    public static void main(String[] args){
        Cuenta cuenta1 = new Cuenta("Juan Perez", 1000.0);

        // Obtener y mostrar el titular y la cantidad de la cuenta1
        System.out.println("Titular cuenta1: " + cuenta1.getTitular());
        System.out.println("Cantidad cuenta1: " + cuenta1.getCantidad());

        System.out.println("Ingrese la cantidad a cargar");
        Scanner inputCantidad = new Scanner(System.in);
        double cantidad = inputCantidad.nextDouble();
        cuenta1.setCantidad(cantidad);

        System.out.println("Ingrese la cantidad a retirar: ");
        Scanner inputRemove = new Scanner(System.in);
        double cantidadARemover = inputRemove.nextDouble();
        cuenta1.removeCantidad((cantidadARemover));
    }
}
