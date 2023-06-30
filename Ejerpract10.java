import java.util.Random;
public class Ejerpract10 {
//Crear una clase llamada Persona que siga las siguientes atributos: nombre, edad, DNI, sexo (H
//hombre, M mujer), peso y altura. No se debe permitir acceder directamente a estas.
//Se implementarán varios constructores:
//1. Un constructor por defecto.
//2. Un constructor con el nombre, edad y sexo, el resto por defecto.
//3. Un constructor con todos los atributos como parámetro.
//Los métodos que se implementarán son:
//1. calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en
//m)), si esta fórmula devuelve un valor menor que 20, la función devuelve un -1, si
//devuelve un número entre 20 y 25 (incluidos), significa que está por debajo de su peso
//ideal la función devuelve un 0 y si devuelve un valor mayor que 25 significa que tiene
//sobrepeso, la función devuelve un 1.
//2. esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
//3. comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es
//correcto, será H. No será visible al exterior.
//4. toString(): devuelve toda la información del objeto.
//5. generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de este su número
//su letra correspondiente. Este método será invocado cuando se construya el objeto.
//Puedes dividir el método para que te sea más fácil. No será visible al exterior.
//6. Métodos set de cada parámetro, excepto de DNI.
//Crea una aplicación que haga lo siguiente:
//1. Pide por teclado el nombre, la edad, sexo, peso y altura.
//2. Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables
//pedidas por teclado, el segundo objeto obtendrá todos los anteriores menos el peso y la
//altura y el último por defecto, para este último utiliza los métodos set para darle a los
//atributos un valor.
//3. Para cada objeto, deberá comprobar si está en su peso ideal, tiene sobrepeso o por
//debajo de su peso ideal con un mensaje.
//4. Indicar para cada objeto si es mayor de edad.
//5. Por último, mostrar la información de cada objeto.



    static class Persona {
        private String nombre;
        private int edad;
        private String DNI;
        private char sexo;
        private double peso;
        private double altura;

        // Constructor por defecto
        public Persona() {
            this.nombre = "";
            this.edad = 0;
            this.sexo = 'H';
            this.peso = 0.0;
            this.altura = 0.0;
            generarDNI();
        }

        // Constructor con nombre, edad y sexo, el resto por defecto
        public Persona(String nombre, int edad, char sexo) {
            this.nombre = nombre;
            this.edad = edad;
            this.sexo = sexo;
            this.peso = 0.0;
            this.altura = 0.0;
            generarDNI();
        }

        // Constructor con todos los atributos como parámetro
        public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
            this.nombre = nombre;
            this.edad = edad;
            this.DNI = DNI;
            this.sexo = sexo;
            this.peso = peso;
            this.altura = altura;
        }

        // Métodos públicos

        public int calcularIMC() {
            double imc = peso / (altura * altura);
            if (imc < 20) {
                return -1;
            } else if (imc >= 20 && imc <= 25) {
                return 0;
            } else {
                return 1;
            }
        }

        public boolean esMayorDeEdad() {
            return edad >= 18;
        }

        public String toString() {
            return "Nombre: " + nombre +
                    "\nEdad: " + edad +
                    "\nDNI: " + DNI +
                    "\nSexo: " + sexo +
                    "\nPeso: " + peso +
                    "\nAltura: " + altura;
        }

        // Métodos privados

        private void comprobarSexo(char sexo) {
            if (sexo == 'H' || sexo == 'M') {
                this.sexo = sexo;
            } else {
                this.sexo = 'H';
            }
        }

        private void generarDNI() {
            Random random = new Random();
            int numero = random.nextInt(90000000) + 10000000;
            int resto = numero % 23;
            char letra = obtenerLetraDNI(resto);
            this.DNI = String.valueOf(numero) + letra;
        }

        private char obtenerLetraDNI(int resto) {
            String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
            return letras.charAt(resto);
        }

        // Métodos set

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public void setSexo(char sexo) {
            comprobarSexo(sexo);
        }

        public void setPeso(double peso) {
            this.peso = peso;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }
    }

        public static void main(String[] args) {
            Persona persona1 = new Persona();
            persona1.setNombre("Juan");
            persona1.setEdad(25);
            persona1.setSexo('H');
            persona1.setPeso(70.5);
            persona1.setAltura(1.75);

            System.out.println("Información de persona1:");
            System.out.println(persona1.toString());
            System.out.println("IMC: " + persona1.calcularIMC());
            System.out.println("Es mayor de edad: " + persona1.esMayorDeEdad());

            System.out.println();

            Persona persona2 = new Persona("Ana", 30, 'M');
            persona2.setPeso(55.0);
            persona2.setAltura(1.60);

            System.out.println("Información de persona2:");
            System.out.println(persona2.toString());
            System.out.println("IMC: " + persona2.calcularIMC());
            System.out.println("Es mayor de edad: " + persona2.esMayorDeEdad());
        }
    }





