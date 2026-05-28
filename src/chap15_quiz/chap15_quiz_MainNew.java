package chap15_quiz;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class chap15_quiz_MainNew {
    public static void main(String[] args) {
        // 今の日時をとって、そのまま「.plusDays(100)」で100日足すだけ！
        LocalDateTime future = LocalDateTime.now().plusDays(100);

        // 画面に出す形式を決める
        DateTimeFormatter f = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");

        // 画面にドン！
        System.out.println("15-5（今）: " + future.format(f));
    }
}