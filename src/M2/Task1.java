package M2;

/**
 * Created by asevruk on 8/23/2016.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] array = {10, -1, -100, -99, -98,1, 1, 1, 1, 3};
        double[] array2 = {10.0, -1.1, 1.1, 1.1, 1.1, 11.1, 10.1, 1.1, 1.1, 3.0};

        System.out.println(sum(array));
        System.out.println(sum(array2));
        System.out.println(min(array));
        System.out.println(min(array2));
        System.out.println(max(array));
        System.out.println(max(array2));
        System.out.println(maxPositive(array));
        System.out.println(maxPositive(array2));
        System.out.println(multiplication(array));
        System.out.println(multiplication(array2));
        System.out.println(secondLargest(array));
        System.out.println(secondLargest(array2));
        System.out.println(moddulus(array2));
        System.out.println(modulus(array));


    }

    public static double moddulus(double[] array) {
        return array[0]%array[array.length-1];
    }

    public static double modulus(int[] array) {
        return array[0]%array[array.length-1];
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
        int max = array[0];
        int max2 = array[0];


        for (int i = 0; i < array.length; i++) {
           if (array[i]>max){
           max2=max;
           max=array[i];
           } else
               if (max2<array[i]){
                max2=array[i];
               }
        }
return  max2;
        }



    public static double secondLargest(double[] array) {
        double max = array[0];
        double secondLargest = array[1];
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
