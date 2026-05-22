package chap11;

public abstract class chap11_practice_Character {
String name;
int hp;
//逃げる
    public void run(){
        System.out.println(this.name+"は逃げ出した！");
    }
    //戦う
    public abstract void attack(chap11_practice_Matango m);
}
