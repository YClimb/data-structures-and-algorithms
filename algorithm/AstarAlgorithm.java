package algorithm;

/**
 * A* 算法：a-star algorithm (静态路网中求解最短路径最有效的直接搜索方法)
 *
 * @author yclimb
 * @date 2020/9/24
 */
public class AstarAlgorithm {
    public static void main(String[] args) {
        /**
         * https://time.geekbang.org/column/article/78175
         * 搜索：如何用A*搜索算法实现游戏中的寻路功能？
         *
         * 像出行路线规划、游戏寻路，这些真实软件开发中的问题，一般情况下，我们都不需要非得求最优解（也就是最短路径）。
         * 在权衡路线规划质量和执行效率的情况下，我们只需要寻求一个次优解就足够了。那如何快速找出一条接近于最短路线的次优路线呢？
         * 这个快速的路径规划算法，就是我们今天要学习的 A* 算法。实际上，A* 算法是对 Dijkstra 算法的优化和改造。
         *
         * A* 算法
         * A*（A-Star)算法是一种静态路网中求解最短路径最有效的直接搜索方法，也是解决许多搜索问题的有效算法。
         * 算法中的距离估算值与实际值越接近，最终搜索速度越快。
         *
         * 欧几里得距离（Euclidean distance）
         * 顶点跟终点之间的直线距离，欧几里得距离的计算公式，会涉及比较耗时的开根号计算。
         *
         * 曼哈顿距离（Manhattan distance）
         * 曼哈顿距离是两点之间横纵坐标的距离之和。计算的过程只涉及加减法、符号位反转，所以比欧几里得距离更加高效。
         * Math.abs(v1.x - v2.x) + Math.abs(v1.y - v2.y); v1\v2 顶点Vertex
         *
         * 启发函数（heuristic function）
         * g(i)=欧几里得距离
         *
         * 估价函数（evaluation function）。
         * f(i)=g(i)+h(i)
         * h(i)=曼哈顿距离
         * g(i)=欧几里得距离
         *
         * A* 算法的代码实现的主要逻辑是下面这段代码。它跟 Dijkstra 算法的代码实现，主要有 3 点区别：
         * 1.优先级队列构建的方式不同。A* 算法是根据 f 值（也就是刚刚讲到的 f(i)=g(i)+h(i)）来构建优先级队列，而 Dijkstra 算法是根据 dist 值（也就是刚刚讲到的 g(i)）来构建优先级队列；
         * 2.A* 算法在更新顶点 dist 值的时候，会同步更新 f 值；
         * 3.循环结束的条件也不一样。Dijkstra 算法是在终点出队列的时候才结束，A* 算法是一旦遍历到终点就结束。
         *
         *
         * A* 算法属于一种启发式搜索算法（Heuristically Search Algorithm）。
         * 见类：algorithm/HeuristicallySearchAlgorithm
         *
         */
    }
}
