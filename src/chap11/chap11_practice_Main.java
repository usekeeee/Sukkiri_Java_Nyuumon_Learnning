package chap11;

public class chap11_practice_Main {
    public static void main(String[] args){
        chap11_practice_Dancer d = new chap11_practice_Dancer();
        d.name = "サギリ";
        d.hp = 122;

        chap11_practice_Matango m = new chap11_practice_Matango();
        m.name = "マタンゴ";
       d.dance();
       d.attack(m);
       System.out.println(m.name+"の残りHP"+m.hp);
    }
}
