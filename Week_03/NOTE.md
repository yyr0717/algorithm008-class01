#  学习笔记

##  第三周 第7课

###  泛型递归 树的递归

---------------------

* 递归recursion：循环体，归去来兮

* 代码模版：

  ```java
  public void recur(int level, int param) { 
  
   // terminator 
  
   if (level > MAX_LEVEL) { 
  
    // process result 
  
    return; 
  
   }
  
   // process current logic 
  
   process(level, param); 
  
   // drill down 
  
   recur( level: level + 1, newParam); 
  
   // restore current status 
  
  }
  ```

* 不要人肉递归；最近最简方法，重复子问题；数学归纳

* 典型题目：（详细题解见链接）

  * 爬楼梯
  * 括号生成
  * 二叉树的最近公共祖先
  * 从前序与中序遍历序列构造二叉树



------

##  第三周 第8课

###  分治 回溯

* 分治代码模版：

  ```python
  def divide_conquer(problem, param1, param2, ...): 
    # recursion terminator 
    if problem is None: 
  	print_result 
  	return 
  
    # prepare data 
    data = prepare_data(problem) 
    subproblems = split_problem(problem, data) 
  
    # conquer subproblems 
    subresult1 = self.divide_conquer(subproblems[0], p1, ...) 
    subresult2 = self.divide_conquer(subproblems[1], p1, ...) 
    subresult3 = self.divide_conquer(subproblems[2], p1, ...) 
    …
  
    # process and generate the final result 
    result = process_result(subresult1, subresult2, subresult3, …)
  	
    # revert the current level states
    
  ```

* 回溯：递归的一种，试错
* 典型例题：（详细题解见链接）
  * pow（x，n）
  * 子集
  * 多数元素
  * N皇后
  * 电话号码

