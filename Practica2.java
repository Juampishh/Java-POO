import java.util.ArrayList;
import java.util.Scanner;

public class Practica2 {

    public static class Libro{
        String Titulo;
        int ISBN;



        String Autor;

        int Numero_Paginas;

        public Libro(String Titulo,int ISBN,int Numero_Paginas,String Autor){
            this.Titulo = Titulo;
            this.ISBN = ISBN;
            this.Numero_Paginas = Numero_Paginas;
            this.Autor = Autor;
        }

        public String getTitulo(){
            return this.Titulo;
        }

        public String getAutor(){
            return this.Autor;
        }
        public int getISBN(){
            return this.ISBN;
        }
        public int getNumero_Paginas(){
            return this.Numero_Paginas;
        }

        public void setTitulo(String Titulo){
            this.Titulo = Titulo;
        }
        public void setAutor(String Autor){
            this.Autor = Autor;
        }
        public void setNumero_Paginas(int numero_Paginas){
            this.Numero_Paginas = numero_Paginas;
        }
        public void setISBN(int ISBN){
            this.ISBN = ISBN;
        }

        @Override
        public String toString() {
            return "Libro{" +
                    "Titulo='" + Titulo + '\'' +
                    ", ISBN=" + ISBN +
                    ", Autor='" + Autor + '\'' +
                    ", Numero_Paginas=" + Numero_Paginas +
                    '}';
        }
    }

    public static class ManejoLibros {
        private ArrayList<Libro> libros;

        public ManejoLibros() {
            libros = new ArrayList<>();
        }

        public void agregarLibro(Libro libro) {
            libros.add(libro);
        }

        public void imprimirLibro() {
            for (Libro libro : libros) {
                System.out.println("Título: " + libro.getTitulo());
                System.out.println("Autor: " + libro.getAutor());
                System.out.println("ISBN: " + libro.getISBN());
                System.out.println("Número de páginas: " + libro.getNumero_Paginas());
                System.out.println();
            }
        }


        public void Mayor(){
            int mayor=0;
            ArrayList<Libro> libroMayor;
            for(Libro libro : libros) {

                if(libro.Numero_Paginas > mayor){
                    mayor = libro.Numero_Paginas;

                }

            }
            System.out.println("El libro que mas paginas tiene: " + mayor );

            }
        }







    public static void main(String[] args){
        System.out.println("Desea crear un libro, ingrese Y o N");


        Scanner inputDecision = new Scanner(System.in);
        String Decision = inputDecision.nextLine();
        if(Decision.equals("Y")){
           ManejoLibros manejoLibros = new ManejoLibros();
           manejoLibros.agregarLibro(new Libro("Juampi",2,3,"Merino"));

            manejoLibros.agregarLibro(new Libro("Queso",3,4,"Giuli"));
            manejoLibros.agregarLibro(new Libro("Jamon",4,5,"Salame"));
           manejoLibros.imprimirLibro();

           manejoLibros.Mayor();

        }
    }



}
