/**
 * https://www.codewars.com/kata/556deca17c58da83c00002db/train/java
 */
class TribonacciSequence {
    public static void main(String[] args) {
        System.out.println();

        double[] startSequence1 = {1, 1, 1};
        int tribonacciArraySize = 10;

        double[] assertTribonacciArray1 = tribonacci(startSequence1, tribonacciArraySize);
        double[] tribonacciArray1 = {1,1,1,3,5,9,17,31,57,105};
        boolean isPassed = true;

        for (int i = 0; i < tribonacciArraySize; i++) {
            if (assertTribonacciArray1[i] != tribonacciArray1[i]) {
                isPassed = false;
                break;
            }
        }

        if (isPassed) {
            System.out.println("Passed from Test 1 :)");
        } else {
            System.out.println("Failed from Test 1 :(");
        }
    }

    public static double[] tribonacci(double[] startSequence, int arraySize) {
        double[] tribonacciArray = new double[arraySize];

        if (arraySize >= startSequence.length) {
            for (int i = 0; i < startSequence.length; i++) {
                tribonacciArray[i] = startSequence[i];
            }

            for (int i = startSequence.length; i < arraySize; i++) {
                tribonacciArray[i] = tribonacciArray[i-1] + tribonacciArray[i-2] + tribonacciArray[i-3];
            }
        } else {
            for (int i = 0; i < arraySize; i++) {
                tribonacciArray[i] = startSequence[i];
            }
        }

        return tribonacciArray;
    }
}
