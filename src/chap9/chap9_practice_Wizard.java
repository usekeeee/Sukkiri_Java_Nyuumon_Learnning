package chap9;

public class chap9_practice_Wizard {
    String name;
    int hp;
    public void heal(chap9_practice_Hero h){
        h.hp+=10;
        System.out.println(h.name+"のHPを10回復した！");
    }
    public chap9_practice_Wizard(String name){
        this.name =name;
        this.hp =120;
    }
    public chap9_practice_Wizard(){
        this.hp = 100;
        this.name ="ダミー";
    }
}
