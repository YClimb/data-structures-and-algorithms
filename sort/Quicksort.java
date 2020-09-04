package sort;

/**
 * 快速排序
 *
 * @author yclimb
 * @date 2020/9/4
 */
public class Quicksort {
    public static void main(String[] args) {
        /**
         * https://time.geekbang.org/column/article/41913
         * https://github.com/wangzheng0822/algo/blob/master/java/12_sorts/QuickSort.java
         * 快速排序算法（Quicksort），我们习惯性把它简称为“快排”。快排利用的也是分治思想。
         * 快排的思想是这样的：如果要排序数组中下标从 p 到 r 之间的一组数据，我们选择 p 到 r 之间的任意一个数据作为 pivot（分区点）。
         */
    }

    // 快速排序，a是数组，n表示数组的大小
    public static void quickSort(int[] a, int n) {
        quickSortInternally(a, 0, n-1);
    }

    // 快速排序递归函数，p,r为下标
    private static void quickSortInternally(int[] a, int p, int r) {
        if (p >= r) {
            return;
        }

        // 获取分区点
        int q = partition(a, p, r);
        quickSortInternally(a, p, q-1);
        quickSortInternally(a, q+1, r);
    }

    private static int partition(int[] a, int p, int r) {
        int pivot = a[r];
        int i = p;
        for(int j = p; j < r; ++j) {
            if (a[j] < pivot) {
                if (i == j) {
                    ++i;
                } else {
                    int tmp = a[i];
                    a[i++] = a[j];
                    a[j] = tmp;
                }
            }
        }

        int tmp = a[i];
        a[i] = a[r];
        a[r] = tmp;

        System.out.println("i=" + i);
        return i;
    }
}
