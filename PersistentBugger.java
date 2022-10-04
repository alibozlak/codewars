import java.util.Scanner;

/**
 * Write a function, <b>persistence</b>, 
 * that takes in a positive parameter num and returns its multiplicative persistence, 
 * which is the number of times you must multiply the digits in num until you reach a single digit.
 * 
 * 39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit).
 * 999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2).
 * 4 --> 0 (because 4 is already a one-digit number).
 */
public class PersistentBugger {
    
    public static int persistence(long number) {
        int count = 0;
        
        while (number > 9) {
            String numberString = number + "";
            int lengthOfNumber = numberString.length();
            long product = 1;

            for (int i = 0; i < lengthOfNumber; i++) {
                String iThNumberString = String.valueOf(numberString.charAt(i));
                int iThNumber = Integer.parseInt(iThNumberString);
                product *= iThNumber;
            }

            number = product;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tamsayı giriniz : ");
        long inputNumber = scanner.nextLong();
        scanner.close();
        int count = persistence(inputNumber);
        System.out.println("Girdiğiniz sayının ısrarı : " + count);
    }
}
