package chap10_quiz;

public class chap10_quiz_Matango {
    int hp = 50;
    char suffix;
    public chap10_quiz_Matango(char suffix){
        this.suffix =suffix;
    }
    public void attack(chap10_quiz_Hero h){
        System.out.println("キノコ"+this.suffix+"の攻撃！");
        System.out.println("10のダメージ");
        h.hp -= 10;
    }
}
