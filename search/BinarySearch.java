package search;

import sort.SelectionSort;

/**
 * 二分查找
 *
 * @author yclimb
 * @date 2020/9/7
 */
public class BinarySearch {
    public static void main(String[] args) {
        /**
         * https://time.geekbang.org/column/article/42733
         * 二分查找（Binary Search）算法，也叫折半查找算法。
         * 二分查找针对的是一个有序的数据集合，查找思想有点类似分治思想。
         * 每次都通过跟区间的中间元素对比，将待查找的区间缩小为之前的一半，直到找到要查找的元素，或者区间被缩小为 0。
         */
        int[] arr = new int[]{4,5,6,1,2,3};
        // 先排序
        SelectionSort.selectionSort(arr, arr.length);
        System.out.println(bsearch(arr, 3));
    }

    /**
     * 给定一个数，查出他的下标
     * @param arr arr
     * @param value v
     */
    public static int bsearch(int[] arr, int value) {
        int low = 0;
        int hign = arr.length - 1;
        while (low <= hign) {
            int mid = low + ((hign - low) >> 1);
            if (arr[mid] == value) {
                return mid;
            } else {
                low++;
            }
        }
        return -1;
    }
}
