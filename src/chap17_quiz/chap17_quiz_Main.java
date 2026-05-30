package chap17_quiz;

public class chap17_quiz_Main {
    public static void main(String[] args){
        String s = null;
    try{
        System.out.println(s.length());
    }catch(NullPointerException e){
       System.out.println("--スタックトレース(ここから)");
        e.printStackTrace();
        System.out.println("--(ここまで)--");
    }
    try{
        int i = Integer.parseInt("三");
    }catch(NumberFormatException e){
        System.out.println("例外発生");
    }

    }
}
