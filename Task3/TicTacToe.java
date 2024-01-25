/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.Scanner;

/**
 *
 * @author Ritika Kushwah
 */
public class TicTacToe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        char[][] board=new char[3][3]; 
        for(int row=0;row<board.length;row++)
        {
            for(int col=0;col<board[row].length;col++)
            {
                board[row][col] = ' ';
            }
        }
        
        char player ='X';
        boolean gameOver = false;
        
        
        Scanner sc = new Scanner(System.in);
        
        
        while(!gameOver)
        {
            printBoard(board);
            System.out.print("player " + player + " Enter:");
            int row = sc.nextInt();
            int col = sc.nextInt();
            
            if(board[row][col]== ' ')
            {
                board[row][col] = player;
                gameOver = haveWon(board,player);
                if(gameOver)
                {
                    System.out.println("player"+player+"has won:");
                }
                
                else
                {
                   // if(player=='X')
                    // {
                    //    player ='0';
                   // }
                   // else
                    //{
                      //  player = 'X';
                    //}
                    
                    player=(player == 'X') ? '0' : 'X';
                }
            }
            
            else
            {
                System.out.println("Invalid move , Try again");
            }
            
        }
        
        printBoard(board);
    }
     
    public static boolean haveWon(char[][] board ,char player)
    {
        for(int row=0;row<board.length;row++)
        {
            if(board[row][0] == player && board[row][1] == player && board[row][2] == player)
            {
                return true;
            }
        }
        
        
        for(int col=0;col<board[0].length;col++)
        {
            if(board[0][0] == player && board[1][1] == player && board[2][2] == player)
            {
                return true;
            }
        }
        
        if(board[0][2]==player && board[1][1] == player && board[2][0] ==player)
        {
            return true;
        }
        
        return false;
    }
    private static void printBoard(char[][] board)
    {
       for(int row=0;row<board.length;row++)
        {
            for(int col=0;col<board[row].length;col++)
            {
                
                System.out.print(board[row][col]+" |");
            }
            
            System.out.println();
        }
        
    }
    
}
