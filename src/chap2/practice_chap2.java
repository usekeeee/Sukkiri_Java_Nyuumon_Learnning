package chap2;

public class practice_chap2 {
    public static void main(String[] args){
        //progateでやっていないコード（サンプルコード）をうちます。
    System.out.println("私の好きな記号は二重引用符(\")です");
    String prof1 ="名前：朝香あゆみ\n    (あさかあゆみ)";
    String prof2 = """
                   名前:湊祐輔
                   　　　　(みなとゆうすけ)
                   """;
    System.out.println(prof1);
    System.out.println(prof2);

    String age ="31";
    int n = Integer.parseInt(age);
    System.out.println("あなたは来年、"+(n+1)+"歳になりますね。");

    int r=new java.util.Random().nextInt(100);
    System.out.println("あなたはおそらく"+r+"歳ですよね？？");

   System.out.println("あなたの名前を入力して。");
   String name =new java.util.Scanner(System.in).nextLine();
   System.out.println("あなたの年齢を入力して。");
   int agen = new java.util.Scanner(System.in).nextInt();
   System.out.println("おいでやす"+name+"様"+ ""+"あなたの年齢は"+agen+"歳でしょう？");

   //練習問題2-1
    int z =5;
    int l =10;
    String ags ="z+lは"+z+l;
    System.out.println(ags);

   //練習問題2-3(2-2は穴埋め問題のため省きます)
        System.out.println("ようこそ占いの館へ");
        System.out.println("あなたの名前を入力してください。");
        String nametake =new java.util.Scanner(System.in).nextLine();
        System.out.println("あなたの年齢を入力してください。");
        String ageString = new java.util.Scanner(System.in).nextLine();
        int ages = Integer.parseInt(ageString);
        int fortune = new java.util.Random().nextInt(4);
        fortune ++;
        System.out.println("占いの結果がでました！");
        System.out.println(ages+"歳の"+nametake+"さん、あなたの運気番号は"+fortune+"です");
        System.out.println("(1: 大吉　2: 中吉 3:吉 4:凶)");
    }
}
