public class EjercPractica6 {
    //Escribir una clase Papel que contenga un atributo texto, un método escribir, que reciba una
    //cadena de caracteres para agregar al texto, y el método toString() que imprima el contenido del
    //texto.
    //Escribir una clase Birome que contenga un atributo cantidad de tinta, y un método escribir, que
    //reciba un texto y un papel (objeto de la clase Papel) sobre el cual escribir. Cada letra escrita
    //debe reducir la cantidad de tinta contenida. Cuando la tinta se acabe, debe imprimir un mensaje
    //de error indicando que la tinta se ha acabado.


    static class Papel {
        String Texto;

        public Papel(String texto) {
            this.Texto = texto;
        }


        public String toString() {
            return "El texto es: " + this.Texto;
        }
        public String setTexto(String texto){
            this.Texto = texto;
            return this.Texto;
        }

    }


    static class Birome {
        int cantidadTinta;

        public Birome(int cantidadTinta) {
            this.cantidadTinta = cantidadTinta;
        }

        public void escribir(String texto, Papel papel) {
            if (cantidadTinta > texto.length()) {
                System.out.println("Escribiendo en el papel: " + texto);
                papel.setTexto(texto);

            } else {
                System.out.println("La birome no tiene tinta suficienta para escribir este texto.");
            }
        }

        public static void main(String[] args) {
            Papel papel1 = new Papel("Hoy es feriado");
            System.out.println(papel1.toString());
            Birome birome1 = new Birome(20);
          birome1.escribir("Hoy llueve pero no sale el sol",papel1);

        }
    }
}