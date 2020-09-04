package sort;

/**
 * 插入排序
 *
 * @author yclimb
 * @date 2020/9/4
 */
public class InsertionSort {
    public static void main(String[] args) {

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
