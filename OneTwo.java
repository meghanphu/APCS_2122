import java.util.Scanner;

public class OneTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a number 1-10 or 0 to quit: ");
        int num = in.nextInt();
        switch (num) {
            case 0:
                System.out.println("Bye");
                break;
            case 1: case 2:
                System.out.println("Buckle your shoe");
                break;
            case 3: case 4:
                System.out.print("Close the door");
                break;
            case 5: case 6:
                System.out.print("Pick up sticks");
                break;
            case 7: case 8:
                System.out.print("Don\'t be late");
                break;
            case 9: case 10:
                System.out.print("Do it again");
                break;
            default:
                System.out.print("You are an idiot");
        }
    }
}