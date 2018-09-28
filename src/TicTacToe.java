import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number of columns: ");
        int rows = input.nextInt();
        System.out.println("Number of rows: ");
        int columns = input.nextInt();

        char[][] array = new char[columns][rows];

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                array[i][j] = ' ';
            }
        }

        System.out.println("Player 1 choose symbol");
        char player1 = input.next().charAt(0);
        System.out.println("Player 2 choose symbol");
        char player2 = input.next().charAt(0);

        while (true) {
            System.out.println("Turn player one");
            System.out.println("Choose where to place: ");
            int col = input.nextInt();
            int row = input.nextInt();

            if (array[col][row] == player1 || array[col][row] == player2) {
                System.out.println("This place has been chosen, please try another.");
            } else {
                array[col][row] = player1;
            }

            System.out.println("Turn player two");
            System.out.println("Choose where to place: ");
            int col2 = input.nextInt();
            int row2 = input.nextInt();

            if (array[col2][row2] == player1 || array[col2][row2] == player2) {
                System.out.println("This place has been chosen, please try another.");
            } else {
                array[col2][row2] = player2;
            }

            for (int i = 0; i < columns; i++) {
                for (int j = 0; j < rows; j++) {
                    System.out.println(array[i][j] + "|");
                }
                System.out.println();
                System.out.println("----------");
            }
        }
    }
}
