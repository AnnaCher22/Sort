public class DynamicSort {
    private static final int INSERTION_SORT_THRESHOLD = 20; // Порог для сортировки вставками

    public static void dynamicSort(int[] array) {
        dynamicSort(array, 0, array.length - 1);
    }

    private static void dynamicSort(int[] array, int left, int right) {
        if (right - left < INSERTION_SORT_THRESHOLD) {
            insertionSort(array, left, right); // Используем сортировку вставками для небольших подмассивов
        } else {
            // Используем быструю сортировку для больших подмассивов
            quickSort(array, left, right);
        }
    }

    private static void insertionSort(int[] array, int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= left && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    private static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(array, left, right);
            quickSort(array, left, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, right);
        }
    }

    private static int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, right);
        return i + 1;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
