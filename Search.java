public class Search {

    public static <T extends Comparable<T>> int binarySearch(T[] array, T value, int lo, int hi) {
	if (lo < hi) {
	    int mid = (lo / 2) + (hi / 2);
	    int cmp = array[mid].compareTo(value);
	    if (cmp < 0) return binarySearch(array, value, lo, mid - 1);
	    if (cmp > 0) return binarySearch(array, value, mid + 1, hi);
	    return mid;
	} // if
	return -1;
    } // binarySearch

    public static <T extends Comparable<T>> int linearSearch(T[] array, T value, int lo, int hi) {
	for (int i = lo; i <= hi; i++) {
	    if (array[i].compareTo(value) == 0) return i;
	} // for
	return -1;
    } // linearSearch

    public static <T> void swap(T[] array, int lhs, int rhs) {
	T tmp = array[lhs];
	array[lhs] = array[rhs];
	array[rhs] = tmp;
    } // swap

    public static <T extends Comparable<T>> int partition(T[] array, int piv, int lo, int hi) {
	T val = array[piv];
	while (lo < hi) {
	    while (array[lo].compareTo(val) < 0) lo++;
	    while (array[hi].compareTo(val) > 0) hi--;
	    swap(array, lo, hi);
	} // while
	return lo;
    } // partition

} // Search