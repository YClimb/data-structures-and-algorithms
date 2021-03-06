package map;

/**
 * 位图
 *
 * @author yclimb
 * @date 2020/9/18
 */
public class BitMap {
    public static void main(String[] args) {
        /**
         * https://time.geekbang.org/column/article/76827
         * https://mp.weixin.qq.com/s/xxauNrJY9HlVNvLrL5j2hg
         *
         * 我们有 1 千万个整数，整数的范围在 1 到 1 亿之间。如何快速查找某个整数是否在这 1 千万个整数中呢？
         *
         * 位图（BitMap）
         * 位图是一个二进制bit数组，数组每一位有0/1两个值，如果存在则是1，否则是0；
         * 位图通过数组下标来定位数据，所以，访问效率非常高。而且，每个数字用一个二进制位来表示，在数字范围不大的情况下，所需要的内存空间非常节省。
         * 可用于求取范围的数据中某一个树是否存在等场景。当数据量过大时，则不适合用位图，需要使用布隆过滤器。
         *
         * 布隆过滤器（Bloom Filter）
         * 布隆过滤器本身就是基于位图的，是对位图的一种改进。
         * 1.底层依然是位图的结构
         * 2.存储数据前使用一组hash函数求hash值，得到一组hash值后依次存入位图下标=true
         * 3.查询数据前使用一组hash函数求hash值，得到一组hash值后依次判断下标位是否都=true
         * 4.如果都=true，则表示可能存在，如果有其中一个=false，则表示不存在
         *
         * 布隆过滤器的误判有一个特点，那就是，它只会对存在的情况有误判。
         * 如果某个数字经过布隆过滤器判断不存在，那说明这个数字真的不存在，不会发生误判；
         * 如果某个数字经过布隆过滤器判断存在，这个时候才会有可能误判，有可能并不存在。
         * 不过，只要我们调整哈希函数的个数、位图大小跟要存储数字的个数之间的比例，那就可以将这种误判的概率降到非常低。
         *
         * 布隆过滤器非常适合这种不需要 100% 准确的、允许存在小概率误判的大规模判重场景。
         * 位图、布隆过滤器应用如此广泛，很多编程语言都已经实现了。
         * 比如 Java 中的 BitSet 类就是一个位图，Redis 也提供了 BitMap 位图类，Google 的 Guava 工具包提供了 BloomFilter 布隆过滤器的实现。
         *
         * 简单理解：
         * bloom filter: False is always false. True is maybe true.
         *
         *
         */
    }
}
