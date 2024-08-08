package Ejercicios;

public class Factorial {
    public Factorial(int number) {
        long result = calculateFactorial(number);
        printResult(result);
    }

    private long calculateFactorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    private void printResult(long result) {
        System.out.println("El factorial es: " + result);
    }
}
