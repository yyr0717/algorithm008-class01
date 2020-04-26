//leetcode 面试题49. 丑数
//题目：我们把只包含因子 2、3 和 5 的数称作丑数（Ugly Number）。求按从小到大的顺序的第 n 个丑数。
//思路： 要去找第n个丑数，首先想到的就是一个个去生成。uglyNum=2^x * 3^y * 5^z
//由 1 生成了 2、3、5接着 2、3、5利用前面公式继续生成，当然，生成过程是先放小的，并且我们需要去重，去重就需要用到 set
//时间复杂度： O(NlogN)


class Solution {
    public int nthUglyNumber(int n) {
            PriorityQueue <Long> pq = new PriorityQueue<>();
            Set<Long> s = new HashSet<>();
            long[] primes = new long[]{2,3,5};
            for(long prime : primes){
                pq.offer(prime); //插入元素
                s.add(prime);
            }
            long num = 1;
            for(int i = 1; i < n ; i++){
                num = pq.poll(); //获取并删除队首元素
                //遍历三个因子
                for(int j = 0; j < 3; j++){
                    if(!s.contains(num * primes[j])){
                        pq.offer(num * primes[j]);
                        s.add(num * primes[j]);
                    }
                }
            }
            return (int) num;
    }
}
