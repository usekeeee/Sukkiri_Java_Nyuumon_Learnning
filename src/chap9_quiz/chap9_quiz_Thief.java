package chap9_quiz;
//練習問題9-1
public class chap9_quiz_Thief {
    String name;
    int hp;
    int mp;

    public chap9_quiz_Thief(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    public chap9_quiz_Thief(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.mp = 5;
    }

    public chap9_quiz_Thief(String name) {
        this.name = name;
        this.hp = 40;
        this.mp = 5;
    }

    public chap9_quiz_Thief() {
        this.name = "ダミー";
        this.hp = 40;
        this.mp = 5;
    }
}