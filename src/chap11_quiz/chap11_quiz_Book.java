package chap11_quiz;

public class chap11_quiz_Book extends chap11_quiz_TangibleAsset {
    String isbn;
    //コンストラクタ
    public chap11_quiz_Book
    (String name,int price,String color,String isbn){
       super(name,price,color);
        this.isbn = isbn;
    }
    //メソッド
    public String getIsbn(){return this.isbn;}
}
