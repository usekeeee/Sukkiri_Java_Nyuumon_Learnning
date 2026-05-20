package chap9;

public class chap9_practice_Hero {
    String name;
    int hp;
    chap9_practice_Sword sword;
    public void attack(){
        System.out.println(this.name+"は攻撃した！");
        System.out.println("敵に5ポイントのダメージを与えた！");
    }
    public chap9_practice_Hero(){
        this.hp =100;
    }
}
