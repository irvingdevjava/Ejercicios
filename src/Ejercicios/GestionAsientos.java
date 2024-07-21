package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class GestionAsientos {
    private static final int ROWS = 10;
    private static final int COLS = 10;
    private static final char FREE = 'F';
    private static final char USED = 'X';
    private char[][] seats;

    public GestionAsientos() {
        seats = new char[ROWS + 1][COLS + 1];
        for (char[] row : seats) {
            Arrays.fill(row, FREE);
        }
    }

    public void sellTicket(int row, int col) {
        if (row < 1 || row > ROWS || col < 1 || col > COLS) {
            System.out.println("Invalid seat selection");
            return;
        }
        if (seats[row][col] == USED) {
            System.out.println("Seat already sold");
        } else {
            seats[row][col] = USED;
            System.out.println("Ticket sold successfully");
        }
    }

    public void displaySeats() {
        for (int i = 1; i <= ROWS; i++) {
            for (int j = 1; j <= COLS; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void inicio() {
        GestionAsientos gestionAsientos = new GestionAsientos();
        Scanner scanner = new Scanner(System.in);
        int row, col;

        while (true) {
            System.out.println("1. Sell ticket");
            System.out.println("2. Display seats");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter row number: ");
                    row = scanner.nextInt();
                    System.out.print("Enter column number: ");
                    col = scanner.nextInt();
                    gestionAsientos.sellTicket(row, col);
                    break;
                case 2:
                    gestionAsientos.displaySeats();
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}