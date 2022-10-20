/**
 * https://www.codewars.com/kata/5270d0d18625160ada0000e4/train/java
 */
class Greed {
    public static int greedy(int[] dice) {
        int[] howMany = { 0, 0, 0, 0, 0, 0 }; 
        for (int i = 0; i < 5; i++) {
            howMany[dice[i]-1]++;
        }

        int score = 0;

        for (int i = 0; i < 6; i++) {
            if (howMany[i] > 2) {
                if (i > 0) {
                    score += (i+1)*100;
                } else {
                    score += 1000;
                }
                howMany[i] -= 3;
            }
        }

        score += (howMany[0]*100) + (howMany[4]*50);
        return score;
    }
}
