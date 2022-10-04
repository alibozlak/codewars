/**
 * Your goal in this kata is to implement a difference function, 
 * which subtracts one list from another and returns the result. 
 * 
 * It should remove all values from list a, which are present in list b keeping their order.
 */
public class ArrayDiff {
    public static int[] arrayDiff(int[] arrayA, int[] arrayB) {

        for (int numberArrayB : arrayB) {
            for (int i = 0; i < arrayA.length; i++) {
                while ((arrayA.length != i) && (arrayA[i] == numberArrayB)) {
                    int[] temp = new int[arrayA.length - 1];

                    for (int j = i; j < arrayA.length-1; j++) {
                        arrayA[j] = arrayA[j+1];
                    }

                    for (int j = 0; j < arrayA.length-1; j++) {
                        temp[j] = arrayA[j];
                    }

                    arrayA = temp;
                }
            }
        }

        return arrayA;
    }

    public static void main(String[] args) {
        System.out.println();

        int[] arrayA = {};
        int[] arrayB = {1 , 2};

        System.out.print("Array A : ");
        for (int numberArrayA : arrayA) {
            System.out.print(numberArrayA + "  ");
        }
        System.out.println();

        System.out.print("Array B : ");
        for (int numberArrayB : arrayB) {
            System.out.print(numberArrayB + "  ");
        }
        System.out.println();

        int[] diffArray = arrayDiff(arrayA, arrayB);

        System.out.print("Array Diffrent : ");
        for (int numberDiffArray : diffArray) {
            System.out.print(numberDiffArray + "  ");
        }
        System.out.println();
    }
}
