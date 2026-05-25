package chap13;

public class chap13_practice_Hero {
    private int hp;
    private String name;
    chap13_practice_Sword sword;
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        if(name==null){
            throw new IllegalArgumentException
                    ("名前がnullである。処理を中断。");
        }
        if(name.length()<= 1){
            throw new IllegalArgumentException
                    ("名前が短すぎる。処理を中断。");
        }
        if(name.length()>=8){
            throw new IllegalArgumentException
                    ("名前が長すぎる。処理を中断。");
        }
        this.name = name;
    }
    public void sleep(){
        this.hp = 100;
        System.out.println(this.name+"は"+"眠って回復した！");
    }
private void die (){
        System.out.println(this.name+"は死んでしまった！");
        System.out.println("GAME OVERです。");
}
}
