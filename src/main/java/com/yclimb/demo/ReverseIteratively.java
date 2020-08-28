package com.yclimb.demo;

/**
 * 数组的反转
 *
 * @author yclimb
 * @date 2020/8/28
 */
public class ReverseIteratively {
    public static void main(String[] args) {
        String str = "1234";
        String[] strs = traverse(str.split(""));
        for (String s : strs) {
            System.out.println(s);
        }
    }

    /**
     * 循环数组，首尾互相替换
     * @param strs s[]
     * @return String[]
     */
    public static String[] traverse(String[] strs) {
        /*int j = 0;
        for (int i = strs.length - 1; i >= 0; i--) {
            if (i < j) {
                break;
            }
            String tmp = strs[i];
            strs[i] = strs[j];
            strs[j] = tmp;
            j++;
        }*/
        int j = strs.length - 1;
        for (int i = 0; i < strs.length / 2; i++) {
            String tmp = strs[j];
            strs[j] = strs[i];
            strs[i] = tmp;
            j--;
        }
        return strs;
    }
}
