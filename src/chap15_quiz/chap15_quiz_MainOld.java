package chap15_quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class chap15_quiz_MainOld {
    public static void main(String[] args) {
        // ① 現在の日時をDate型で取得する
        Date now = new Date();

        // ② 取得した日時情報をCalendarにセットする
        Calendar c = Calendar.getInstance();
        c.setTime(now);

        // ③ Calendarから「日」の数値を取得する
        int day = c.get(Calendar.DAY_OF_MONTH);

        // ④ 取得した値に100を足した値をCalendarの「日」にセットする
        day += -10;
        c.set(Calendar.DAY_OF_MONTH, day);

        // ⑤ Calendarの日時情報をDate型に変換する
        Date future = c.getTime();

        // ⑥ SimpleDateFormatを用いて、指定された形式で表示する
        SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
        System.out.println("15-4（昔）: " + f.format(future));
    }
}