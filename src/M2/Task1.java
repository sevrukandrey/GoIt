package M2;

/**
 * Created by asevruk on 8/23/2016.
 */
public class Task1 {
    public static void main(String[] args) {
        int array[] = {1, -1, -100, 99, 98, 1, 1, 1, 1, 1};
        double array2[] = {1.1, -1.1, 1.1, 1.1, 1.1, 11.1, 10.1, 1.1, 1.1, 1.1};
        System.out.println(sum(array));
        System.out.println(sum(array2));
        System.out.println(min(array));
        System.out.println(min(array2));
        System.out.println(max(array));
        System.out.println(max(array2));
        System.out.println(multiplication(array));
        System.out.println(multiplication(array2));
        System.out.println(secondLargest(array));
        System.out.println(secondLargest(array2));
        System.out.println(maxPositive(array));

    }

    public static int sum(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double sum(double array[]) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int min(int array[]) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static double min(double array[]) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static int max(int array[]) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static double max(double array[]) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static void maxPositive(int array[]) {

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
     if (max < 0)
         System.out.println("???? ??????");
        System.out.println(max);

    }


    public static int multiplication(int array[]) {
        int sum = 1;
        for (int i = 0; i < array.length; i++) {
            sum *= array[i];
        }
        return sum;
    }

    public static double multiplication(double array[]) {
        double sum = 1;
        for (int i = 0; i < array.length; i++) {
            sum *= array[i];
        }
        return sum;
    }

    public static int secondLargest(int array[]) {
        int max = array[0];
        int secondLargest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < max && array[i] > secondLargest) {
                secondLargest = array[i];
            }

        }
        return secondLargest;
    }

    public static double secondLargest(double array[]) {
        double max = array[0];
        double secondLargest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < max && array[i] > secondLargest) {
                secondLargest = array[i];
            }

        }
        return secondLargest;
    }

}
