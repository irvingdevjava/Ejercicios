package Ejercicios;

import java.util.Scanner;

public class Bisiesto {
    public  Bisiesto(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un año: ");
        int año = scanner.nextInt();

        if (esBisiesto(año)) {
            System.out.println("El año " + año + " es bisiesto.");
        } else {
            System.out.println("El año " + año + " no es bisiesto.");
        }
    }

    public static boolean esBisiesto(int año) {
        if(año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)){
            return true;
        }else{return false;}
    }
}