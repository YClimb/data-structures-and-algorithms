package tree;

/**
 * 二叉树
 *
 * @author yclimb
 * @date 2020/9/8
 */
public class BinaryTree {
    public static void main(String[] args) {
        /**
         * https://time.geekbang.org/column/article/67856
         * 树的：高度（Height）、深度（Depth）、层（Level）
         * “高度”这个概念，在我们的生活中，其实就是从下往上度量，比如我们要度量第 10 层楼的高度、第 13 层楼的高度，起点都是地面。所以，树这种数据结构的高度也是一样，从最底层开始计数，并且计数的起点是 0。
         * “深度”这个概念在生活中是从上往下度量的，比如水中鱼的深度，是从水平面开始度量的。所以，树这种数据结构的深度也是类似的，从根结点开始度量，并且计数起点也是 0。
         * “层数”跟深度的计算类似，不过，计数起点是 1，也就是说根节点位于第 1 层。
         *
         * 二叉树，顾名思义，每个节点最多有两个“叉”，也就是两个子节点，分别是左子节点和右子节点。
         * 满二叉树，叶子节点全都在最底层，除了叶子节点之外，每个节点都有左右两个子节点，这种二叉树就叫做满二叉树。
         * 完全二叉树，叶子节点都在最底下两层，最后一层的叶子节点都靠左排列，并且除了最后一层，其他层的节点个数都要达到最大，这种二叉树叫做完全二叉树。
         *
         * 二叉树的遍历
         * 1.前序遍历，先遍历自节点，再遍历左节点，最后遍历右节点
         * 2.中序遍历，先遍历左节点，再遍历自节点，最后遍历右节点
         * 3.后序遍历，先遍历左节点，再遍历右节点，最后遍历自节点
         * 4.层级遍历，使用队列实现。出队的同时，把他的子节点依次入队。
         *
         * 二叉树遍历的时间复杂度是 O(n)。
         *
         */
    }

    /*
    前序遍历的递推公式：
    preOrder(r) = print r->preOrder(r->left)->preOrder(r->right)
    void preOrder(Node* root) {
        if (root == null) return;
        print root // 此处为伪代码，表示打印root节点
        preOrder(root->left);
        preOrder(root->right);
    }

    中序遍历的递推公式：
    inOrder(r) = inOrder(r->left)->print r->inOrder(r->right)
    void inOrder(Node* root) {
        if (root == null) return;
        inOrder(root->left);
        print root // 此处为伪代码，表示打印root节点
        inOrder(root->right);
    }

    后序遍历的递推公式：
    postOrder(r) = postOrder(r->left)->postOrder(r->right)->print r
    void postOrder(Node* root) {
        if (root == null) return;
        postOrder(root->left);
        postOrder(root->right);
        print root // 此处为伪代码，表示打印root节点
    }
    */
}
