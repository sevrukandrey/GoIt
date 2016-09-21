package M6.Task3;

/**
 * Created by asevruk on 9/21/2016.
 */
public final class ArraysUtils {


    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }


    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }


    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;

    }


    public static int maxPositive(int[] array) {

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        return max;

    }


    public static long multiplication(int[] array) {
        int sum = 1;
        for (int i = 0; i < array.length; i++) {
            sum *= array[i];
        }
        return sum;
    }


    public static int secondLargest(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }

        return array[1];
    }

    public static void main(String[] args) {
        int[] asd = {112, 20, 30, 100, 32, 23, 55, 643, 34, 5, 7, 9, 0, 45, 44, 66, 88, 888};

        findEvenElements(asd);
    }

    public static int[] reverse(int[] array) {
        int[] revArray = new int[array.length];
        for (int i = 0; i < revArray.length; i++) {
            revArray[i] = array[array.length - i - 1];

        }
        return revArray;
    }

    public static int[] findEvenElements(int[] array) {
        int lenghtOfArray = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                lenghtOfArray++;
            }

        }
        int[] newArray = new int[lenghtOfArray];
        int count = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                newArray[count] = array[i];
                count++;
            }


        }
        return newArray;
    }

}
