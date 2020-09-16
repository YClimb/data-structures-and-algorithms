package string;

/**
 * 字符串匹配
 *
 * @author yclimb
 * @date 2020/9/16
 */
public class StringMatching {
    /**
     * https://time.geekbang.org/column/article/71187
     *
     * 概念：主串和模式串。
     * 比方说，我们在字符串 A 中查找字符串 B，那字符串 A 就是主串，字符串 B 就是模式串。
     * 我们把主串的长度记作 n，模式串的长度记作 m。因为我们是在主串中查找模式串，所以 n>m。
     *
     * 1.单模式串匹配的算法：BF 算法和 RK 算法
     * 1.1.BF 算法中的 BF 是 Brute Force 的缩写，中文叫作暴力匹配算法，也叫朴素匹配算法。
     * BF 算法的思想：在主串中，检查起始位置分别是 0、1、2…n-m 且长度为 m 的 n-m+1 个子串，看有没有跟模式串匹配的。（顺序依次匹配）
     *
     * 1.2.RK 算法的全称叫 Rabin-Karp 算法，是由它的两位发明者 Rabin 和 Karp 的名字来命名的。
     * RK 算法的思路是这样的：我们通过哈希算法对主串中的 n-m+1 个子串分别求哈希值，然后逐个与模式串的哈希值比较大小。
     * 如果某个子串的哈希值与模式串相等，那就说明对应的子串和模式串匹配了（这里先不考虑哈希冲突的问题，如果冲突了，可以再比较串）。
     * 因为哈希值是一个数字，数字之间比较是否相等是非常快速的，所以模式串和子串比较的效率就提高了。
     *
     * https://time.geekbang.org/column/article/71525
     * 2.单模式串匹配的算法：BM 算法和 KMP 算法
     * 2.1.BM（Boyer-Moore）算法，它是一种非常高效的字符串匹配算法，有实验统计，它的性能是著名的 KMP 算法的 3 到 4 倍。
     * BM 算法包含两部分，分别是坏字符规则（bad character rule）和好后缀规则（good suffix shift）。
     * 坏字符规则：从模式串的末尾往前倒着匹配，当我们发现某个字符没法匹配的时候。我们把这个没有匹配的字符叫作坏字符（主串中的字符）。
     * 好后缀规则：从模式串的末尾往前倒着匹配，当模式串和主串有 x>1 个字符是匹配的，我们把这个匹配的字符串叫做好后缀字符串。
     *
     * BM 算法核心思想是，利用模式串本身的特点，在模式串中某个字符与主串不能匹配的时候，将模式串往后多滑动几位，以此来减少不必要的字符比较，提高匹配的效率。
     * BM 算法构建的规则有两类，坏字符规则和好后缀规则。
     * 好后缀规则可以独立于坏字符规则使用。因为坏字符规则的实现比较耗内存，为了节省内存，我们可以只用好后缀规则来实现 BM 算法。
     *
     * https://time.geekbang.org/column/article/71845
     * 2.2.KMP 算法是在 Brute-Force 算法的基础上同时提出的模式匹配的改进算法，由D.E.Knuth，J.H.Morris和V.R.Pratt提出的，因此人们称它为克努特—莫里斯—普拉特操作（简称KMP算法）。
     * KMP算法的核心是利用匹配失败后的信息，尽量减少模式串与主串的匹配次数以达到快速匹配的目的。
     * 具体实现就是通过一个next()函数实现，函数本身包含了模式串的局部匹配信息。
     * KMP算法的时间复杂度O(m+n)
     *
     *
     * 3.多模式串匹配算法：Trie 树和 AC 自动机
     */
}
