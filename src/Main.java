import java.util.*;
public class Main {
    public static void main(String[] args) {
        int ans=longestConsecutive(new int[]{100,4,200,1,3,2});
        System.out.println(ans);
    }
    private static int longestConsecutive(int[] nums) {
        // 1. 将所有数字放入 HashSet 中，去掉重复数字并实现 O(1) 查找
            Set<Integer> set=new HashSet<>();
            //先用哈希表去重；
            for(int i:nums){
                set.add(i);
            }
            int mcount=0;
            for(int i:set){
                if(!set.contains(i-1)){
                    int count=1;
                    int nowi=i;
                    while(set.contains(nowi+1)){
                        count++;
                        nowi++;
                    }
                    mcount=Math.max(mcount,count);
                }
            }
            return mcount;
        }
}
