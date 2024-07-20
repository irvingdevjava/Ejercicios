package Ejercicios;

import java.util.Arrays;

public class GestionAsientos {
    private static final int ROWS=10;
    private static final int COLS=10;
    private static final char FREE='F';
    private static final char USED='X';

    private char[][] seats;

    public void TicketApp(){
        seats = new char[ROWS][COLS];
        for(char[] row:seats){
            Arrays.fill(row, FREE);
        }
    }

    public void sellTicket(int row, int col){
        if(row < 0 || row >= ROWS || col < 0 || col >= COLS){
            System.out.println("Invalid seat selection");
            return;
        }
        if(seats[row][col]==USED){
            System.out.println("Seat already sold");
        }else{
            seats[row][col]=USED;
            System.out.println("Ticket sold succesfully");
        }

    }

    public void displatSeat(){
        for(int i=0;i<ROWS; i++ ){
            for(int j=0;i<ROWS; j++ ){
                System.out.println(seats[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        GestionAsientos gestionAsientos= new GestionAsientos();
        gestionAsientos.sellTicket(2,3);
        gestionAsientos.displatSeat();
    }

}


