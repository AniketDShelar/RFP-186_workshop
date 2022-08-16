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
        static void printBoard(){
            System.out.println(board[1]+" | "+board[2]+" | "+board[3]);
            System.out.println("----------");
            System.out.println(board[4]+" | "+board[5]+" | "+board[6]);
            System.out.println("----------");
            System.out.println(board[7]+" | "+board[8]+" | "+board[9]);
            System.out.println("----------");
        }
        static void selectIndex(){
            System.out.println("Select Index ");
        }
    public static void main(String[] args) {
        initializeBoard(board);
        choice();
        printBoard();

    }
}

