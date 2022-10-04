import java.util.Scanner;

/**
 * Usually when you buy something, you're asked whether your credit card number, 
 * phone number or answer to your most secret question is still correct. 
 * However, since someone could look over your shoulder, you don't want that shown on your screen. 
 * Instead, we mask it.
 * 
 * Your task is to write a function maskify, which changes all but the last four characters into '#'.
 */
public class CreditCardMask {

    public static String maskify(String creditCardNumber) {
        if (creditCardNumber.length() < 5) {
            return creditCardNumber;
        }

        int lengthOfCardNumber = creditCardNumber.length();
        String secret = "";
        for (int i = 0; i < lengthOfCardNumber-4; i++) {
            secret += "#";
        }

        String secretCardNumber = secret + creditCardNumber.substring(lengthOfCardNumber-4, lengthOfCardNumber);
        return secretCardNumber;
    }

    public static void main(String[] args) {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir yazı veya kart numarası giriniz : ");
        String text = scanner.nextLine();
        scanner.close();

        String secretedText = maskify(text);
        System.out.println("Maskelenmiş yazınız : " + secretedText);
    }
}
