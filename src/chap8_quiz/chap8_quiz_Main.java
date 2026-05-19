package chap8_quiz;

public class chap8_quiz_Main {
    public static void main(String[] args){
        chap8_quiz_Cleric c1 =new chap8_quiz_Cleric();
        c1.name ="じゅり";
        chap8_quiz_Cleric c2 = new chap8_quiz_Cleric();
        c2.name = "ゆずき";

        c1.hp=3;
        System.out.println("【初期状態】"+c1.name+"のHP"+c1.hp+"/ MP:"+c1.mp);
        c1.selfAid();
        System.out.println("【魔法後】"+c1.name+"のHP"+c1.hp+"/MP:"+c1.mp);
        System.out.println("---------------------------------");

        c2.mp=1;
        System.out.println("【初期状態】"+c2.name+"のHP"+c2.hp+"/MP:"+c2.mp);
        int recovered = c2.pray(5);
        System.out.println(c2.name+"が実際に回復した量:"+recovered);
        System.out.println("【祈り後】"+c2.name+"のHP"+c2.hp+"/MP:"+c2.mp);

    }
}
