package sort;

/**
 * 冒泡排序
 *
 * @author yclimb
 * @date 2020/9/1
 */
public class BubbleSort {
    public static void main(String[] args) {

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
                if (a[j] > a[j+1]) { // 交换
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    flag = true;  // 表示有数据交换
                }
            }
            if (!flag) {
                break;  // 没有数据交换，提前退出
            }
        }
    }
}
