package sort;

/**
 * 冒泡排序
 *
 * @author yclimb
 * @date 2020/9/1
 */
public class BubbleSort {
    public static void main(String[] args) {
        /*
         * https://time.geekbang.org/column/article/41802
         * https://github.com/wangzheng0822/algo/blob/master/java/11_sorts/Sorts.java
         * 冒泡排序只会操作相邻的两个数据。
         * 每次冒泡操作都会对相邻的两个元素进行比较，看是否满足大小关系要求。
         * 如果不满足就让它俩互换。
         * 一次冒泡会让至少一个元素移动到它应该在的位置，重复 n 次，就完成了 n 个数据的排序工作。
         */
        int[] arr = new int[]{1, 3, 4, 2, 5};
        bubbleSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    /**
     * 冒泡排序，a表示数组，n表示数组大小
     * @param a a
     * @param n n
     */
    public void bubbleSort(int[] a, int n) {
        if (n <= 1) {
            return;
        }

        for (int i = 0; i < n; ++i) {
            // 提前退出冒泡循环的标志位
            boolean flag = false;
            for (int j = 0; j < n - i - 1; ++j) {
                // 交换
                if (a[j] > a[j+1]) {
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    // 表示有数据交换
                    flag = true;
                }
            }
            if (!flag) {
                // 没有数据交换，提前退出
                break;
            }
        }
    }

    /**
     * 向下冒泡算法
     * 算法概要：
     * 从0开始，用这个元素去跟后面的所有元素比较，如果发现这个元素大于后面的某个元素，则交换。
     * @param arr a
     */
    public static void bubbleSort(int[] arr) {
        int len = arr.length;
        if (len == 1) {
            return;
        }
        // 外循环遍历每一个元素
        for (int i = 0; i < len; i++) {
            // 内循环将比较前后两个元素大小，前>后，则位置调换
            /*for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }*/
            for (int j = i + 1; j < len; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
