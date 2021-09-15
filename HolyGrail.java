/**
 * Class Widget is on implementation of an object idea
 * @version 09/13/2021
 * @author MeghanPhu
 */

import java.util.Scanner;
public class HolyGrail {
    public static void main(String[] args) {
        System.out.println("* A chat with the bridge keeper *");
        System.out.println("Who would cross the Bridge of Death must answer me these questions three, ere the other side he see.");
        // program welcomes user
        Scanner input = new Scanner(System.in);
        System.out.print("Question 1: What is your name? ");
        // program asks user what their name is
        String name = input.nextLine();
        System.out.print("Question 2: What is your quest? ");
        // program asks user what their quest is
        String quest = input.nextLine();
        System.out.print("Question 3: What is your favorite color? ");
        // program asks user what their favorite color is
        String color = input.nextLine();
        System.out.println("King Arthur says, \"You have to know these things when you're a king, you know.\"");
        System.out.println("Your name is: " + name);
        System.out.println("Your quest is: " + quest);
        System.out.println("Your favorite color is: " + color);
        // program recites user information
        System.out.println("* end of program *");
    }
}