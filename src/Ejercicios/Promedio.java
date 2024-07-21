package Ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Promedio {
    private Scanner input;
    private List<Float> calificaciones;

    public Promedio() {
        input = new Scanner(System.in);
        calificaciones = new ArrayList<>();
    }

    public void ejecutar() {
        float total = 0;

        while (true) {
            System.out.println("1.- Ingresar calificacion 2.- Ver promedio 3.- Salir");
            int opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa la calificacion");
                    calificaciones.add(input.nextFloat());
                    break;
                case 2:
                    total = 0; // Reiniciar el total antes de calcular el promedio
                    for (Float calificacion : calificaciones) {
                        total += calificacion;
                    }
                    float promedio = total / calificaciones.size();
                    System.out.println("El promedio es: " + promedio);
                    break;
                case 3:
                    input.close();
                    return;
                default:
                    System.out.println("Opción incorrecta");
            }
        }
    }

    public static void main(String[] args) {
        Promedio promedio = new Promedio();
        promedio.ejecutar();
    }
}