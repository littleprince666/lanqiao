import java.util.*;
public class juxingmianji {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long [][] m=new Long[2][4];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j]=sc.nextLong();
            }
        }
        Arrays.sort(m,(a,b)->Long.compare(a[0],b[0]));
        Long ans=(m[0][2]-m[0][0])*(m[0][3]-m[0][1])+(m[1][2]-m[1][0])*(m[1][3]-m[1][1]);
        if(m[0][2]<=m[1][0]){
            System.out.println(ans);
        }else{
            Long w=Math.min(m[0][2],m[1][2])-m[1][0];
            Long h=Math.min(m[0][3],m[1][3])-Math.max(m[0][1],m[1][1]);
            ans-=w*h;
            System.out.println(ans);
        }

    }
}
