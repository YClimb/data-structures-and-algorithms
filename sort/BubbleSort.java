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
}
