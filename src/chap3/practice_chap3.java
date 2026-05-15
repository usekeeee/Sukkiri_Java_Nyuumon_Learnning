package chap3;

public class practice_chap3 {
public static void main(String[] args){
    //気になるコード,progateではやっていないコードを写経します
    for(int i = 0; i<3; i++){
       System.out.println("現在"+(i+1)+"週目→");
    }

    for(int j = 1; j<10; j++){
      for(int h = 1; h<10; h++){
         System.out.print(j*h);
         System.out.print(" ");
        }
      System.out.println("");
    }

//練習問題3-1
   int weight = 60;
    if(weight==60){
        System.out.println("60kg");
    }

    int age1 =34;
    int age2 =29;
    if(age1+age2>60){
        System.out.println("60超えちゃってます");
    }

    int age =97;
    if(age % 2 == 1) {
        System.out.println("奇数だよ");
    }

    String name ="湊";
    if(name.equals ("湊")){
        System.out.println("湊さん見つけたよー");
    }

    //練習問題3-3(3-2は選択式問題のためスキップ)
    int isHungry = 0;
    String food ="唐揚げ";
    System.out.println("こんにちは");
    if(isHungry==0){
        System.out.println("お腹いっぱいです");
    }else{
        System.out.println("腹ペコです、"+food+"をいただきます！！");
    }
    System.out.println("ごちそうさまでした");

    //練習問題3-5(3-3,3-4も選択式問題のためスキップ)
    System.out.print("[メニュー] 1:検索 2:登録 3:削除 4:変更>");
    int selected = new java.util.Scanner(System.in).nextInt();
    switch(selected){
        case 1 ->{
            System.out.println("検索します");
        }
        case 2 ->{
            System.out.println("登録します");
        }
        case 3 ->{
            System.out.println("削除します");
        }
        case 4 -> {
            System.out.println("変更します");
        }
        case 5 ->{
        }
    }
//練習問題3-6
    System.out.println("数あてゲーム");
    int ans = new java.util.Random().nextInt(10);
    for(int w=0; w<5; w++) {
        System.out.println("0～9の数字を入力してください");
        int num = new java.util.Scanner(System.in).nextInt();
        if (num == ans) {
            System.out.println("アタリ！");
            break;
        } else {
            System.out.println("ハズレww");
        }
    }
        System.out.println("ゲームを終了します");


}
}

