package M2;

/**
 * Created by asevruk on 8/23/2016.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] array = {10, -1, -100, -99, -98, 1, 1, 1, 1, 3};
        double[] array2 = {10.0, -1.1, 1.1, 1.1, 1.1, 11.1, 10.1, 1.1, 1.1, 3.0};
        System.out.println("Sumof int "+sum(array));
        System.out.println("Sun of double "+sum(array2));
        System.out.println("Min int "+min(array));
        System.out.println("Min double "+min(array2));
        System.out.println("Max int "+max(array));
        System.out.println("Max double "+max(array2));
        System.out.println("Max positive of int "+maxPositive(array));
        System.out.println("Max positive of "+maxPositive(array2));
        System.out.println("Multiplication of int "+multiplication(array));
        System.out.println("Multiplication of "+multiplication(array2));
        System.out.println("Second largest of int "+secondLargest(array));
        System.out.println("Second largest of double "+secondLargest(array2));
        System.out.println("Modulus of int "+moddulus(array2));
        System.out.println("Modulus of double "+modulus(array));




    }

    public static double moddulus(double[] array) {
        return array[0] % array[array.length - 1];
    }

    public static double modulus(int[] array) {
        return array[0] % array[array.length - 1];
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double sum(double[] array) {
        double sum = 0;
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

    public static double min(double[] array) {
        double min = array[0];
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

    public static double max(double[] array) {
        double max = array[0];
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

    public static double maxPositive(double[] array) {

        double max = array[0];
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

    public static double multiplication(double[] array) {
        double sum = 1;
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


    public static double secondLargest(double[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
                    double t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }


        return array[1];

    }
}