package index;

/**
 * 索引
 *
 * @author yclimb
 * @date 2020/9/24
 */
public class Index {
    public static void main(String[] args) {
        /**
         * https://time.geekbang.org/column/article/78449
         *
         * 索引这个概念，非常好理解。你可以类比书籍的目录来理解。
         * 如果没有目录，我们想要查找某个知识点的时候，就要一页一页翻。通过目录，我们就可以快速定位相关知识点的页数，查找的速度也会有质的提高。
         *
         * 对于不同需求的索引结构，底层一般使用哪种数据结构？
         * 实际上，常用来构建索引的数据结构，就是常用的几种支持动态数据集合的数据结构。
         * 比如，散列表、红黑树、跳表、B+ 树。除此之外，位图、布隆过滤器可以作为辅助索引，有序数组可以用来对静态数据构建索引。
         *
         * 索引构建：
         * 1.散列表增删改查操作的性能非常好，时间复杂度是 O(1)。一些键值数据库，比如 Redis、Memcache，就是使用散列表来构建索引的。这类索引，一般都构建在内存中。
         * 2.跳表也支持快速添加、删除、查找数据。而且，我们通过灵活调整索引结点个数和数据个数之间的比例，可以很好地平衡索引对内存的消耗及其查询效率。Redis 中的有序集合，就是用跳表来构建的。
         * 3.红黑树作为一种常用的平衡二叉查找树，数据插入、删除、查找的时间复杂度是 O(logn)，也非常适合用来构建内存索引。Ext 文件系统中，对磁盘块的索引，用的就是红黑树。
         * 4.B+ 树比起红黑树来说，更加适合构建存储在磁盘中的索引。B+ 树是一个多叉树，所以，对相同个数的数据构建索引，B+ 树的高度要低于红黑树。当借助索引查询数据的时候，读取 B+ 树索引，需要的磁盘 IO 次数会更少。所以，大部分关系型数据库的索引，比如 MySQL、Oracle，都是用 B+ 树来实现的。
         *
         * 如果用一句话描述“索引”的作用，那会是什么？我想是这样：索引是用来辅助查找，用计算机专业术语叫：Addressing(寻址）
         *
         */
    }
}