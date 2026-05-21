package chap10_quiz;

public class chap10_quiz_PoisonMatango extends chap10_quiz_Matango {
int poisonAttackSet =5;

public chap10_quiz_PoisonMatango(char suffix){
    super(suffix);
}
public void attack(chap10_quiz_Hero h){
    System.out.println("毒キノコ" + this.suffix + "の攻撃！");
    System.out.println("10のダメージ");
    h.hp -= 10;
    if(poisonAttackSet>0){
        System.out.println("さらに毒の胞子をばらまいた！");
        int poisonDamage = h.hp / 5;
        h.hp-=poisonDamage;
        System.out.println(poisonDamage+"ポイントのダメージ！");
    this.poisonAttackSet-=1;
    }
}
}
