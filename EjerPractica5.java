public class EjerPractica5 {
    //Crear una clase Vector, que en su constructor reciba una lista de elementos que serán sus
    //coordenadas. En el método toString() se imprime su contenido con el formato [x,y,z].
    //1. Crear un método que reciba un número y devuelva un nuevo vector (objeto de la clase
    //Vector), con los elementos multiplicados por ese número.
    //2. Crear un método sumar que recibe otro vector, verifica si tienen la misma cantidad de
    //elementos y devuelve un nuevo vector con la suma de ambos. Si no tienen la misma
    //cantidad de elementos entonces imprimir un mensaje de error y la función debe retornar
    //el vector que se pasó como parámetro.

   static class Vector{
        int x,y,z;

        public Vector(int x, int y, int z){
            this.x = x;
            this.y = y;
            this.z = z;
        }

        @Override
        public String toString(){
            return "Vector" + "[" +x+"]"+"["+y+"]"+"["+z+"]";
        }
        public Vector multiplicarVector(int num){
            Vector nuevoVector = new Vector(this.x*num,this.y * num , this.z*num);
            return nuevoVector;
        }

        public Vector sumasVector(Vector otroVector){
            if(otroVector.x > 0 && otroVector.y > 0 && otroVector.z > 0){
                System.out.println("Tienen el mismo tamaño");
                Vector nuevoVector = new Vector(this.x + otroVector.x,this.y + otroVector.y , this.z + otroVector.z);
                return nuevoVector;
            }else{
                System.out.println("No tienen el mismo tamaño");
                return otroVector;
            }
        }
    }

    public static void main(String[] args){
        Vector vector1 = new Vector(1,2,3);
        Vector vector2 = new Vector(5,6,8);
        System.out.println("Vector 1: ");
        System.out.println(vector1.toString());
        System.out.println();
        System.out.println("Vector 2: ");
        System.out.println(vector2.toString());

        System.out.println("Multiplicacion de vectores por un numero");
        System.out.println();
        System.out.println("Multiplicacion del vector1 * 2");
        Vector resultadoMultiplicacion = vector1.multiplicarVector(2);
        System.out.println(resultadoMultiplicacion.toString());
        System.out.println();

        System.out.println("Multiplicacion del vector2 * 2");
        Vector resultadoMultiplicacionVector2 = vector2.multiplicarVector(2);
        System.out.println(resultadoMultiplicacionVector2.toString());
        System.out.println();

        System.out.println("Suma de vectores");
        Vector resultadoSumaDeVectores = vector1.sumasVector(vector2);
        System.out.println(resultadoSumaDeVectores.toString());

    }


}
