package chap10_quiz;

public class chap10_quiz_Main {
    public static void main(String[] args) {
        chap10_quiz_Hero h = new chap10_quiz_Hero();
        chap10_quiz_Matango m = new chap10_quiz_Matango('A');
        chap10_quiz_PoisonMatango pm = new chap10_quiz_PoisonMatango('A');
        System.out.println(h.name + "は、キノコ(" + m.suffix + ")と毒キノコ("+pm.suffix + ")に出くわした！");
        m.attack(h);
        pm.attack(h);
        System.out.println(h.name+"の体力/"+h.hp);
        System.out.println(h.name+"は死を恐れて逃げ出した！");
    }
}
