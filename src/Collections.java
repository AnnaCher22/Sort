import java.util.Comparator;
import java.util.List;

public class Collections {

    // Бинарный поиск для списка
    public static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key) {
        return binarySearch(list, 0, list.size() - 1, key);
    }

    public static <T> int binarySearch(List<? extends Comparable<? super T>> list, int fromIndex, int toIndex, T key) {
        while (fromIndex <= toIndex) {
            int mid = fromIndex + (toIndex - fromIndex) / 2;
            int cmp = list.get(mid).compareTo(key);
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

    // Бинарный поиск для списка с компаратором
    public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c) {
        return binarySearch(list, 0, list.size() - 1, key, c);
    }

    public static <T> int binarySearch(List<? extends T> list, int fromIndex, int toIndex, T key, Comparator<? super T> c) {
        while (fromIndex <= toIndex) {
            int mid = fromIndex + (toIndex - fromIndex) / 2;
            int cmp = c.compare(list.get(mid), key);
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
