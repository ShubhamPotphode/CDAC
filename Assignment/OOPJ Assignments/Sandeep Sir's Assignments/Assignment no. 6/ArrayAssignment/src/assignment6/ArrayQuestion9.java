package assignment6;

import java.util.Scanner;

class AirplaneSeatManager {
    private boolean[][] seats;

    public AirplaneSeatManager(int rows, int cols) {
        seats = new boolean[rows][cols];  // false means available, true means occupied
    }

    public void bookSeat(int row, int col) {
        if (!seats[row][col]) {
            seats[row][col] = true;
            System.out.println("Seat booked.");
        } else {
            System.out.println("Seat already occupied.");
        }
    }

    public void cancelBooking(int row, int col) {
        if (seats[row][col]) {
            seats[row][col] = false;
            System.out.println("Booking cancelled.");
        } else {
            System.out.println("Seat is not booked.");
        }
    }

    public void checkAvailability(int row, int col) {
        if (!seats[row][col]) {
            System.out.println("Seat is available.");
        } else {
            System.out.println("Seat is occupied.");
        }
    }

    public void displaySeatingChart() {
        System.out.println("Seating chart (true = occupied, false = available):");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class ArrayQuestion9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        AirplaneSeatManager manager = new AirplaneSeatManager(rows, cols);

        manager.displaySeatingChart();
        manager.bookSeat(1, 1);
        manager.displaySeatingChart();
        manager.checkAvailability(1, 1);
        manager.cancelBooking(1, 1);
        manager.displaySeatingChart();
    }
}
