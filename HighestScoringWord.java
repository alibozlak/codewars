import java.util.Scanner;

/**
 * Given a string of words, you need to find the highest scoring word.
 * 
 * Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
 * 
 * You need to return the highest scoring word as a string.
 * 
 * If two words score the same, return the word that appears earliest in the original string.
 * 
 * All letters will be lowercase and all inputs will be valid.
 */
public class HighestScoringWord {

    public static String getHighestScoreWord(String sentence) {
        String[] words = sentence.split(" ");
        int lengthWords = words.length;
        int[] scores = new int[lengthWords];

        for (int i = 0; i < lengthWords; i++) {
            int sum = 0;
            for (int j = 0; j < words[i].length(); j++) {
                char jThChar = words[i].charAt(j);
                int asciiValue = jThChar;
                int ourValue = asciiValue - 96;
                sum += ourValue;
            }
            scores[i] = sum;
        }

        int maxScore = scores[0];
        int indexOfMaxScore = 0;
        for (int i = 1; i < lengthWords; i++) {
            if (maxScore < scores[i]) {
                maxScore = scores[i];
                indexOfMaxScore = i;
            }
        }

        return words[indexOfMaxScore];
    }

    public static void main(String[] args) {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your sentence : ");
        String sentence = scanner.nextLine();
        scanner.close();
        
        String highestScoreWord = getHighestScoreWord(sentence);
        System.out.println("The word with the highest score : " + highestScoreWord);
    }
}