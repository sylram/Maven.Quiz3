package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {

        return board[value];
    }

    public String[] getColumn(Integer value) {
        String[] row = new String[3];
        for (int i = 0; i <board.length ; i++) {
                row[i] = board[i][value];

            }return row;
        }

    public Boolean isRowHomogenous(Integer rowIndex) {

            if(getRow(rowIndex)[0].equals(getRow(rowIndex)[1])&& getRow(rowIndex)[0].equals(getRow(rowIndex)[2])){
                return true;
        }
        return false;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        getColumn(columnIndex);
        if(getColumn(columnIndex)[0].equals(getColumn(columnIndex)[1])&&
                getColumn(columnIndex)[0].equals(getColumn(columnIndex)[2])){
            return true;
        }
        return false;
    }

    public String getWinner() {

        String winner = "";
        for (int i = 0; i < board.length; i++) {
            if (isRowHomogenous(i)) {
                winner = getRow(i)[i];
            } else if (isColumnHomogeneous(i)) {
                winner = getColumn(i)[i];
            }
        }
        return winner;
    }

    public String[][] getBoard() {

        return board;
    }

    public static void main(String[] args) {
        String[] row1 = {"X", "O", "X"};
        String[] row2 = {"O", "X", "O"};
        String[] row3 = {"O", "X", "O"};
        String[][] board = {row1, row2, row3};
        System.out.println(Arrays.asList(board[0]));


    }
}
