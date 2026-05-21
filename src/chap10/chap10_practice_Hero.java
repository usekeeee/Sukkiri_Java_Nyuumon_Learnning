package chap10;

public class chap10_practice_Hero {
    public chap10_practice_Hero(){
        System.out.println("Heroのコントラスタが動作");
    }
    String name ="ミナト";
    int hp =100;

    public void attack(chap10_practice_Matango m){
        System.out.println(this.name+"の攻撃！");
        m.hp-=10;
        System.out.println("5ポイントのダメージを与えた！");
    }

    public void run(){
        System.out.println(this.name+"は逃げ出した！");
    }
}
