package chap15;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class chap15_practice_Main {
    public static void main(String[] args)throws Exception{
        String s1 = "スッキリJava";
        String s2 = "Java";
        String s3 = "java";
        if(s2.equals(s3)){
            System.out.println("s2とs3は等しい");
        }
        if (s2.equalsIgnoreCase(s3)){
            System.out.println("s2とs3はケースを区別しなければ等しい");
        }
        System.out.println("s1の長さは"+s1.length()+"です");
        if(s1.isEmpty()){
            System.out.println("s1は空文字です");
        }
        if(s1.contains("va")){
            System.out.println("文字列s1は、vaを含んでいます");
        }
        if(s1.endsWith("キリ")){
            System.out.println("文字列s1は、末尾にキリがあります");
        }
        System.out.println("文字列s1で最初にJavaが登場する位置は"+s1.indexOf("Java"));
        System.out.println("文字列s1で最後にJavaが登場する位置は"+s1.lastIndexOf("Java"));

        System.out.println("文字列s1の4文字目以降は"+s1.substring(3));
        System.out.println("文字列s1の4～8文字目は"+s1.substring(3,8));
        StringBuilder sb =new StringBuilder();
        for(int i = 0; i<10000; i++){
            sb.append("Java");
        }
        String s = sb.toString();
        System.out.println(s);
        String s4 = "abc,def,ghi";
        String[] words = s4.split("[,:]");
        for(String w : words){
            System.out.print(w+"->");
        }
        String s5 = "jkl,poe,grw";
        String w2 = s5.replaceAll("[kor]","X");
        System.out.println(w2);

        Date now =new Date();
        System.out.println(now);
        System.out.println(now.getTime());
        Date past = new Date(1694984000000L);
        System.out.println(past);

        Calendar c = Calendar.getInstance();
        c.set(2023,8,18,5,53,20);
        c.set(Calendar.MONTH,9);
        Date d = c.getTime();
        System.out.println(d);
        Date now1 = new Date();
        c.setTime(now1);
        int y = c.get(Calendar.YEAR);
        System.out.println("今年は"+y+"年です");

        SimpleDateFormat f=
        new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date d1 = f.parse("2023/09/18 05:43:20");
        System.out.println(d1);
        Date now2 = new Date();
        String s7 = f.format(now2);
        System.out.println("現在は"+s7+"です");

    }
}
