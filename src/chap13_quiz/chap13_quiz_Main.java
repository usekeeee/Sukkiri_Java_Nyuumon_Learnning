package chap13_quiz;

public class chap13_quiz_Main {
public static void main(String[] args){
    chap13_quiz_Hero hero = new chap13_quiz_Hero();
    hero.setName("だいさん");
    hero.setHp(100);

    chap13_quiz_Wand wand = new chap13_quiz_Wand();
    wand.setName("スーパーやばいロッド");
    wand.setPower(78.0);

    chap13_quiz_Wizard wizard = new chap13_quiz_Wizard();
    wizard.setName("ひかさん");
    wizard.setHp(120);
    wizard.setMp(10);
    wizard.setWand(wand);

    wizard.heal(hero);
}
}
