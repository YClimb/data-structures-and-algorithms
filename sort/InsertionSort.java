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
        int[] arr = new int[]{1, 3, 4, 2, 5};
        insertionSort(arr, arr.length);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    /**
     * 插入排序，a表示数组，n表示数组大小
     *
     * @param a a
     * @param n n
     */
    public static void insertionSort(int[] a, int n) {
        if (n <= 1) {
            return;
        }
        // 外循环整个数组，从1开始，默认[已排序区间]为第一个元素
        for (int i = 1; i < n; ++i) {
            int value = a[i];
            // 内循环当前下标以下的数组，也就是当前arr[i]比较[已排序区间]所有数据
            int j = i - 1;
            // 比较[已排序区间]内的数据，如果小于里面的一个元素，则替换当前元素，其他元素后移
            for (; j >= 0; --j) {
                if (a[j] > value) {
                    // 数据后移，例如：1342，循环一次变为1344，继续：1334，这时候a[j]=1<2，再替换a[j+1]=3=value;结果为:1234
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            // 替换当前元素，后移元素后，a[j+1]会重复，所以替换为当前a[i]即可
            a[j + 1] = value;
        }
    }
}
