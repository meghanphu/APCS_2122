import org.w3c.dom.ls.LSOutput;

import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * calculates BMI from height and weight
 * @version 11/9/2021
 * @author MeghanPhu
 */
public class BMICalculator {
    /**
     * Convert English to metric units, perform the BMI calculation.
     * NOTE: this method must properly handle bad data
     */

    public static double computeBMI(int inches, int pounds) {
        //1 inch == 0.0254 meters
        //1 pound == 0.454 kg
        if (inches <= 0 || pounds < 0)
            return 0;
        return pounds * .454 / Math.pow(inches * .0254, 2);
    }

    public static int extractInches(String value) {
        int qtPos = value.indexOf("'");
        int dblQtPos = value.indexOf("\"");
        if (qtPos == -1 || dblQtPos == -1) {
            //return -1; }
            System.out.println("Invalid input "); }
        int feet = Integer.parseInt(value.substring(0, qtPos));
        int inches = Integer.parseInt(value.substring(qtPos + 1, dblQtPos));

        if (inches < 0 || inches > 11 || feet < 0)
            //return -1;
            System.out.println("Invalid input ");

        return (feet * 12 + inches == 0) ? -1 : feet * 12 + inches;
    }

    /**
     * Uses a Scanner to prompt the user for info, process the
     * feet/inches conversion, calls the computeBMI method and prints the
     * correct information.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int inches, weight;
        while (true) {
            try {
                System.out.print("Enter your height in the format ft'in\":  ");
                inches = extractInches(in.nextLine());
                // takes in user's height
                System.out.print("Enter your weight in pounds: ");
                weight = in.nextInt();
                // takes in user's weight
                System.out.println("Your BMI, expressed as weight(kg)/height(m)^2: " + df.format(computeBMI(inches, weight)) + " kg/m^2");
                // prints BMI
            } catch (Exception e) {
                System.out.println("Please enter the correct input for height (ft'in\") and weight ");
                continue; }
            in.nextLine(); //Scanners are weird - this handles the nextInt buffer
            System.out.print("Continue (Y/N): ");
            String cont = in.nextLine();
            if (!cont.toLowerCase().equals("y"))
                break;
        }
        System.out.println("End of program");
    }
}
// couldn't figure out how to handle invalid data for weight
// if the user inputs anything greater than 12 for inches, the program says Invalid input but doesn't do anything about it
