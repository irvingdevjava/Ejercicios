package Ejercicios;



public class Fibonacci {
    public int[] generateFibonacci(int n) {
        int[] fibonacci = new int[n];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }

        for(int i=0; i<fibonacci.length; i++){
            System.out.println(fibonacci[i]);
        }

        System.out.println(fibonacci);
        return fibonacci;
    }
}