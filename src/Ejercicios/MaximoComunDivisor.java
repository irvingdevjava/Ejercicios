package Ejercicios;

import java.util.Scanner;

public class MaximoComunDivisor {

    public MaximoComunDivisor() {
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el primer número: ");
        int primerNumero = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int segundoNumero = scanner.nextInt();

        int mcd = calcularMaximoComunDivisor(primerNumero, segundoNumero);

        System.out.println("El MCD de " + primerNumero + " y " + segundoNumero + " es " + mcd);

        scanner.close();
    }

    public static int calcularMaximoComunDivisor(int numero1, int numero2) {
        while (numero2 != 0) {
            int temp = numero2;
            numero2 = numero1 % numero2;
            numero1 = temp;
        }
        return numero1;
    }
}

