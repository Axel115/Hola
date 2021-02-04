import java.util.Scanner;
public class SeleccionDeNumeros{

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        
        int number;
        
        System.out.print ("INGRESE UN NUMERO: ");
        number= sc.nextInt ();
        
        if (number < 0){
            System.out.println ("-El numero es NEGATIVO");
        }
        else{
            System.out.println ("-El numero es positivo");
        }
       
        if (number%2 == 0){
            System.out.println ("-El numero es ENTERO");
        }
        else {
        System.out.println ("-El numero es IMPAR");
        }
    }
}