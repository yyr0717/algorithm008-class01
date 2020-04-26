# 学习笔记

##  第二周 第五课 

###  哈希表 映射 集合

----------------------------------------------------------------------------

* 哈希表 Hash table，也称散列表，根据键值key value 而进行直接访问的数据结构。将值映射到表中一个位置，加快查找速度。映射函数也叫散列函数。

* 插入时间复杂度O(1)

* 删除时间复杂度O(1)

* 查找时间复杂度O(1)，以上worst时间复杂度为O(n)，全部冲突，相当于list

* 当通过哈希函数将值映射到相同的地址时，将会出现哈希冲突现象。解决哈希冲突是采取 **数组加链表** 的链地址方式。

* 基本用法：（Java）

  * **创建HashMap对象** ：

    HashMap<String,Integer> hashMap = new HashMap<>();

  * **添加键值对**：  hashMap.put("aa",1); 此方法会覆盖

    ​                         hashMap.putIfAbsent("aa",4); 此方法不会覆盖

  * **删除元素**： hashMap.remove("bb"); hashMap.remove("aa",5);

  * **获取元素**： hashMap.get("cc")； getOrDefault("aa",-1)*//key=aa不存在，所以返回默认value -1*

  * **判断key或value是否存在**： hashMap.containsKey("aa");  hashMap.containsValue(1);

  * **替换元素**： hashMap.replace("ff",5);                        

* 补充：记得之前还学过，open hash 和 close hash，open hash是地址存在外部，close hash是地址在内部，所以当table size < key个数时，close hash not work。

* 典型题目：（具体解析看题目链接）

  * [有效的字母异位词](https://github.com/yyr0717/algorithm008-class01/blob/master/Week_02/242_leetcode_valid-anagram.java)

  * [字母异位词的分组](https://github.com/yyr0717/algorithm008-class01/blob/master/Week_02/049_leetcode_group-anagrams.java)

  * [两数之和](https://github.com/yyr0717/algorithm008-class01/blob/master/Week_02/001_leetcode_two-sum.java)

  * [两个数组的交集 II](https://github.com/yyr0717/algorithm008-class01/blob/master/Week_02/350_leetcode_intersection-of-two-arrays-ii.java)

    ![intersect](/Users/yuyiran/Desktop/algorithm008-class01/Week_02/intersect.png)

----------

##  第二周 第六课

###   树 二叉树 二叉搜索树

* Linked List是特殊化的Tree。Tree是特殊化的Graph。
* 二叉树：只有两个孩子
* 二叉搜索树binary search tree：左子树的所有节点 < 根节点；右子树的所有节点 > 根节点；空树也是BST。其中序遍历是升序排序。查询、插入、删除Oavg(logn); Oworst(n)相当于变成了单链表。
* 前序遍历 preorder：根左右
* 中序遍历inorder： 左根右
* 后序遍历postorder：左右根
* 典型题目：（熟悉递归代码）
  * 二叉树的前序遍历
  * 二叉树的中序遍历
  * N叉树的后序遍历
  * N叉树的前序遍历
  * N叉树的层序遍历



---------

##  第二周 第六课

### 堆 二叉堆 

* **堆（Heap）**：适用于查找最大值或最小值问题
* findmax O(1); delete max O(logn); insert O(logn) or O(1)
* **二叉堆**： 完全二叉树；任意节点 > 其子节点；通过数组实现
* 堆顶：a[0]， 左孩子 a[2i + 1], 右孩子a[2i + 2]
* insert O(logn); delete O(logn)
* 典型例题：（具体解析看题目链接）
  * 最小k个数
  * 滑动窗口
  * 前k个高频元素
  * 丑数

