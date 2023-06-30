public class EjerPractica3 {

     static class Fraccion{
        int dividendo;
        int divisor;

        public Fraccion(int dividendo,int divisor){
            this.dividendo = dividendo;
            this.divisor = divisor;
        }
        @Override
        public String toString() {
            return "Fraccion: " +dividendo+"/"+divisor ;
        }

        public Fraccion sumarFraccion (Fraccion otraFraccion){
            int nuevoDividendo,nuevoDivisor;
            nuevoDividendo = (this.dividendo * otraFraccion.divisor ) + (otraFraccion.dividendo * this.divisor);
            nuevoDivisor = (this.divisor*otraFraccion.divisor);
            return new Fraccion(nuevoDividendo,nuevoDivisor);
        }
        public Fraccion multiplicarFracciones(Fraccion otraFraccion){
            int nuevoDividendo,nuevoDivisor;
            nuevoDividendo = this.dividendo * otraFraccion.dividendo;
            nuevoDivisor = this.divisor * otraFraccion.divisor;
            return new Fraccion(nuevoDividendo,nuevoDivisor);


        }

    }


    public static void main(String[] args){
        Fraccion fraccion1 = new Fraccion(1,2);
        Fraccion fraccion2 = new Fraccion(3,2);
        System.out.println("Primera Fraccion");
        System.out.println(fraccion1.toString());
        System.out.println();
        System.out.println("Segunda Fraccion");
        System.out.println(fraccion2.toString());
        System.out.println();
        System.out.println("Suma de fracciones");
        Fraccion fraccionResultado = fraccion1.sumarFraccion(fraccion2);
        System.out.println(fraccionResultado.toString());
        System.out.println();
        System.out.println("Multiplicar Fracciones");
        Fraccion fraccionResultadoMulti = fraccion1.multiplicarFracciones(fraccion2);
        System.out.println(fraccionResultadoMulti.toString());
    }

}
