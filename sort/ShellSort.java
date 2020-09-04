package sort;

/**
 * 希尔排序
 *
 * @author yclimb
 * @date 2020/9/4
 */
public class ShellSort {
    public static void main(String[] args) {
        /*
         * https://github.com/wangzheng0822/algo/blob/master/java/11_sorts/SortsAddOn.java
         * 希尔排序(Shell's Sort)是插入排序的一种又称“缩小增量排序”（Diminishing Increment Sort），
         * 是直接插入排序算法的一种更高效的改进版本。希尔排序是非稳定排序算法。该方法因 D.L.Shell 于 1959 年提出而得名。
         * 希尔排序是把记录按下标的一定增量分组，对每组使用直接插入排序算法排序；
         * 随着增量逐渐减少，每组包含的关键词越来越多，当增量减至 1 时，整个文件恰被分成一组，算法便终止。
         */
    }

    /**
     * 希尔排序
     * @param arr arr
     */
    private static void shellSort(int[] arr) {
        int len = arr.length;
        if (len == 1) {
            return;
        }

        int step = len / 2;
        while (step >= 1) {
            for (int i = step; i < len; i++) {
                int value = arr[i];
                int j = i - step;
                for (; j >= 0; j -= step) {
                    if (value < arr[j]) {
                        arr[j+step] = arr[j];
                    } else {
                        break;
                    }
                }
                arr[j+step] = value;
            }

            step = step / 2;
        }
    }
}
