/** “ScissorRockPaper."
 *
 *  @author Emma Slayton
 *  Created: 9/8/17
 *  Last updated: 9/10/17
 *
 *  Project 3; CSC201-004N
 *  Assignment 3.17
 *
 */

import java.util.Scanner;

public class ScissorRockPaper {
    public static void main(String[] args) {
        /* Create a Scanner */
        Scanner input = new Scanner(System.in);

        /* Generate Random Number 0 (scissor), 1 (rock), 2 (paper) */
        int computerNumber;
        do {
            computerNumber = (int) (Math.random() * 10);
        } while ((computerNumber != 0) &&
                (computerNumber != 1) &&
                (computerNumber != 2));

        /*TEST: Manually Test Truth Table*/
        /*int computerNumber;
        do {
            System.out.print("COMPUTER => Enter 0, 1, or 2: ");
            computerNumber = input.nextInt();
        } while ((computerNumber != 0) &&
                (computerNumber != 1) &&
                (computerNumber != 2));

        /*********************************/

        /* Prompt User to Enter 0, 1, or 2 */
        int userNumber;
        do {
            System.out.print("Enter 0 (Scissors), (1) Rock, (2) Paper: ");
            userNumber = input.nextInt();
        } while ((userNumber != 0) &&
                (userNumber != 1) &&
                (userNumber != 2));

        /* Report Choices Made */
        if (computerNumber == 0)
            System.out.print("The Computer is Scissors. ");
        else if (computerNumber == 1)
            System.out.print("The Computer is Rock. ");
        else System.out.print("The Computer is Paper. ");

        if (userNumber == 0)
            System.out.println("You are Scissors.");
        else if (userNumber == 1)
            System.out.println("You are Rock.");
        else System.out.println("You are Paper.");

        /* Report Winner */
        /* Scissors beats Paper, Paper beats Rock, Rock beats Scissors */
        if (computerNumber == userNumber)
            System.out.println("It is a draw");
        else if (computerNumber == 0){
            if (userNumber == 1)
                System.out.println("Rock beats Scissors. You Win!");
            else System.out.println("Scissors beat Paper. Computer Wins!");
        }
        else if (computerNumber == 1) {
            if(userNumber == 2)
                System.out.println("Paper beats Rock. You Win!");
            else System.out.println("Rock beats Scissors. Computer Wins!");
        }
        else /*computerNumber == 2*/ {
            if(userNumber == 0)
                System.out.println("Scissors beats Paper. You Win!");
            else System.out.println("Paper beats Rock. Computer Wins!");
        }
    }
}
