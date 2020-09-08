package array;

/**
 * 散列表
 *
 * @author yclimb
 * @date 2020/9/7
 */
public class HashTable {
    public static void main(String[] args) {
        /**
         * https://time.geekbang.org/column/article/64233
         * https://github.com/wangzheng0822/algo/tree/master/java/18_hashtable
         * 散列表:散列表用的是数组支持按照下标随机访问数据的特性，所以散列表其实就是数组的一种扩展，由数组演化而来。
         * 可以说，如果没有数组，就没有散列表。
         *
         * 散列表用的就是数组支持按照下标随机访问的时候，时间复杂度是 O(1) 的特性。
         * 我们通过散列函数把元素的键值映射为下标，然后将数据存储在数组中对应下标的位置。
         * 当我们按照键值查询元素时，我们用同样的散列函数，将键值转化数组下标，从对应的数组下标的位置取数据。
         *
         * 散列冲突解决办法：
         * 1.开放寻址法，出现冲突后，依次往后查找空白地址（线性探测、二次探测、双重散列）
         * 2.链表法，出现冲突后，插入链表
         */
    }
}
