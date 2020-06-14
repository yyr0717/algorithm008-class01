###  学习笔记

##  第8周

### 第16课 位运算

---

* **位运算符**：
  * 按位或 | ：只要有一位是1，则为1
  * 按位与 &：只要有一位是0，则为0
  * 按位取反 ～：直接取反
  * 按位异或 ^ ：相同为0，不同为1
* **异或操作的特点 XOR**：
  * X ^ 0 = X
  * X ^ 1s = ~X
  * X ^ (~X) = 1s
  * X ^ X = 0
  * c = a ^ b -> a ^ c = b, b ^ c = a //交换两个数
  * a ^ b ^ c = a ^ (b ^ c) = (a ^ b) ^ c //associative
* **实战常用位运算要点**：
  * 奇偶判断：（x & 1) == 1 -> odd; (x & 1) == 0 -> even
  * 除2运算： x = x / 2 -> x = x >>1
  * x = x & (x-1) 清零最低位的1
  * x & -x -> 得到最低位的1
  * x & ~x -> 0
* 典型题目：（详细解答见链接）
  * [位1的个数]()
  * [颠倒二进制位]()
  * [N皇后]()
  * [2的幂]()
  * [比特位计数]()

---

##  第17课

### 布隆过滤器 Bloom Filter

---

* Hash Table + 拉链存储重复元素
* 一个很长的二进制向量和一系列随机映射函数。布隆过滤器可以用于检索一个元素是否在一个集合中。
* 空间效率和查询时间都远远超过一般的算法，但有一定的误识别率和删除困难。
* [Java实现](https://github.com/lovasoa/bloomfilter/blob/master/src/main/java/BloomFilter.java)
* [Python实现](https://shimo.im/docs/xKwrcwrDxRv3QpKG)

---

###  LRU Cache

* Hash Table + Double LinkedList
* O(1) 查询，O(1) 修改、更新
* 替换策略：least recently used
* 典型题目：
  * [LRU缓存机制]()

---

