package com.bridgelabz.tictactoe;


import java.util.Scanner;

public class TicTacToeGame {

        static char[] board = new char[10];
        static char playerLetter;
        static char computerLetter;
        private static void initializeBoard(char[] board) {
            for(int i=1; i<board.length;i++) {
                board[i] = ' ';
            }
        }
        static void choice(){
            System.out.println("-----Start the game-----");
            System.out.println("Choose 'X' or 'O'");
            Scanner scan = new Scanner(System.in);
            playerLetter = scan.next().charAt(0);
            computerLetter = (playerLetter == 'X') ? 'O' : 'X';
        }
    public static void main(String[] args) {
        initializeBoard(board);
        choice();
    }
}

