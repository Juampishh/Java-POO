public class Main {
    public static void main(String[] args) {
        // Crear dos objetos de la clase Racional
        Racional racional1 = new Racional();
        Racional racional2 = new Racional();

        // Asignar valores a los numeradores y denominadores de los objetos
        racional1.asignaNumerador(1);
        racional1.asignaDenominador(2);

        racional2.asignaNumerador(1);
        racional2.asignaDenominador(3);
        System.out.println("--------- Programa para operar sobre numeros racionales -----------");
        System.out.println("-------------------- Merino Juan Pablo -------------------------");
        System.out.println("");

        // Imprimir los números racionales
        System.out.print("Racional 1: ");
        racional1.imprimir(); // Imprime: 1/2

        System.out.print("Racional 2: ");
        racional2.imprimir(); // Imprime: 1/3

        // Realizar la suma de los números racionales
        Racional suma = racional1.suma(racional2);

        System.out.print("Suma: ");
        suma.imprimir(); // Imprime: 5/6

        // Realizar la resta de los números racionales
        Racional resta = racional1.resta(racional2);

        System.out.print("Resta: ");
        resta.imprimir(); // Imprime: 1/6

        // Verificar si los números racionales son iguales
        boolean iguales = racional1.esIgual(racional2);

        System.out.println("¿Son iguales? " + iguales); // Imprime: ¿Son iguales? false
    }
}
