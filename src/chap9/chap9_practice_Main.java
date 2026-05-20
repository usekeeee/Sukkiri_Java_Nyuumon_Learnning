package chap9;

public class chap9_practice_Main {
    public static void main(String[] args){
        chap9_practice_Sword s = new chap9_practice_Sword();
        s.name ="炎の剣";
        s.damage =10;
        chap9_practice_Hero h1 = new chap9_practice_Hero();
        h1.name = "ミナト";

        h1.sword = s;
        chap9_practice_Hero h2 = new chap9_practice_Hero();
        h2.name ="ナイツ";
        h2.hp =122;
        chap9_practice_Wizard w = new chap9_practice_Wizard("サギリ");
        System.out.println("現在の武器は"+h1.sword.name);
        System.out.println(h1.name+"は"+h1.sword.name+"で攻撃した！");
        w.heal(h1);
        w.heal(h2);
        System.out.println(h1.hp);
        System.out.println(w.name+w.hp);
    }
}
