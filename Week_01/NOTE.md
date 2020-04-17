学习笔记
预习周 第一课 第二课
1. 高效学习
1.5～2.0倍速观看视频
三分看 七分练
不会的题目不要死磕
刻意练习：五毒神掌 过遍数 不能只做一遍 难点反复看
feedback: 勤于看高手代码

2. 数据结构与算法总揽
见数据结构.emmx 与 算法.emmx（脑图）

3. 时间/空间复杂度
时间复杂度：
O(1):常数
O(n)：线性 并列的两个循环
O(n^2)：平方 嵌套双层循环
O(n^3)：立方
O(2^n)：如fib()
O(logn):对数
O(n!)：阶乘
主定理(递归)：二分查找 O(logn);二叉树O(n);mergesort O(nlogn)等

空间复杂度：
数组长度 一维O(n) 二维O(n^2)
递归深度
将两者结合

第一周 第三课 4/13/2020
1. 数组 Array
每个元素都有自己的内存地址，查找比较快，但是插入和删除时需挪动前后的每个元素
lookup O(1)
insert O(n)
delete O(n)
prepend O(n)
append O(1)

2. 链表 Linked list
访问速度慢，需要从头一个一个找，但插入删除效率高
单链表 ： next指针
双链表 ： pre next指针
循环链表 ： Tail.next -> head
lookup O(n)
insert O(1)
delete O(1)
prepend O(1)
append O(1)

3. 跳表 skip list
基于AVL，二分查找，链表中元素必须有序
建立多级索引，减少查找次数，维护成本高，插入删除要更新索引
lookup O(logn)
insert O(logn)
delete O(logn)
prepend O(1)
append O(1)

4. 典型例题（详细解题思路见代码注释）
移动零 ：快排思想 双指针 交换
盛最多水的容器 ：双指针夹逼 从外层向里收敛
爬楼梯 ：最近重复子问题 Fib
三数之和 ： 左右下标往中间推进
两数之和 ：两层循环遍历整个数组 或 哈希表
加一 ：数学归纳
环形链表：快慢指针
