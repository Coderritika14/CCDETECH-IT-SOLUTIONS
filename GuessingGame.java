/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessingnumber;

/**
 *
 * @author Ritika Kushwah
 */

import java.util.Random;
import java.util.Scanner;

public class GuessingNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
            
    {
        // TODO code application logic here
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess;

        System.out.println("Welcome to the number guessing game!");
        System.out.println("Guess a number between 1 and 100:");

        while (true) {
            guess = scanner.nextInt();

            if (guess == numberToGuess) {
                System.out.println("Congratulations, you guessed the number!");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low. Try again:");
            } else {
                System.out.println("Your guess is too high. Try again:");
            }
        }

        scanner.close();
    }
  }
    


