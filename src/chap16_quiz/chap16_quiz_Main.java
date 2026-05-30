package chap16_quiz;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


public class chap16_quiz_Main {
    public static void main(String[] args) {
        ArrayList<chap16_quiz_Hero> heroes = new ArrayList<>();
        chap16_quiz_Hero h1 = new chap16_quiz_Hero("斎藤");
        heroes.add(h1);
        chap16_quiz_Hero h2 = new chap16_quiz_Hero("鈴木");
        heroes.add(h2);
        for (chap16_quiz_Hero h : heroes) {
            System.out.println(h.getName());
        }
        Map<chap16_quiz_Hero,Integer> kills = new HashMap<>();
        kills.put(h1,3);
        kills.put(h2,7);
        for(chap16_quiz_Hero h : kills.keySet()){
            int count = kills.get(h);
            System.out.println(h.getName()+"が倒した敵="+count);
        }
    }
}
