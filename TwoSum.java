/**
 *  http://oj.leetcode.com/problems/two-sum/
 */
class TwoSum {
    public static void main(String[] args) {
        System.out.println();

        int[] numbers1 = { 1, 2, 3 };
        int target1 = 4;

        int[] result = twoSum(numbers1, target1);
        if (result[0] == 0 && result[1] == 2) {
            System.out.println("Passed from Test 1 :)");
        } else {
            System.out.println("Failed from Test 1 :(");
        }
    }

    public static int[] twoSum(int[] numbers, int target) {
        int sizeOfNumbers = numbers.length;
        int[] result = new int[2];

        for (int i = 0; i < sizeOfNumbers - 1; i++) {
            for (int j = i+1; j < sizeOfNumbers; j++) {
                if (numbers[i] + numbers[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }

        return result;
    }
}
