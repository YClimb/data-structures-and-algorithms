package tree;

/**
 * AC 自动机算法
 *
 * @author yclimb
 * @date 2020/9/17
 */
public class AhoCorasick {
    /**
     * https://time.geekbang.org/column/article/72810
     * AC 自动机算法，全称是 Aho-Corasick 算法。
     * 其实，Trie 树跟 AC 自动机之间的关系，就像单串匹配中朴素的串匹配算法，跟 KMP 算法之间的关系一样，只不过前者针对的是多模式串而已。
     * 所以，AC 自动机实际上就是在 Trie 树之上，加了类似 KMP 的 next 数组，只不过此处的 next 数组是构建在树上罢了。
     *
     * AC 自动机的构建，包含两个操作：
     * 1.将多个模式串构建成 Trie 树；
     * 2.在 Trie 树上构建失败指针（相当于 KMP 中的失效函数 next 数组）。
     *
     * 失败指针的构建过程，是一个按层遍历树的过程:
     * 如果我们把树中相同深度的节点放到同一层，那么某个节点的失败指针只有可能出现在它所在层的上一层。
     */
}
