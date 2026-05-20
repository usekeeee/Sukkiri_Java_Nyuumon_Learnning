package chap9_quiz;

public class chap9_quiz_Main {
    public static void main(String[] args){
        chap9_quiz_Thief s1 =new chap9_quiz_Thief("アサカ",40,50);
        System.out.println("1"+s1.name+"(HP:"+s1.hp+"/MP:"+s1.mp+")");
        chap9_quiz_Thief s2 = new chap9_quiz_Thief("ハイン",45);
        System.out.println("2"+s2.name+"(HP:"+s2.hp+"/MP:"+s2.mp+")");
        chap9_quiz_Thief s3 = new chap9_quiz_Thief("ザク");
        System.out.println("3"+s3.name+"(HP:"+s3.hp+"/MP:"+s3.mp+")");
        chap9_quiz_Thief s4 =new chap9_quiz_Thief();
        System.out.println("4"+s4.name+"(HP:"+s4.hp+"/MP:"+s4.mp+")");
    }
}
