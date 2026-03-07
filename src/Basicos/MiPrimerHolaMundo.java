package Basicos;

public class MiPrimerHolaMundo {
    public static void main(String[] args) {


        String saludar = "Hola mundo";
        System.out.println(saludar);
        System.out.println("Saludar.toUpperCase() = " + saludar.toUpperCase() );

        int numero = 11;

        boolean valor = true;
        int numero2 = 5;

        if(valor){
            System.out.println("numero = " + numero);
            numero2=10;
        }
        System.out.println("numero2 = " + numero2);

        var numero3 = "coccococococ";

        String nombre = "Carlos";

       if(numero>10){
           nombre = "Johan";
       }

        System.out.println("nombre = " + nombre);

    }
}
