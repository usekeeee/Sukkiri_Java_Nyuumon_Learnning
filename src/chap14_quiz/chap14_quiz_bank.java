package chap14_quiz;

public class chap14_quiz_bank {
    String accountNumber;
    int balance;
    public String toString(){
        return "\\"+this.balance+"(口座番号:" +this.accountNumber+")";
    }
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o instanceof chap14_quiz_bank){
            chap14_quiz_bank target = (chap14_quiz_bank) o;
            String myNumber = this.accountNumber.trim();
            String targetNumber = target.accountNumber.trim();
            if(myNumber.equals(targetNumber)){
                return true;
            }
        }
        return false;
    }
}
