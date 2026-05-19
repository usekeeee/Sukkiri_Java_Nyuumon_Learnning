package chap8;
public class chap8_practice_main {
    public static void main(String[] args) {

        chap8_practice_hero h = new chap8_practice_hero();
        h.name = "ミナト";
        h.hp =100;
        System.out.println("勇者"+h.name+"を生み出しました！");

        chap8_practice_matango m1 =new chap8_practice_matango();
        m1.hp =50;
        m1.suffix='A';

        chap8_practice_matango m2 =new chap8_practice_matango();
        m2.hp =48;
        m2.suffix='B';

        h.sit(5);
        h.slip();
        h.sit(25);
        h.run();
       m1.run();
       m2.run();
    }
}
