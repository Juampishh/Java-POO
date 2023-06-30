public class Racional {
    private int numerador; // Variable para almacenar el numerador
    private int denominador; // Variable para almacenar el denominador

    // Método para asignar el valor del numerador
    public void asignaNumerador(int x) {
        numerador = x;
    }

    // Método para asignar el valor del denominador
    public void asignaDenominador(int y) {
        if (y != 0) {
            denominador = y;
        } else {
            System.out.println("Error: El denominador no puede ser cero.");
        }
    }

    // Método para imprimir el número racional en el formato numerador/denominador
    public void imprimir() {
        System.out.println(numerador + "/" + denominador);
    }

    // Método toString para obtener una representación en formato String del número racional
    public String toString() {
        return numerador + "/" + denominador;
    }

    // Método para realizar la suma de dos números racionales
    public Racional suma(Racional b) {
        Racional resultado = new Racional();
        resultado.numerador = (numerador * b.denominador) + (b.numerador * denominador);
        resultado.denominador = denominador * b.denominador;
        return resultado;
    }

    public Racional resta(Racional b) {
        Racional resultado = new Racional();
        resultado.numerador = (numerador * b.denominador) - (b.numerador * denominador);
        resultado.denominador = denominador * b.denominador;
        return resultado;
    }


    // Método para verificar si dos números racionales son iguales
    public boolean esIgual(Racional b) {
        return (numerador == b.numerador && denominador == b.denominador);
    }
}



