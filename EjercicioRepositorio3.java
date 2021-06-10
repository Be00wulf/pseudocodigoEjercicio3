//EjercicioRepositorio3
import java.util.Scanner;
public class EjercicioRepositorio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        long factorial = 1;
        
        System.out.println("Ingrese un numero entero");
        numero = entrada.nextInt();
        
        if (numero >= 0) {
            for(int i = 1; i <= numero; i++){
            factorial *= i;
            }
            
            System.out.println("El factorial de " + numero + " es " + factorial);
       
        }   else    {
            System.out.println("ERROR, NUMERO FUERA DE LIMITE");
        }
 
        
    }
}