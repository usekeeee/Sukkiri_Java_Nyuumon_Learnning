package chap13_quiz;

public class chap13_quiz_Wizard {
    private int hp;
    private int mp;
    private String name;
    private chap13_quiz_Wand wand;
    public void setName(String name){
        if(name == null || name.length()<3){
            throw new IllegalArgumentException("魔法使いの名前は3文字以上で指定してください。");
        }
        this.name = name;
    }
    public void setWand(chap13_quiz_Wand wand){
        if(wand == null){
            throw new IllegalArgumentException("設定しようとしている杖がぬる(null)です。");
        }
        this.wand =wand;
    }
    public void setHp(int hp){
        if(hp<0) {
            this.hp = 0;
        }else{
            this.hp = hp;
        }
    }
    public void setMp(int mp){
        if(mp<0){
            throw new IllegalArgumentException("MPは0以上を指定してください。");
        }
        this.mp= mp;
    }
    void heal(chap13_quiz_Hero h){
        int basePoint = 10;
        int recovPoint = (int)(basePoint*this.wand.getPower());
        h.setHp(h.getHp()+recovPoint);
        System.out.println(h.getName()+"のHPを"+recovPoint+"回復した！");
    }
    public int getHp(){return this.hp;}
    public int getMp(){return this.mp;}
    public String getName(){return this.name;}
    public chap13_quiz_Wand getWand(){return this.wand;}

}
