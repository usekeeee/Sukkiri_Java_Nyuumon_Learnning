package chap13;

public class chap13_practice_Main {
    public static void main(String[]args){
        chap13_practice_Hero h =new chap13_practice_Hero();
        chap13_practice_Sword s = new chap13_practice_Sword();
        chap13_practice_King k = new chap13_practice_King();
        h.setName("半蔵");
        k.talk(h);
        System.out.println("そなたの冒険での活躍に期待し、"+s.name+"を託そう。");
        System.out.println(h.getName()+"は王を裏切り、攻撃した。。");
        System.out.println("王の体力/"+k.hp);
        s.attack();
        System.out.println("王は死んだ。");
    }
}
