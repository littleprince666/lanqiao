package suanfa.chaungkou;

public class Main {
    public static void main(String[] args) {
        int[]nums={2,3,1,2,4,3};
        int ans=minSubArrayLen(7,nums);
        System.out.println(ans);
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int l=0,r,ans=nums.length+1,s=0;
        //ans初始值要大于数组的长度
        for(r=0;r<nums.length;r++){
            s+=nums[r];
            while(s-nums[l]>=target){
                s-=nums[l];
                l++;
            }
            if(s>=target){
                ans=Math.min(ans,r-l+1);
            }
        }
        //判断ans是否小于或者等于数组长度；是的话说明存在符合条件的子数组；
        return ans<=nums.length?ans:0;
    }
}
