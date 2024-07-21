package Ejercicios;
import java.util.Scanner;

public class Palindromo {

public Palindromo (){
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine();

        if (esPalindromo(palabra)) {
            System.out.println("La palabra ingresada es un palíndromo.");
        } else {
            System.out.println("La palabra ingresada no es un palíndromo.");
        }
    }

    public static boolean esPalindromo(String palabra) {
        palabra = palabra.toLowerCase();
        int longitud = palabra.length();

        for (int i = 0; i < longitud / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(longitud - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}

