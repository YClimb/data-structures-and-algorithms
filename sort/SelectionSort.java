package sort;

/**
 * 选择排序
 *
 * @author yclimb
 * @date 2020/9/4
 */
public class SelectionSort {
    public static void main(String[] args) {
        /*
         * https://time.geekbang.org/column/article/41802
         * https://github.com/wangzheng0822/algo/blob/master/java/11_sorts/Sorts.java
         * 选择排序算法的实现思路有点类似插入排序，也分已排序区间和未排序区间。
         * 但是选择排序每次会从未排序区间中找到最小的元素，将其放到已排序区间的末尾。
         */
    }

    /**
     * 选择排序，a表示数组，n表示数组大小
     * @param a a
     * @param n n
     */
    public static void selectionSort(int[] a, int n) {
        if (n <= 1) {
            return;
        }
        for (int i = 0; i < n - 1; ++i) {
            // 查找最小值
            int minIndex = i;
            for (int j = i + 1; j < n; ++j) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            // 交换
            int tmp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = tmp;
        }
    }
}
