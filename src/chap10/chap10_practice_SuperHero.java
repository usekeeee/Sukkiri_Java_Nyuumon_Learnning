package chap10;

public class chap10_practice_SuperHero extends chap10_practice_Hero{
    public chap10_practice_SuperHero(){
        System.out.println("SuperHeroのコンストラクタが動作");
    }
    boolean flying;
    public void fly(){
        this.flying =true;
        System.out.println("飛び上がった！");
    }
    public void land(){
        this.flying = false;
        System.out.println("着地した！");
    }
    public void run(){
        System.out.println(this.name+"は、撤退した！");
    }
    public void attack(chap10_practice_Matango m){
        super.attack(m);
        if(this.flying){
            super.attack(m);
        }
    }
}
