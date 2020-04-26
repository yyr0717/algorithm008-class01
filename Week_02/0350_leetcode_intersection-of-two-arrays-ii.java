//leetcode 350. 两个数组的交集 II
//题目： 给定两个数组，编写一个函数来计算它们的交集。
//思路： 哈希表，将字符较少的数组映射到一个哈希表，value是这个数在该数组出现的个数
//再遍历另一个数组，与哈希表对应看是否存在相应的值且value大于0，若存在，则该值value-1，并将该数保存在数组中
//需要一个count计数，最后输出数组中0-count的元素



class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
            if(nums1.length > nums2.length){
                return intersect(nums2,nums1);
            }
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int n : nums1){
                map.put(n,map.getOrDefault(n,0)+1);
            }
            int count = 0;
            for(int n : nums2){
                int c = map.getOrDefault(n,0);
                if(c > 0){
                    nums1[count++] = n;
                    map.put(n,c-1);
                }
            }
            return Arrays.copyOfRange(nums1,0,count);
    }
}
