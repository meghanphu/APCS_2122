import java.util.Scanner;

public class Chapter7 {

    public static void printPermutations(int cents){
        int count = 0;
        int q = 0, d = 0, n = 0, p = 0;
        // if i have 0 quarters, 0 dimes, 0 nickels, i have cents pennies... why?
        // p = cents - (q*25 + d*10 + n*5)
        // how can i design three outer for loops to determine q, d, n
        for (q = 0; 25 * q <= cents; q++) {
            for (d = 0; 10 * d + 25 * q <= cents; d++){
                for (n = 0; 5 * n + 10 * d + 25 * q <= cents; n++){
                    p = cents - (q * 25 + d * 10 + n * 5);
                    count++;
                    System.out.println(cents + "¢ = " + q + " quarters " + d + " dimes " + n + " nickels " + p + " pennies ");
                }
            }
        }
        System.out.println(count + " permutations");
    }

    public static void main(String[] args) {
        // determine loop AKA for loop
        // the code will repeat FOR x times
        // initialization of a counter variable
        // limit test/boolean condition
        // incrementation
        /*for (int i = 2; i <= 8; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("who do we appreciate?");

        int[] nums = {2, 4, 6, 8};
        // for-each loop
        // repeat for each item in a list or array
        for (int a : nums) {
            System.out.print(a + " ");
        }
        System.out.println("who do we appreciate?");

        String[] myBruhs = {"Haley", "Mollie", "Kayley", "Tiffany", "Chris"};
        boolean dupe = false;
        for (int out = 0; out < myBruhs.length; out++) {
            for (int in = out + 1; in < myBruhs.length; in++) {
                if (myBruhs[out].equals(myBruhs[in])) {
                    System.out.println(myBruhs[out] + " has a duplicate");
                    dupe = true;
                }
            }
        }

        if (!dupe)
            System.out.println("No duplicates");

        for (String s : myBruhs)
            System.out.print(s + " ");
        System.out.println();
        // counter-driven loop
        for (int i = 0; i < myBruhs.length; i++)
            System.out.print(myBruhs[i] + " ");
        System.out.println();

        // print names backwards
        for (int i = myBruhs.length - 1; i > -1; i--)
            System.out.print(myBruhs[i] + " ");
        System.out.println();

        int num = 5128, sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);


        /**Scanner in = new Scanner(System.in);
         String input;
         do {
         System.out.print("Lars, are you kidding?");
         input = in.nextLine();
         }   while(input.toLowerCase().equals("no"));
         while(true) {
         System.out.print("keep going? ");
         input = in.nextLine();
         if(input.equals("no"))
         break;
         else if(input.equals("yes"))
         continue;
         else if(input.equals("lars"))
         System.out.println("leave me alone please");
         System.out.println("will this always print?");
         }

         Scanner in = new Scanner(System.in);
         String input = "";
         for(int i = 0; i < 10 && !input.equals("stop"); i++)    {
         System.out.println(i);
         System.out.print("Give me a direction: ");
         input = in.nextLine();
         }
         */
        printPermutations(100);
    }
}
