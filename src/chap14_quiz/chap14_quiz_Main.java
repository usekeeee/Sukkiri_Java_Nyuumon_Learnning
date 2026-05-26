package chap14_quiz;

public class chap14_quiz_Main {
    public static void main(String[] args) {
        chap14_quiz_bank b1 = new chap14_quiz_bank();
        b1.accountNumber = "4649";
        b1.balance = 1592;
        System.out.println(b1.toString());

        chap14_quiz_bank b2 = new chap14_quiz_bank();
        b2.accountNumber ="  4649  ";
        b2.balance = 2000;
        if(b1.equals(b2)) {
            System.out.println("【成功】同じ口座番号と判定されました！");
        }else{
            System.out.println("【失敗】違う口座と判定されてしまいました。");
        }
    }
}