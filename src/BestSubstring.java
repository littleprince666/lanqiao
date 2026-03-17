import java.util.*;

public class BestSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l=Integer.parseInt(sc.nextLine());
        //完成字母到得分的转换
        HashMap<Character, Integer> Sites = new HashMap<Character, Integer>();
        for(int i=0;i<26;i++){
            char s=(char)(i+97);
            Sites.put(s,i+1);
        }
        //找到所有不含有重复字母的子串
        String s = sc.nextLine();
        ArrayList<String> arrayList=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                    arrayList.add(s.substring(i,j+1));
            }
        }
        Iterator<String> t = arrayList.iterator();
        while (t.hasNext()) {
            String str = t.next();
            char[] s2 = str.toCharArray();
            boolean hasDuplicates = false;
            // 检查字符串中是否有重复字符
            for (int i = 0; i < s2.length; i++) {
                for (int j = i + 1; j < s2.length; j++) {
                    if (s2[i] == s2[j]) {
                        hasDuplicates = true;
                        break;
                    }
                }
                if (hasDuplicates) {
                    break;
                }
            }
            // 如果有重复字符，移除该字符串
            if (hasDuplicates) {
                t.remove();
            }
        }
        HashSet<String> ha = new HashSet<String>();
        ha.addAll(arrayList);
        HashMap<Integer,String> Sites2 = new HashMap<Integer,String>();
        for (String s3 : ha) {
            int grade=0;
            char[] s2 = s3.toCharArray();
            for(int i=0;i<s2.length;i++){
                grade+=Sites.get(s2[i]);
            }
            if(s3.contains("lanqiobe")){
                grade+=80;
            } else if (s3.contains("lanqiob")) {
                grade+=70;
            } else if (s3.contains("lanqio")) {
                grade+=60;
            } else if (s3.contains("lanqi")) {
                grade+=50;
            }else if (s3.contains("lanq")) {
                grade+=40;
            } else if (s3.contains("lan")) {
                grade+=30;
            }else if (s3.contains("la")) {
                grade+=20;
            } else if (s3.contains("l")) {
                grade+=10;
            }
            Sites2.put(grade,s3);
        }
    int maxgrade=0;
    for (int s3 : Sites2.keySet()) {
        if(s3>maxgrade){
            maxgrade=s3;
        }
    }
    System.out.println(Sites2.get(maxgrade));









    }
}
