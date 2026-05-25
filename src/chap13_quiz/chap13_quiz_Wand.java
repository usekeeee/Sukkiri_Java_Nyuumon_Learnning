package chap13_quiz;

public class chap13_quiz_Wand {
    private String name;
    private double power;
    public void setName(String name){
        if(name == null || name.length()<3){
            throw new IllegalArgumentException("杖の名前は3文字以上で指定ください。");
        }
        this.name =name;
    }
   public void setPower(double power){
        if(power<0.5|| power>100.0){
            throw new IllegalArgumentException("杖の増幅率は0.5以上100以下で指定してください。");
        }
       this.power =power;
   }


    public String getName(){return this.name;}
    public double getPower(){return this.power;}
}
