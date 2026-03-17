package javase.func;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[]nums={4,2,0,3,2,5};
        int ans=trap(nums);
        System.out.println(
                ans
        );
    }
    public static int trap(int[] height) {
        int n=height.length;
        int water=0;
        int[]left=new int[n];
        int[]right=new int[n];
        left[0]=height[0];
        right[n-1]=height[n-1];
        for(int i=1;i<n;i++){
            left[i]=Math.max(height[i],left[i-1]);
        }
        for(int i=n-2;i>0;i--){
            right[i]=Math.max(height[i],right[i+1]);
        }
        for(int i=1;i<n-1;i++){
            water+=Math.min(left[i],right[i])-height[i];
        }
        return water;

    }
}

