package chap15_quiz;

public class chap15_quiz_Main {
    public static void main(String[]args){
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= 100; i++){
            sb.append(i);
            if(i<100){
                sb.append(",");
            }
        }
        String s = sb.toString();
        System.out.println("生成された文字列 s:");
        System.out.println(s);
        System.out.println("--------------------------------------------------");
        String[] a =s.split(",");
        System.out.println("配列 a の要素数: " + a.length);
        System.out.println("最初の要素 (a[0]): " + a[0]);
        System.out.println("最後の要素 (a[99]): " + a[99]);
    }
}
