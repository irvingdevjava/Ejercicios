package Ejercicios;

import java.util.Scanner;

public class NumeroPrimo {
    Scanner input = new Scanner(System.in);

    public NumeroPrimo(){
        System.out.print("Ingresa el numero a comprobar si es primo o no:");
        int numero=input.nextInt();

        if(numero%2 != 0){
            System.out.println("El numero " + numero + " es primo");
        }else{
            System.out.println("El numero " + numero + " no es primo");
        }

    }
}
