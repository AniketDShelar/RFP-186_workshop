package com.bridgelabz.tictactoe;


public class TicTacToeGame {

        static char[] board = new char[10];
        private static void emptyBoard() {
            for(int i=1; i<board.length;i++) {
                board[i] = ' ';
            }
        }
    public static void main(String[] args) {
        emptyBoard();
    }
}

