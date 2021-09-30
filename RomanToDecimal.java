/**
 * takes valid input of roman numerals and converts to decimal values
 * a handles invalid input but ignores illogical input
 * @version 10/03/2021
 * @author Meghan Phu
 */
public class RomanToDecimal {
    public static int romanToDecimal(String roman) {
        int decimal = 0;
        for(int i = 0; i < roman.length(); i++) {
            //assigns letters to values
            if(roman.substring(i, i+1).toUpperCase().equals("I")) {
                decimal += 1;
            }
            else if(roman.substring(i, i+1).toUpperCase().equals("V")) {
                decimal += 5;
            }
            else if(roman.substring(i, i+1).toUpperCase().equals("X")) {
                decimal += 10;
            }
            else if(roman.substring(i, i+1).toUpperCase().equals("L")) {
                decimal += 50;
            }
            else if(roman.substring(i, i+1).toUpperCase().equals("C")) {
                decimal += 100;
            }
            else if(roman.substring(i, i+1).toUpperCase().equals("D")) {
                decimal += 500;
            }
            else if(roman.substring(i, i+1).toUpperCase().equals("M")) {
                decimal += 1000;
            }
            else {
                // program encounters an invalid character
                return -1;
            }
        }
        // assigns special combinations to numbers on first encounter
        if(roman.toUpperCase().indexOf("IV") != -1)
            decimal -= 2;
        if(roman.toUpperCase().indexOf("IX") != -1)
            decimal -= 2;
        if(roman.toUpperCase().indexOf("XL") != -1)
            decimal -= 20;
        if(roman.toUpperCase().indexOf("XC") != -1)
            decimal -= 20;
        if(roman.toUpperCase().indexOf("CD") != -1)
            decimal -= 200;
        if(roman.toUpperCase().indexOf("CM") != -1)
            decimal -= 200;
        return decimal;
    }
    // String[] numerals = {"M", "CM", "D", "CD", "C", "XC, "L", "XL", "X", "IX", "V", "IV", "I"};
    // int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    // "IIVI".equals("VI") - false
    public static void main(String[] args) {
        // prints out input and output
      for(String temp : args) {
          int val = romanToDecimal(temp);
          if(val == -1)
            System.out.println("Input: " + temp + " => output: invalid");
          else
              System.out.println("Input: " + temp + " => output: " + val);
      }
    }
}
