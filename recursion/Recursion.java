package recursion;
import java.util.HashMap;
import java.util.Map;

/**
 * 递归
 *
 * @author yclimb
 * @date 2020/8/27
 */
public class Recursion {
    public static void main(String[] args) throws Exception {
        System.out.println(f(5));
        System.out.println(f2(5));
        System.out.println(f3(5));
    }

    // 地推深度
    public static int depth = 0;
    /**
     * 假如你站在 n 个台阶上，从这里出发去到第 1 个台阶，一次只能跨 1 个台阶，请问最后跨了多少步？
     * @param n n
     * @return int
     */
    public static int f(int n) throws Exception {
        if (n == 1) {
            return 1;
        }
        // 增加递归深度判断
        depth++;
        if (depth > 5) {
            throw new Exception();
        }
        return f(n - 1) + 1;
    }

    /**
     * 假如这里有 n 个台阶，每次你可以跨 1 个台阶或者 2 个台阶，请问走这 n 个台阶有多少种走法？
     * @param n n
     * @return int
     */
    public static int f2(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return f2(n-1) + f2(n-2);
    }

    // hasSolvedList可以理解成一个Map，key是n，value是f(n)
    static Map<Integer, Integer> hasSolvedList = new HashMap<>();
    /**
     * f2 避免重复计算的递归
     * @param n n
     * @return int
     */
    public static int f3(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        // hasSolvedList可以理解成一个Map，key是n，value是f(n)
        if (hasSolvedList.containsKey(n)) {
            return hasSolvedList.get(n);
        }
        int ret = f3(n - 1) + f3(n - 2);
        hasSolvedList.put(n, ret);
        return ret;
    }
}

