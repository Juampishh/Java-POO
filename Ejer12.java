public class Ejer12 {
    //Crear una clase llamada Serie con las siguientes características:
    //1. Sus atributos son título, número de temporadas, entregado, género y creador. Por
    //defecto, el número de temporadas es de 3 temporadas y entregado false. El resto de
    //atributos serán valores por defecto según el tipo del atributo.
    //Los constructores que se implementarán serán:
    //1. Un constructor por defecto.
    //2. Un constructor con el título y creador. El resto por defecto.
    //3. Un constructor con todos los atributos, excepto de entregado.
    //Los métodos que se implementara serán:
    //1. Métodos get de todos los atributos, excepto de entregado.
    //2. Métodos set de todos los atributos, excepto de entregado.
    //Crearemos una clase Videojuego con las siguientes características:
    //1. Sus atributos son titulo, horas estimadas, entregado, genero y compañia.
    //Por defecto, las horas estimadas serán de 10 horas y entregado false. El resto de
    //atributos serán valores por defecto según el tipo del atributo.
    //Los constructores que se implementarán serán:
    //1. Un constructor por defecto.
    //2. Un constructor con el título y horas estimadas. El resto por defecto.
    //3. Un constructor con todos los atributos, excepto de entregado.
    //Los métodos que se implementara serán:
    //1. Métodos get de todos los atributos, excepto de entregado.
    //2. Métodos set de todos los atributos, excepto de entregado.
    //Las clases anteriores tienen los siguientes métodos:
    //1. entregar(): cambia el atributo prestado a true.
    //2. devolver(): cambia el atributo prestado a false.
    //3. isEntregado(): devuelve el estado del atributo prestado.
    //Implementa los anteriores métodos en las clases Videojuego y Serie.
    //Crear una aplicación que realiza lo siguiente:
    //1. Crea dos arrays, uno de Series y otro de Videojuegos, de 5 posiciones cada uno.
    //2. Crea un objeto en cada posición del array, con los valores que desees, puedes usar
    //distintos constructores.
    //3. Entrega algunos Videojuegos y Series con el método entregar().
    //4. Cuenta cuantos Series y Videojuegos hay entregados. Al contarlos, retornar por pantalla
    //el resultado.
    //Por último, indica el Videojuego tiene más horas estimadas y la serie con más temporadas.
    //Mostrarlos en pantalla con toda su información.
     static class Serie {
        private String titulo;
        private int numeroTemporadas;
        private boolean entregado;
        private String genero;
        private String creador;

        public Serie() {
            this.numeroTemporadas = 3;
            this.entregado = false;
        }

        public Serie(String titulo, String creador) {
            this.titulo = titulo;
            this.numeroTemporadas = 3;
            this.entregado = false;
            this.creador = creador;
        }

        public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
            this.titulo = titulo;
            this.numeroTemporadas = numeroTemporadas;
            this.entregado = false;
            this.genero = genero;
            this.creador = creador;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public int getNumeroTemporadas() {
            return numeroTemporadas;
        }

        public void setNumeroTemporadas(int numeroTemporadas) {
            this.numeroTemporadas = numeroTemporadas;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public String getCreador() {
            return creador;
        }

        public void setCreador(String creador) {
            this.creador = creador;
        }

        public void entregar() {
            entregado = true;
        }

        public void devolver() {
            entregado = false;
        }

        public boolean isEntregado() {
            return entregado;
        }
    }

   static class Videojuego {
        private String titulo;
        private int horasEstimadas;
        private boolean entregado;
        private String genero;
        private String compañia;

        public Videojuego() {
            this.horasEstimadas = 10;
            this.entregado = false;
        }

        public Videojuego(String titulo, int horasEstimadas) {
            this.titulo = titulo;
            this.horasEstimadas = horasEstimadas;
            this.entregado = false;
        }

        public Videojuego(String titulo, int horasEstimadas, String genero, String compañia) {
            this.titulo = titulo;
            this.horasEstimadas = horasEstimadas;
            this.entregado = false;
            this.genero = genero;
            this.compañia = compañia;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public int getHorasEstimadas() {
            return horasEstimadas;
        }

        public void setHorasEstimadas(int horasEstimadas) {
            this.horasEstimadas = horasEstimadas;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public String getCompañia() {
            return compañia;
        }

        public void setCompañia(String compañia) {
            this.compañia = compañia;
        }

        public void entregar() {
            entregado = true;
        }

        public void devolver() {
            entregado = false;
        }

        public boolean isEntregado() {
            return entregado;
        }
    }


        public static void main(String[] args) {
            Serie[] series = new Serie[5];
            Videojuego[] videojuegos = new Videojuego[5];

            series[0] = new Serie("Breaking Bad", 5, "Drama", "Vince Gilligan");
            series[1] = new Serie("Game of Thrones", 8, "Fantasy", "David Benioff, D. B. Weiss");
            series[2] = new Serie("Friends", "David Crane, Marta Kauffman");
            series[3] = new Serie();
            series[4] = new Serie("Stranger Things", 4, "Science Fiction", "The Duffer Brothers");

            videojuegos[0] = new Videojuego("The Legend of Zelda: Breath of the Wild", 50, "Action-Adventure", "Nintendo");
            videojuegos[1] = new Videojuego("Grand Theft Auto V", 30, "Action-Adventure", "Rockstar Games");

            videojuegos[2] = new Videojuego();
            videojuegos[3] = new Videojuego("Red Dead Redemption 2", 60, "Action-Adventure", "Rockstar Games");

            series[0].entregar();
            series[4].entregar();
            videojuegos[0].entregar();
            videojuegos[1].entregar();
            videojuegos[3].entregar();

            int seriesEntregadas = contarEntregados(series);
            int videojuegosEntregados = contarEntregados(videojuegos);

            System.out.println("Número de series entregadas: " + seriesEntregadas);
            System.out.println("Número de videojuegos entregados: " + videojuegosEntregados);

            Serie serieMasTemporadas = encontrarSerieMasTemporadas(series);
            Videojuego videojuegoMasHoras = encontrarVideojuegoMasHoras(videojuegos);

            System.out.println("Serie con más temporadas: " + serieMasTemporadas.getTitulo());
            System.out.println("Videojuego con más horas estimadas: " + videojuegoMasHoras.getTitulo());
        }

        public static int contarEntregados(Object[] objetos) {
            int contador = 0;
            for (Object objeto : objetos) {
                if (objeto instanceof Serie) {
                    Serie serie = (Serie) objeto;
                    if (serie.isEntregado()) {
                        contador++;
                    }
                } else if (objeto instanceof Videojuego) {
                    Videojuego videojuego = (Videojuego) objeto;
                    if (videojuego.isEntregado()) {
                        contador++;
                    }
                }
            }
            return contador;
        }

        public static Serie encontrarSerieMasTemporadas(Serie[] series) {
            Serie serieMasTemporadas = series[0];
            for (int i = 1; i < series.length; i++) {
                if (series[i].getNumeroTemporadas() > serieMasTemporadas.getNumeroTemporadas()) {
                    serieMasTemporadas = series[i];
                }
            }
            return serieMasTemporadas;
        }

        public static Videojuego encontrarVideojuegoMasHoras(Videojuego[] videojuegos) {
            Videojuego videojuegoMasHoras = videojuegos[0];
            for (int i = 1; i < videojuegos.length; i++) {
                if (videojuegos[i].getHorasEstimadas() > videojuegoMasHoras.getHorasEstimadas()) {
                    videojuegoMasHoras = videojuegos[i];
                }
            }
            return videojuegoMasHoras;
        }
    }


