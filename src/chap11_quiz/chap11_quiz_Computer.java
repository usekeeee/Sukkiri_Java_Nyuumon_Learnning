package chap11_quiz;

public class chap11_quiz_Computer extends chap11_quiz_TangibleAsset {
    String makerName;
    //コンストラクタ
    public chap11_quiz_Computer
    (String name, int price, String color, String makerName){
        super(name,price,color);
        this.makerName = makerName;
    }
    public String getMakerName(){return  this.makerName;}
}
