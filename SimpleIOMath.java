import java.util.Scanner;
/**
 * prints a conversation the computer has with a user while asking the user to input numerical data.
 * @version September 27 2021
 * @author Meghan Phu
 */

public class SimpleIOMath {
    private String name;
    private int age;
    private int favNumber;

    private int smallestPrime(int num) {
        for(int i = 2; i <= (int)(Math.sqrt(num))+1; i++) {
            if(num % i == 0)
                return i;
        }
        return num;
    }


        public void promptUser() {
        Scanner in = new Scanner(System.in);
        System.out.print("Question 1: What is your name? ");
        //program asks user their name
        name = in.nextLine();
        System.out.print("Question 2: How old are you? ");
        // program asks user their age
        age = in.nextInt();
        System.out.print("Question 3: What's your favorite number? ");
        // program asks user their favorite color
        favNumber = in.nextInt();

        }

        public void printInfo() {
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println("At your next birthday, you will turn " + (age + 1));
        System.out.println("The first prime factor of " + age + " is: " + smallestPrime());
        System.out.println("Your favorite number is: " + favNumber);
        System.out.println("Your favorite number squared is: " + (favNumber * favNumber));
        // program prints out user's info + prime factor of age and fav number squared
        }


    public static void main(String[] args) {
        System.out.println("* Sit yourself down, take a seat *");
        System.out.println("* All you gotta do is repeat after me *");
        SimpleIOMath obj = new SimpleIOMath();
        obj.promptUser();
        System.out.println("I'm gonna teach you how to sing it out");
        System.out.println("Come on, come on, come on");
        System.out.println("Let me tell you what it's all about");
        System.out.println("Reading, writing, arithmetic");
        System.out.println("Are the branches of the learning tree");
        obj.printInfo();
        //obj.myExtra():
        System.out.println("* end of program *");
    }
}
