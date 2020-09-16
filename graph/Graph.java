package graph;

/**
 * 图
 *
 * @author yclimb
 * @date 2020/9/11
 */
public class Graph {
    public static void main(String[] args) {
        /**
         * https://time.geekbang.org/column/article/70537
         * https://github.com/wangzheng0822/algo/tree/master/java/30_graph
         * 图。实际上，涉及图的算法有很多，也非常复杂，比如图的搜索、最短路径、最小生成树、二分图等等
         * 树中的元素我们称为节点，图中的元素我们就叫做顶点（vertex）；
         * 图中的一个顶点可以与任意其他顶点建立连接关系。我们把这种建立的关系叫做边（edge）；
         * 跟顶点相连接的边的条数，就叫做顶点的度（degree）；
         *
         * 边的“方向”的概念：
         * 如果用户 A 关注了用户 B，我们就在图中画一条从 A 到 B 的带箭头的边，来表示边的方向。
         * 如果用户 A 和用户 B 互相关注了，那我们就画一条从 A 指向 B 的边，再画一条从 B 指向 A 的边。
         * 我们把这种边有方向的图叫做“有向图”。以此类推，我们把边没有方向的图就叫做“无向图”。
         *
         * 在有向图中，我们把度分为入度（In-degree）和出度（Out-degree）。
         * 顶点的入度，表示有多少条边指向这个顶点；顶点的出度，表示有多少条边是以这个顶点为起点指向其他顶点。
         * 对应到微博的例子，入度就表示有多少粉丝，出度就表示关注了多少人。
         *
         * 带权图（weighted graph）
         * 在带权图中，每条边都有一个权重（weight），我们可以通过这个权重来表示 QQ 好友间的亲密度。
         *
         * 邻接矩阵（Adjacency Matrix）
         * 邻接矩阵的底层依赖一个二维数组。用邻接矩阵来表示一个图，虽然简单、直观，但是比较浪费存储空间。
         *
         * 邻接表（Adjacency List）
         * 类似散列表存储，每个顶点对应一条链表，链表中存储的是与这个顶点相连接的其他顶点（也可以使用散列表+红黑树）。
         * 邻接矩阵存储起来比较浪费空间，但是使用起来比较节省时间。相反，邻接表存储起来比较节省空间，但是使用起来就比较耗时间。
         *
         */
    }


    /*public class Graph { // 无向图
        private int v; // 顶点的个数
        private LinkedList<Integer> adj[]; // 邻接表

        public Graph(int v) {
            this.v = v;
            adj = new LinkedList[v];
            for (int i=0; i<v; ++i) {
                adj[i] = new LinkedList<>();
            }
        }

        public void addEdge(int s, int t) { // 无向图一条边存两次
            adj[s].add(t);
            adj[t].add(s);
        }
    }*/
}
