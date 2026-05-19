package chap6;

public class Kouhan {
    public static void callDeae(){
        System.out.println("えぇい、こしゃくな。 くせ者だ！であえい！");
    }
    public static void showMondokoro(){
        System.out.println("飛車さん、角さん。 もういいでしょう。");
       try {
           Thread.sleep(3000);
       }catch(InterruptedException e){
           e.printStackTrace();
       }
        System.out.println("この紋所が目にはいらぬか！");

        Zenhan.doTogame();
    }
}
