#学习笔记

##第二周 第五课 

###哈希表 映射 集合

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