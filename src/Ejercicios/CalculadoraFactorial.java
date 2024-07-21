package Ejercicios;


    import java.util.Scanner;

public class CalculadoraFactorial {

    public CalculadoraFactorial(){
        Scanner scanner=new Scanner(System.in);
        int factorial =1;
        System.out.println("Ingresa un numero");
        int numero=scanner.nextInt();

        for(int i=1; i<=numero; i++){
            factorial *= i;
        }        
        System.out.println(factorial);
    }
    
}





