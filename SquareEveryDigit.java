import java.util.Scanner;

/**
 *  In this kata, you are asked to square every digit of a number and concatenate them.
 * 
 *  For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
 * 
 *  Note: The function accepts an integer and returns an integer
 */
public class SquareEveryDigit {

    public static int squareDigits(int number) {
        String resultString = "";
        String numberString = number + "";
        int lengthOfNumber = numberString.length();

        for (int i = 0; i < lengthOfNumber; i++) {
            String iThChar = String.valueOf(numberString.charAt(i));
            int iThNumber = Integer.parseInt(iThChar);
            int square = iThNumber * iThNumber;
            resultString += square;
        }

        int result = Integer.parseInt(resultString);
        return result;
    }

    public static void main(String[] args) {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tamsayı giriniz : ");
        int inputNumber = scanner.nextInt();
        scanner.close();
        int result = squareDigits(inputNumber);
        System.out.println("Girdiğiniz sayının her bir basamağının karesiyle oluşturulan sayı : " + result);
    }
}