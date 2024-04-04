import java.lang.reflect.Array;
import java.util.Arrays;

public class AssignSoal1 {
    public static void main(String[] args) {
        //init
        int[] numbers = {2, 3, 5, 6, 9};
        int[] numbers2 = {1, 2, 3, 4};

        //assign --> cari median
        System.out.println("Deret angka: " + Arrays.toString(numbers));
        System.out.println("Median deret angka di atas: " + getMedian(numbers));

        System.out.println("Deret angka: " + Arrays.toString(numbers2));
        System.out.println("Median deret angka di atas: " + getMedian(numbers2));
    }
    public static double getMedian(int[] array) {
        // Check if the length of the array is even
//        if (array.length % 2 == 0) {
//            // Calculate the median for even-sized arrays
//            int mid = array.length / 2;
//            return (array[mid] + array[mid - 1]) / 2;
//        }
//        // Calculate the median for odd-sized arrays
//        return array[array.length / 2];
        double mid;
        Arrays.sort(array);
        if (array.length % 2 == 0) {
            mid = (array[array.length / 2] + array[array.length / 2 - 1]) / 2.0;
        } else {
            mid = array[array.length / 2];
        }
        return mid;
    }
}
