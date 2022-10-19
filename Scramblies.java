/**
 * https://www.codewars.com/kata/55c04b4cc56a697bb0000048/train/java
 */
class Scramblies {

    public static boolean betterScramble(String str1, String str2) {
        int sizeOfStr2 = str2.length();
        StringBuffer string = new StringBuffer(str1);
        
        for (int i = 0; i < sizeOfStr2; i++) {
            
            int index = string.indexOf(str2.charAt(i) + "");
            if (index == -1) {
                return false;
            } else {
                string.setCharAt(index, '*');
            }
        }
        return true;
    }

    /**
     * Perfarmace of this method is bad :(
     */
    public static boolean scramble(String str1, String str2) {
        
        for (int i = 0; i < str2.length(); i++) {
            
            int index = str1.indexOf(str2.substring(i, i + 1));
            if (index == -1) {
                return false;
            } else if (index == 0) {
                str1 = "*" + str1.substring(1);
            } else if (index == str1.length() - 1) {
                str1 = str1.substring(0, index) + "*";
            } else {
                str1 = str1.substring(0, index) + "*" + str1.substring(index + 1);
            }
        }
        return true;
    }
}
