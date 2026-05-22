package chap11_quiz;

public  abstract  class  chap11_quiz_TangibleAsset extends chap11_quiz_Asset implements chap11_quiz_Thing {
    String color;
    double weight;

    public chap11_quiz_TangibleAsset(String name, int price, String color){
        super(name,price);
        this.color =color;
    }
    public String getColor(){return this.color;}

    public double getWeight(){
        return this.weight;
    }
    public void setWeight(){
        this.weight =weight;
    }
}
