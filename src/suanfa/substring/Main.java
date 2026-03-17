package suanfa.substring;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[]nums={1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(maxSlidingWindow(nums,3)));

    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[]wm=new int[n-k+1];
        for (int i = 0; i <= n - k; i++) {
            int currentMax = nums[i];
            // 在当前窗口 [i, i+k-1] 内寻找最大值
            for (int j = i + 1; j < i + k; j++) {
                currentMax = Math.max(currentMax, nums[j]);
            }
            wm[i] = currentMax;
        }
        return wm;
    }
}
