package array;

/**
 * 断号查询:求len长数组a[]中缺少的顺序数字
 *
 * @author yclimb
 * @date 2020/9/4
 */
public class BrokenNumber {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 5};
        System.out.println(get(a, 5));
    }

    /**
     * 断号查询:求len长数组a[]中缺少的顺序数字
     * PS:不能是首和尾缺失
     * @param a 数组
     * @param len 数组长度
     * @return 缺少的数字
     */
    public static int get(int[] a, int len) {
        int sum = 0;
        for (int value : a) {
            sum += value;
        }
        return (len + 1) * len / 2 - sum;
    }
}
