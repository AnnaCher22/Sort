import java.util.Comparator;

public class Arrays {

    // Бинарный поиск для массива байтов
    public static int binarySearch(byte[] a, byte key) {
        return binarySearch(a, 0, a.length - 1, key);
    }

    public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        while (fromIndex <= toIndex) {
            int mid = fromIndex + (toIndex - fromIndex) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key) {
                fromIndex = mid + 1;
            } else {
                toIndex = mid - 1;
            }
        }
        return -1; // Элемент не найден
    }

    // Бинарный поиск для массива символов
    public static int binarySearch(char[] a, char key) {
        return binarySearch(a, 0, a.length - 1, key);
    }

    public static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        while (fromIndex <= toIndex) {
            int mid = fromIndex + (toIndex - fromIndex) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key) {
                fromIndex = mid + 1;
            } else {
                toIndex = mid - 1;
            }
        }
        return -1;
    }

    // Бинарный поиск для массива double
    public static int binarySearch(double[] a, double key) {
        return binarySearch(a, 0, a.length - 1, key);
    }

    public static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        while (fromIndex <= toIndex) {
            int mid = fromIndex + (toIndex - fromIndex) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key) {
                fromIndex = mid + 1;
            } else {
                toIndex = mid - 1;
            }
        }
        return -1;
    }

    // Бинарный поиск для массива float
    public static int binarySearch(float[] a, float key) {
        return binarySearch(a, 0, a.length - 1, key);
    }

    public static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        while (fromIndex <= toIndex) {
            int mid = fromIndex + (toIndex - fromIndex) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key) {
                fromIndex = mid + 1;
            } else {
                toIndex = mid - 1;
            }
        }
        return -1;
    }

    // Бинарный поиск для массива int
    public static int binarySearch(int[] a, int key) {
        return binarySearch(a, 0, a.length - 1, key);
    }

    public static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        while (fromIndex <= toIndex) {
            int mid = fromIndex + (toIndex - fromIndex) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key) {
                fromIndex = mid + 1;
            } else {
                toIndex = mid - 1;
            }
        }
        return -1;
    }

    // Бинарный поиск для массива long
    public static int binarySearch(long[] a, long key) {
        return binarySearch(a, 0, a.length - 1, key);
    }

    public static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        while (fromIndex <= toIndex) {
            int mid = fromIndex + (toIndex - fromIndex) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key) {
                fromIndex = mid + 1;
            } else {
                toIndex = mid - 1;
            }
        }
        return -1;
    }

    // Бинарный поиск для массива short
    public static int binarySearch(short[] a, short key) {
        return binarySearch(a, 0, a.length - 1, key);
    }

    public static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        while (fromIndex <= toIndex) {
            int mid = fromIndex + (toIndex - fromIndex) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key) {
                fromIndex = mid + 1;
            } else {
                toIndex = mid - 1;
            }
        }
        return -1;
    }

    // Бинарный поиск для массива объектов с компаратором
    public static <T> int binarySearch(T[] a, T key, Comparator<? super T> c) {
        return binarySearch(a, 0, a.length - 1, key, c);
    }

    public static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<? super T> c) {
        while (fromIndex <= toIndex) {
            int mid = fromIndex + (toIndex - fromIndex) / 2;
            int cmp = c.compare(a[mid], key);
            if (cmp == 0) {
                return mid;
            } else if (cmp < 0) {
                fromIndex = mid + 1;
            } else {
                toIndex = mid - 1;
            }
        }
        return -1;
    }
}