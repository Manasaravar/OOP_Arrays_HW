import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        //   2)	Написать РЕКУРСИВНЫЙ метод, принимающий на вход массив целых чисел и
        //   возвращающий наибольший его элемент (на подумать).

        //   1)	Даны два отсортированных массива данных произвольной длины.
        //   Написать метод, принимающий на вход 2 массива данных и возвращающий результирующий массив,
        //   состоящий из элементов обоих массивов, в отсортированном виде.

        int[] array = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(maxElementArray(array));
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        int[] arr = unitedArrays(arr1, arr2);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
        }
    }
        // метод обЪединения массивов
        public static int[] unitedArrays (int[] arr1, int[] arr2) {
        int[] array = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
        array[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            array[i+arr1.length] = arr2[i];
        }
        Arrays.sort(array);
        return array;
    }
    //метод возвращает максимальное значение
    public static int maxElementArray(int[] array) {
        int amount = array.length;
        if (array.length == 1) {
            return array[0];
        } else {
            int max = maxElementArray(Arrays.copyOf(array, amount - 1));
            if (max > array[amount - 1]) {
                return max;
            } else
                return array[amount - 1];
        }
    }
}

