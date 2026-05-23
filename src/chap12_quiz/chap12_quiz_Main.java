package chap12_quiz;

public class chap12_quiz_Main {
    public static void main(String args[]){
        chap12_quiz_Y[] array = new chap12_quiz_Y[2];

        array[0] = new chap12_quiz_A();
        array[1] = new chap12_quiz_B();
        for(chap12_quiz_Y y : array){
            y.b();
        }
    }
}
