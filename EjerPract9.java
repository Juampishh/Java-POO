import javax.swing.*;
import java.util.Scanner;

public class EjerPract9 {

    //Crear una clase Mate que describa el funcionamiento de la conocida bebida tradicional local. La
    //clase debe contener como miembros:
    //1. Un atributo para la cantidad de cebadas restantes hasta que se lava el mate
    //(representada por un número).
    //2. Un atributo para el estado (lleno o vacío).
    //3. El constructor debe recibir como parámetro n, la cantidad máxima de cebadas en base a
    //la cantidad de yerba vertida en el recipiente.
    //4. Un método cebar(), que llena el mate con agua. Si se intenta cebar con el mate lleno, se
    //debe imprimir un mensaje de error 'Cuidado! Te quemaste!'
    //5. Un método beber(), que vacía el mate y le resta una cebada disponible. Si se intenta
    //beber un mate vacío, se debe imprimir un mensaje de error 'El mate está vacío !'
    //6. Es posible seguir cebando y bebiendo el mate aunque no haya cebadas disponibles. En
    //ese caso la cantidad de cebadas restantes se mantendrá en 0, y cada vez que se
    //intente beber se debe imprimir un mensaje de aviso: 'Advertencia: el mate está lavado.'.
    //Crear una aplicación en donde se cree un objeto Mate y se puedan tomar mates.


    static class Mate {
        private int cebadasRestantes;
        private boolean lleno;

        public Mate(int n) {
            cebadasRestantes = n;
            lleno = false;
        }

        public void cebar() {
            if (lleno) {
                System.out.println("Cuidado! ¡Te quemaste!");
            } else {
                lleno = true;
                System.out.println("Mate llenado con agua.");
            }
        }

        public void beber() {
            if (!lleno) {
                System.out.println("El mate está vacío !");
            } else {
                if (cebadasRestantes == 0) {
                    System.out.println("Advertencia: el mate está lavado.");
                } else {
                    cebadasRestantes--;
                    System.out.println("Tomando mate...");
                    if (cebadasRestantes == 0) {
                        System.out.println("El mate se ha lavado.");
                    }
                }
                lleno = false;
            }
        }
    }


        public static void main(String[] args) {
            Mate mate = new Mate(5);
            mate.cebar();
            mate.beber();
            mate.cebar();
            mate.beber();
            mate.beber();
            mate.cebar();
            mate.beber();
            mate.beber();
        }


}


