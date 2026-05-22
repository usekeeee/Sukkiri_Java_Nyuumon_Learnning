package chap11_quiz;

public abstract class chap11_quiz_Asset {
    String name;
    int price;
public chap11_quiz_Asset(String name,int price){
    this.name = name;
    this.price = price;
}
    public String getName(){return this.name;}
    public int getPrice(){return this.price;}
}
