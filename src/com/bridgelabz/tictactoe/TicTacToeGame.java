package com.bridgelabz.tictactoe;
import java.util.Scanner;
public class TicTacToeGame {
    public static void main(String[] args) {
        System.out.println("Start the game");
        System.out.println("----------------");
        tossUp();
        initializeBoard();
        choice();
        printBoard();
        userChoiceOfIndex();
    }

        static char[] board = new char[10];
        static char playerLetter;
        static char computerLetter;
        static int index;
        private static void initializeBoard() {
            for(int i=1; i<board.length;i++) {
                board[i] = ' ';
            }
        }
        static void choice(){
            System.out.println("Choose :: 'X' or 'O' : ");
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
        static void userChoiceOfIndex() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter location from 1 to 9 ");
            int location = scan.nextInt();
            if(location < 1 && location > 10){
                System.out.println("Enter valid location");
            }else if(board[location] != ' '){
                System.out.println("You have already chosen this location, Please enter valid location");
                userChoiceOfIndex();
            }else{
                board[location] = playerLetter;
                printBoard();
                checkForFreeSpace();
                userChoiceOfIndex();
            }
        }
        static void checkForFreeSpace(){
            boolean isSpaceAvailable = false;
            int numOfFreeSpace = 0;
            for(int i = 1; i < board.length; i++){
                if(board[i] == ' '){
                    isSpaceAvailable = true;
                    numOfFreeSpace++;
                }
            }
            if(isSpaceAvailable == false) {
                System.out.println("Board is full. You can't make another move");
            }else {
                System.out.println(numOfFreeSpace+ " spaces available");
        }
    }
    static void tossUp(){
            int heads = 0;
            int toss = (int)Math.floor(Math.random() * 10) / 2;
            if(toss == heads){
                System.out.println("User turn first");
            }else{
                System.out.println("Computer turn first");
            }
    }
}

