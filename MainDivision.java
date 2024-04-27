import java.util.Scanner;
// InsertarLibreria
public class MainDivision {
    // Nombre de la clase
    public static void main(String[]args){
        // Metodo main
        Scanner opc = new Scanner(System.in);
        // Metodo constructor
        System.out.println("Ingresa un numero");
        // Impresion de un mensaje sobre lo que se trata el programa
        double a= opc.nextDouble();
        // Declaracion  del tipo de variable
        System.out.println("Ingresa otro numero");
        // Impresion del mensaje
        double b= opc.nextDouble();
        // Declaracion de el tipo de variable
        double r= a/b;
        // Operacion
        Division div = new Division();
        // Metodo constructor del objeto a llamar
        div.a=a;
        div.b=b;
        div.r=r;
        // Almacenamiento de las variables
        System.out.println("El resultado es:"+ div.mostrarDivision(a, b));
        // Concatenacion del resultado
    }
}
// Cierre de llaves