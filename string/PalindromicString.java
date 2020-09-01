package string;

/**
 * 回文字符串：是一个正读和反读都一样的字符串。
 *
 * @author yclimb
 * @date 2020/8/27
 */
public class PalindromicString {
    public static void main(String[] args) {
        String str = "no1on";
        System.out.println(check(str));
    }

    public static boolean check(String str) {
        if (str == null || "".equals(str)) {
            return false;
        }
        if (str.length() == 1) {
            return true;
        }
        String[] strs = str.split("");
        // 最大的长度
        int max = strs.length;
        // 从头开始遍历的值
        int min = 0;
        // 从0开始遍历，只需要遍历数组长度的1/2即可
        //for (; min < max / 2; min++) {
        for (; min < max - min; min++) {
            System.out.println(strs[min] + "--" + strs[max - 1 - min]);
            if (!strs[min].equals(strs[max - 1 - min])) {
                return false;
            }
        }
        return true;
    }
}
