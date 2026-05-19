package chap8_quiz;

public class chap8_quiz_Cleric {
String name;
int hp = 50;
int maxHp = 50;
int mp = 10;
int maxMp =10;

public void selfAid(){
    this.mp-=5;
    this.hp = this.maxHp;
    System.out.println(this.name+"は、セルフエイドを唱えた！");
    System.out.println("HPが最大値の"+this.maxHp+"まで回復した！");
}
public int pray (int sec){
    System.out.println(this.name+"は、"+sec+"秒祈った！");
    java.util.Random rand = new java.util.Random();
    int bonus = rand.nextInt(3);
    int recoveryMp =sec + bonus;
    int beforeMp =this.mp;
    this.mp+=recoveryMp;
    if(this.mp>this.maxMp){
        this.mp=this.maxMp;
    }
    int actualRecovery = this.mp -beforeMp;
    System.out.println("MPが"+actualRecovery+"ポイント回復した！");
    return actualRecovery;

}
}
