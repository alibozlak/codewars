/**
 * Write a function that takes in a string of one or more words, 
 * and returns the same string, but with all five or more letter words reversed. 
 * Strings passed in will consist of only letters and spaces. 
 * Spaces will be included only when more than one word is present.
 */
public class SpinWords {
    
    // I forgot using reverse method of String
    public static String spinWords(String sentence) {
        String[] sentenceArray = sentence.split(" ");

        String newSentence = "";
        int lengthArray = sentenceArray.length;
        for (int i = 0; i < lengthArray; i++) {

            int iThWordLength = sentenceArray[i].length();
            if (iThWordLength > 4) {
                for (int c = iThWordLength-1; c > -1; c--) {
                    newSentence += sentenceArray[i].charAt(c);
                }
            } else {
                newSentence += sentenceArray[i];
            }

            newSentence += " ";

        }

        // newSentence += "\b";
        newSentence = newSentence.substring(0, newSentence.length()-1);
        return newSentence;
    }

    public static void main(String[] args) {
        System.out.println();

        String sentence = "This sentence is a sample text";
        System.out.println(sentence + " : " + spinWords(sentence));
    }
}
