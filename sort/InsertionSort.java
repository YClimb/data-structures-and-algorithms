package sort;

/**
 * 插入排序
 *
 * @author yclimb
 * @date 2020/9/4
 */
public class InsertionSort {
    public static void main(String[] args) {
        /*
         * https://time.geekbang.org/column/article/41802
         * 那插入排序具体是如何借助上面的思想来实现排序的呢？
         * 首先，我们将数组中的数据分为两个区间，已排序区间和未排序区间。
         * 初始已排序区间只有一个元素，就是数组的第一个元素。
         * 插入算法的核心思想是取未排序区间中的元素，在已排序区间中找到合适的插入位置将其插入，并保证已排序区间数据一直有序。
         * 重复这个过程，直到未排序区间中元素为空，算法结束。
         */
    }

    /**
     * 插入排序，a表示数组，n表示数组大小
     * @param a a
     * @param n n
     */
    public void insertionSort(int[] a, int n) {
        if (n <= 1) {
            return;
        }
        for (int i = 1; i < n; ++i) {
            int value = a[i];
            int j = i - 1;
            // 查找插入的位置
            for (; j >= 0; --j) {
                if (a[j] > value) {
                    // 数据移动
                    a[j+1] = a[j];
                } else {
                    break;
                }
            }
            // 插入数据
            a[j+1] = value;
        }
    }
}
