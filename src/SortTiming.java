import java.util.Arrays;
import java.util.Random;

public class SortTiming {
    private static final int NUM_TRIALS = 10; // Количество запусков для усреднения

    public static void main(String[] args) {
        int[] sizes = {10, 100, 1000, 10000, 100000}; // Размеры массивов
        for (int size : sizes) {
            int[] array = generateRandomArray(size);
            measureSortingTimes(array);
        }
    }

    private static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(size);
        }
        return array;
    }

    private static void measureSortingTimes(int[] array) {
        long bubbleTime = measureTime(SortingAlgorithms::bubbleSort, array);
        long insertionTime = measureTime(SortingAlgorithms::insertionSort, array);
        long mergeTime = measureTime(SortingAlgorithms::mergeSort, array);
        long quickTime = measureTime(SortingAlgorithms::quickSort, array);

        System.out.printf("Bubble Sort: %d ns, Insertion Sort: %d ns, Merge Sort: %d ns, Quick Sort: %d ns%n",
                bubbleTime, insertionTime, mergeTime, quickTime);
    }

    private static long measureTime(SortingFunction sortFunction, int[] array) {
        long totalTime = 0;
        for (int i = 0; i < NUM_TRIALS; i++) {
            int[] copy = Arrays.copyOf(array, array.length);
            long startTime = System.nanoTime();
            sortFunction.sort(copy);
            long endTime = System.nanoTime();
            totalTime += (endTime - startTime);
        }
        return totalTime / NUM_TRIALS; // Возвращаем усредненное время
    }

    @FunctionalInterface
    interface SortingFunction {
        void sort(int[] array);
    }
}
