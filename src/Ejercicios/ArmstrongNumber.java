package Ejercicios;

public class ArmstrongNumber {
    public ArmstrongNumber(int number) {
        boolean isArmstrong = isArmstrongNumber(number);
        printResult(number, isArmstrong);
    }

    private boolean isArmstrongNumber(int number) {
        int sum = 0, originalNumber = number;
        int digits = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        return sum == originalNumber;
    }

    private void printResult(int number, boolean isArmstrong) {
        if (isArmstrong) {
            System.out.println(number + " es un número Armstrong.");
        } else {
            System.out.println(number + " no es un número Armstrong.");
        }
    }
}

