import java.util.Random;
import java.util.Scanner;
public class Ejer11 {

//Crear una clase llamada Password que siga las siguientes condiciones:
//1. Que tenga los atributos longitud y contraseña . Por defecto, la longitud sera de 8.
//Los constructores serán los siguiente:
//1. Un constructor por defecto.
//2. Un constructor con la longitud. Generar una contraseña aleatoria con esa longitud.
//Los métodos que implementa serán:
//1. esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe tener mas
//de 2 mayúsculas, mas de 1 minúscula y mas de 5 números.
//2. generarPassword(): genera la contraseña del objeto con la longitud que tenga.
//3. Método get para contraseña y longitud.
//4. Método set para longitud.
//Crear una aplicación que haga lo siguiente:
//1. Crea un array de Passwords con el tamaño que tu le indiques por teclado.
//2. Crea un bucle que cree un objeto para cada posición del array.
//3. Indica también por teclado la longitud de los Passwords (antes de bucle).
//4. Crea otro array de booleanos donde se almacene si el password del array de Password
//es o no fuerte (usa el bucle anterior).
//5. Al final, muestra la contraseña y si es o no fuerte (usa el bucle anterior). Usa este simple
//formato:
//contraseña1 valor_booleano1
//contraseña2 valor_bololeano2

    static class Password {
        private int longitud;
        private String contraseña;

        public Password() {
            longitud = 8;
            generarPassword();
        }

        public Password(int longitud) {
            this.longitud = longitud;
            generarPassword();
        }

        public boolean esFuerte() {
            int mayusculas = 0;
            int minusculas = 0;
            int numeros = 0;

            for (int i = 0; i < contraseña.length(); i++) {
                char c = contraseña.charAt(i);
                if (Character.isUpperCase(c)) {
                    mayusculas++;
                } else if (Character.isLowerCase(c)) {
                    minusculas++;
                } else if (Character.isDigit(c)) {
                    numeros++;
                }
            }

            return mayusculas > 2 && minusculas > 1 && numeros > 5;
        }

        public void generarPassword() {
            Random random = new Random();
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < longitud; i++) {
                int type = random.nextInt(3);
                char c;

                switch (type) {
                    case 0: // Uppercase letter
                        c = (char) (random.nextInt(26) + 'A');
                        break;
                    case 1: // Lowercase letter
                        c = (char) (random.nextInt(26) + 'a');
                        break;
                    case 2: // Digit
                        c = (char) (random.nextInt(10) + '0');
                        break;
                    default:
                        c = ' ';
                }

                sb.append(c);
            }

            contraseña = sb.toString();
        }

        public String getContraseña() {
            return contraseña;
        }

        public int getLongitud() {
            return longitud;
        }

        public void setLongitud(int longitud) {
            this.longitud = longitud;
            generarPassword();
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce la longitud de los passwords: ");
            int longitudPasswords = scanner.nextInt();

            System.out.print("Introduce el tamaño del array de Passwords: ");
            int tamañoArray = scanner.nextInt();

            Password[] passwords = new Password[tamañoArray];
            boolean[] esFuerteArray = new boolean[tamañoArray];

            for (int i = 0; i < tamañoArray; i++) {
                passwords[i] = new Password(longitudPasswords);
                esFuerteArray[i] = passwords[i].esFuerte();
            }

            System.out.println("Contraseña     Fuerte");
            System.out.println("---------------------");

            for (int i = 0; i < tamañoArray; i++) {
                System.out.println(passwords[i].getContraseña() + "     " + esFuerteArray[i]);
            }
        }
    }

}
