package chap5;

public class practice_chap5 {
public static void incArray(int[] array){
    for(int i = 0 ; i < array.length; i++){
        array[i]++;
    }
}
public static void main (String[] args) {
    int[] array = {1, 2, 3};
    incArray(array);
    for (int i : array) {
        System.out.println(i);
    }
   //練習問題5-1
    introduceOneself();
    //練習問題5-2
    email("メールの宛先アドレス","メールのタイトル","メールの本文");
   //練習問題5-3
    email("メールの宛先アドレス","メールの本文");
    //練習問題5-4
    double area = calcTriangleArea(34,50);
    System.out.println("三角形の面積は"+area+"です");
}
    public static void introduceOneself(){
        String name ="湊　雄輔";
        int age = 22;
        double height =169.9;
        char year ='辰';
        System.out.println("私の名前は"+name+"です。"+"歳は"+age+"歳です。 身長は"+height+"cmです。 十二支は"+year+"です");

    }

    public static void email(String title, String address, String text ){
    System.out.println(title+"に、以下のメールを送信しました。");
    System.out.println("件名:"+address);
    System.out.println("本文:"+text);
}
public static void email(String address, String text){
    System.out.println(address+"に、以下のメールを送信しました。");
    System.out.println("件名:無題");
    System.out.println("本文:"+text);
}
public static double calcTriangleArea(double bottom, double height){
    double result = (bottom*height)/2;
            return result;
}
}

